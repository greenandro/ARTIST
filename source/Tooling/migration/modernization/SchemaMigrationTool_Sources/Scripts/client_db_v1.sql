USE [master]
GO
/****** Object:  Database [SPTG_ClientDb]    Script Date: 9/04/2015 12:50:48 ******/
CREATE DATABASE [SPTG_ClientDb]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'SPTG_ClientDb', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\SPTG_ClientDb.mdf' , SIZE = 4160KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'SPTG_ClientDb_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.MSSQLSERVER\MSSQL\DATA\SPTG_ClientDb_log.ldf' , SIZE = 1344KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [SPTG_ClientDb] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [SPTG_ClientDb].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [SPTG_ClientDb] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET ARITHABORT OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [SPTG_ClientDb] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [SPTG_ClientDb] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [SPTG_ClientDb] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET  ENABLE_BROKER 
GO
ALTER DATABASE [SPTG_ClientDb] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [SPTG_ClientDb] SET READ_COMMITTED_SNAPSHOT ON 
GO
ALTER DATABASE [SPTG_ClientDb] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET RECOVERY FULL 
GO
ALTER DATABASE [SPTG_ClientDb] SET  MULTI_USER 
GO
ALTER DATABASE [SPTG_ClientDb] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [SPTG_ClientDb] SET DB_CHAINING OFF 
GO
ALTER DATABASE [SPTG_ClientDb] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [SPTG_ClientDb] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [SPTG_ClientDb]
GO
/****** Object:  Schema [admin]    Script Date: 9/04/2015 12:50:48 ******/
CREATE SCHEMA [admin]
GO
/****** Object:  Schema [config]    Script Date: 9/04/2015 12:50:48 ******/
CREATE SCHEMA [config]
GO
/****** Object:  Schema [social]    Script Date: 9/04/2015 12:50:48 ******/
CREATE SCHEMA [social]
GO
/****** Object:  Schema [workflow]    Script Date: 9/04/2015 12:50:48 ******/
CREATE SCHEMA [workflow]
GO
/****** Object:  StoredProcedure [dbo].[sp_dequeueWorkflowItem]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[sp_dequeueWorkflowItem]
	@applicationId uniqueidentifier
as
  set nocount on;
  with cte as (
    select top(1) Payload
      from [workflow].WorkflowQueueItems with (rowlock, readpast)
      where ApplicationId = @applicationId
    order by Id)
  delete from cte
    output deleted.Payload;

GO
/****** Object:  StoredProcedure [dbo].[sp_releaseWorkflowInstanceLock]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[sp_releaseWorkflowInstanceLock]
	@workflowInstanceId uniqueidentifier
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	DELETE FROM [workflow].WorkflowInstanceLocks WHERE WorkflowInstanceId = @workflowInstanceId
END
GO
/****** Object:  StoredProcedure [dbo].[sp_requestWorkflowInstanceLock]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].[sp_requestWorkflowInstanceLock]
	@workflowInstanceId uniqueidentifier
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	SET TRANSACTION ISOLATION LEVEL REPEATABLE READ
    BEGIN TRAN 
    
	DECLARE @lockedWorkflowInstanceId int
	DECLARE @lockIsAssigned bit
	
	SET @lockIsAssigned = 0
	
	SELECT @lockedWorkflowInstanceId = COUNT(WorkflowInstanceId)
	FROM [workflow].[WorkflowInstanceLocks]
	WHERE WorkflowInstanceId = @workflowInstanceId
    
    IF (@lockedWorkflowInstanceId = 0)
    BEGIN
		DECLARE @now datetime
		SET @now = GETUTCDATE()
		
		INSERT [workflow].WorkflowInstanceLocks (WorkflowInstanceId, LockedOn) VALUES (@workflowInstanceId, @now)
		
		SET @lockIsAssigned = 1
    END
    
    SELECT @lockIsAssigned AS LockIsAssigned
    
    COMMIT TRAN
END
GO
/****** Object:  Table [admin].[GroupMembers]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [admin].[GroupMembers](
	[Id] [uniqueidentifier] NOT NULL,
	[UserGroupId] [uniqueidentifier] NOT NULL,
	[UserAccountId] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_admin.GroupMembers] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [admin].[Groups]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [admin].[Groups](
	[Id] [uniqueidentifier] NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[HostApplicationId] [uniqueidentifier] NOT NULL,
	[Type] [int] NOT NULL,
	[IsActive] [bit] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_admin.Groups] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [admin].[SecurityDefinitionAssociations]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [admin].[SecurityDefinitionAssociations](
	[Id] [uniqueidentifier] NOT NULL,
	[PrincipalId] [uniqueidentifier] NOT NULL,
	[SecurityDefinitionId] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_admin.SecurityDefinitionAssociations] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [admin].[SecurityDefinitions]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [admin].[SecurityDefinitions](
	[Id] [uniqueidentifier] NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[BasePermissions] [int] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
	[Group_Id] [uniqueidentifier] NULL,
 CONSTRAINT [PK_admin.SecurityDefinitions] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [config].[RoleConfigurations]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [config].[RoleConfigurations](
	[Id] [uniqueidentifier] NOT NULL,
	[RoleId] [uniqueidentifier] NOT NULL,
	[ConditionId] [uniqueidentifier] NOT NULL,
	[WorkflowAssociationId] [uniqueidentifier] NOT NULL,
	[RoleName] [nvarchar](max) NULL,
	[RoleDescription] [nvarchar](max) NULL,
	[ConditionAsText] [nvarchar](max) NULL,
	[ConditionHash] [nvarchar](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_config.RoleConfigurations] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [config].[RoleUserAccounts]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [config].[RoleUserAccounts](
	[Id] [uniqueidentifier] NOT NULL,
	[RoleConfigurationId] [uniqueidentifier] NOT NULL,
	[RoleUserAccountId] [uniqueidentifier] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_config.RoleUserAccounts] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[__MigrationHistory]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[__MigrationHistory](
	[MigrationId] [nvarchar](150) NOT NULL,
	[ContextKey] [nvarchar](300) NOT NULL,
	[Model] [varbinary](max) NOT NULL,
	[ProductVersion] [nvarchar](32) NOT NULL,
 CONSTRAINT [PK_dbo.__MigrationHistory] PRIMARY KEY CLUSTERED 
(
	[MigrationId] ASC,
	[ContextKey] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ClientSettings]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ClientSettings](
	[Id] [uniqueidentifier] NOT NULL,
	[Name] [nvarchar](max) NULL,
	[Value] [nvarchar](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_dbo.ClientSettings] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[InvitationRequests]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[InvitationRequests](
	[Id] [uniqueidentifier] NOT NULL,
	[BatchId] [uniqueidentifier] NOT NULL,
	[IsMemberOfOrganization] [bit] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[ActivationToken] [nvarchar](max) NULL,
	[IdentityType] [int] NOT NULL,
	[LoginName] [nvarchar](max) NULL,
	[FullName] [nvarchar](max) NULL,
	[Email] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_dbo.InvitationRequests] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Teams]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Teams](
	[Id] [uniqueidentifier] NOT NULL,
	[Members] [nvarchar](max) NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[Type] [int] NOT NULL,
	[CreatedById] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[ACL] [nvarchar](max) NULL,
	[SecurityScope] [int] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_dbo.Teams] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [social].[ActivityEventAudienceList]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [social].[ActivityEventAudienceList](
	[Id] [uniqueidentifier] NOT NULL,
	[UserAccountId] [uniqueidentifier] NOT NULL,
	[MarkedAsRead] [bit] NOT NULL,
	[ShowInPersonalActivityFeed] [bit] NOT NULL,
	[ActivityEventId] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_social.ActivityEventAudienceList] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [social].[ActivityEvents]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [social].[ActivityEvents](
	[Id] [uniqueidentifier] NOT NULL,
	[TemplateId] [uniqueidentifier] NOT NULL,
	[AudienceType] [int] NOT NULL,
	[MarkAsReadAfter] [datetime] NULL,
	[Path] [nvarchar](max) NULL,
	[PartitionId] [uniqueidentifier] NULL,
	[ParentObjectId] [uniqueidentifier] NULL,
	[ObjectId] [uniqueidentifier] NULL,
	[TemplateType] [int] NOT NULL,
	[TemplateResourceKey] [nvarchar](max) NULL,
	[PersonalTemplateResourceKey] [nvarchar](max) NULL,
	[Parameters] [nvarchar](max) NULL,
	[InitiatedBy] [uniqueidentifier] NULL,
	[ShowInRecentActivityFeed] [bit] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[ACL] [nvarchar](max) NULL,
	[SecurityScope] [int] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_social.ActivityEvents] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [social].[ActivityEventTemplates]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [social].[ActivityEventTemplates](
	[Id] [uniqueidentifier] NOT NULL,
	[TemplateType] [int] NOT NULL,
	[TemplateResourceKey] [nvarchar](max) NULL,
	[PersonalTemplateResourceKey] [nvarchar](max) NULL,
	[MarkAsReadExpirationPeriod] [bigint] NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_social.ActivityEventTemplates] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [social].[Comments]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [social].[Comments](
	[Id] [uniqueidentifier] NOT NULL,
	[CreatedBy] [nvarchar](max) NOT NULL,
	[Body] [nvarchar](max) NOT NULL,
	[RelatedObjectId] [uniqueidentifier] NULL,
	[RelatedObjectType] [int] NOT NULL,
	[CommentType1] [int] NOT NULL,
	[CommentType] [int] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_social.Comments] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[ActivityTraces]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[ActivityTraces](
	[Id] [uniqueidentifier] NOT NULL,
	[ActivityInstanceId] [uniqueidentifier] NOT NULL,
	[WorkflowInstanceId] [uniqueidentifier] NOT NULL,
	[ActivityId] [uniqueidentifier] NOT NULL,
	[ActivityInternalName] [nvarchar](max) NOT NULL,
	[ActivityDisplayName] [nvarchar](max) NULL,
	[ActivityDescription] [nvarchar](max) NULL,
	[ActivityType] [nvarchar](max) NULL,
	[StartTime] [datetime] NOT NULL,
	[EndTime] [datetime] NULL,
	[Outcome] [nvarchar](max) NULL,
	[Status] [nvarchar](max) NULL,
	[InitiatedByNotificationSubscription] [nvarchar](max) NULL,
	[OriginatingActivityInstanceID] [uniqueidentifier] NOT NULL,
	[ExecutedByRole] [nvarchar](max) NULL,
	[WorkflowContainer] [nvarchar](max) NULL,
	[SLATicks] [bigint] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.ActivityTraces] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[Challenges]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[Challenges](
	[Id] [uniqueidentifier] NOT NULL,
	[Title] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[Reward] [nvarchar](max) NULL,
	[WorkflowInstanceId] [uniqueidentifier] NULL,
	[DueDate] [datetime] NULL,
	[CreatedBy] [uniqueidentifier] NOT NULL,
	[Responsibles] [nvarchar](max) NULL,
	[Status] [int] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[ACL] [nvarchar](max) NULL,
	[SecurityScope] [int] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.Challenges] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[ContentTypeMappings]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[ContentTypeMappings](
	[Id] [uniqueidentifier] NOT NULL,
	[MasterContentTypeId] [nvarchar](max) NULL,
	[ClientContentTypeId] [nvarchar](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.ContentTypeMappings] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[Tasks]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [workflow].[Tasks](
	[Id] [uniqueidentifier] NOT NULL,
	[TaskType] [nvarchar](max) NULL,
	[ActivityInstanceId] [uniqueidentifier] NOT NULL,
	[WorkflowInstanceId] [uniqueidentifier] NULL,
	[AssignedTo] [varchar](max) NOT NULL,
	[Title] [nvarchar](max) NULL,
	[Description] [nvarchar](max) NULL,
	[Status] [int] NOT NULL,
	[AllowDelegation] [bit] NOT NULL,
	[AllowLazyTaskExecution] [bit] NOT NULL,
	[ExecutedBy] [nvarchar](max) NULL,
	[StartTime] [datetime] NOT NULL,
	[EndTime] [datetime] NULL,
	[AllowedOutcomes] [nvarchar](max) NULL,
	[Outcome] [nvarchar](max) NULL,
	[DueDate] [datetime] NULL,
	[DueDateSetByUser] [bit] NOT NULL,
	[Flagged] [bit] NOT NULL,
	[Role] [nvarchar](max) NULL,
	[CreatedBy] [nvarchar](max) NULL,
	[PickedBy] [nvarchar](max) NULL,
	[LatestComment] [nvarchar](max) NULL,
	[TotalComments] [int] NOT NULL,
	[RoleMembers] [nvarchar](max) NULL,
	[IsWorkflowTask] [bit] NOT NULL,
	[ControlsFlow] [bit] NOT NULL,
	[IsOwnedByHostApplication] [bit] NOT NULL,
	[HostApplicationTaskEditUrl] [nvarchar](max) NULL,
	[HostUrl] [nvarchar](max) NULL,
	[ChallengeId] [uniqueidentifier] NULL,
	[CustomProperties] [varbinary](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[ACL] [nvarchar](max) NULL,
	[SecurityScope] [int] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.Tasks] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [workflow].[TaskSyncMappings]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[TaskSyncMappings](
	[Id] [uniqueidentifier] NOT NULL,
	[ActivityInstanceId] [uniqueidentifier] NOT NULL,
	[HostApplicationTaskId] [nvarchar](max) NULL,
	[OwnedByHostApplication] [bit] NOT NULL,
	[TaskSyncId] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.TaskSyncMappings] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[TaskSyncs]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[TaskSyncs](
	[Id] [uniqueidentifier] NOT NULL,
	[WorkflowInstanceId] [uniqueidentifier] NOT NULL,
	[HostApplicationId] [uniqueidentifier] NOT NULL,
	[ApplicationType] [int] NOT NULL,
	[ListId] [uniqueidentifier] NOT NULL,
	[IsDefault] [bit] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.TaskSyncs] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[TaskTraces]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[TaskTraces](
	[Id] [uniqueidentifier] NOT NULL,
	[TaskId] [uniqueidentifier] NOT NULL,
	[ActivityInstanceId] [uniqueidentifier] NOT NULL,
	[Status] [nvarchar](max) NULL,
	[Outcome] [nvarchar](max) NULL,
	[StartTime] [datetime] NOT NULL,
	[EndTime] [datetime] NULL,
	[AssignedTo] [nvarchar](max) NULL,
	[AssignedToDisplayName] [nvarchar](max) NULL,
	[ExecutedBy] [nvarchar](max) NULL,
	[ExecutedByDisplayName] [nvarchar](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.TaskTraces] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[WorkflowAssociations]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[WorkflowAssociations](
	[Id] [uniqueidentifier] NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Active] [bit] NOT NULL,
	[AssociationItemIdentifier] [nvarchar](max) NULL,
	[AssociationItemTitle] [nvarchar](max) NULL,
	[AssociationType] [int] NOT NULL,
	[StartWorkflowOnItemCreated] [bit] NOT NULL,
	[StartWorkflowOnItemUpdated] [bit] NOT NULL,
	[StartWorkflowManual] [bit] NOT NULL,
	[DeployedWorkflowRuntimeConfigurationInfoId] [uniqueidentifier] NOT NULL,
	[WorkflowRuntimeConfigurationInfoId] [uniqueidentifier] NOT NULL,
	[HostApplicationId] [uniqueidentifier] NULL,
	[InternalStatusFieldId] [uniqueidentifier] NOT NULL,
	[ExternalStatusFieldId] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[ACL] [nvarchar](max) NULL,
	[SecurityScope] [int] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.WorkflowAssociations] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[WorkflowInstanceLocks]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[WorkflowInstanceLocks](
	[WorkflowInstanceId] [uniqueidentifier] NOT NULL,
	[LockedOn] [datetime] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
 CONSTRAINT [PK_workflow.WorkflowInstanceLocks] PRIMARY KEY CLUSTERED 
(
	[WorkflowInstanceId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[WorkflowInstances]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[WorkflowInstances](
	[Id] [uniqueidentifier] NOT NULL,
	[WorkflowInstanceId] [uniqueidentifier] NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[WorkflowRuntimeConfigurationInfoId] [uniqueidentifier] NOT NULL,
	[WorkflowAssociationId] [uniqueidentifier] NULL,
	[DateStarted] [datetime] NOT NULL,
	[DateEnded] [datetime] NULL,
	[StartedBy] [nvarchar](max) NULL,
	[ExternalStatus] [nvarchar](max) NULL,
	[InternalStatus] [nvarchar](max) NULL,
	[HostUrl] [nvarchar](max) NULL,
	[ItemURL] [nvarchar](max) NULL,
	[ItemTitle] [nvarchar](max) NULL,
	[ListUniqueId] [uniqueidentifier] NOT NULL,
	[ItemUniqueId] [uniqueidentifier] NOT NULL,
	[ItemId] [int] NULL,
	[ErrorMessage] [nvarchar](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[ACL] [nvarchar](max) NULL,
	[SecurityScope] [int] NOT NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.WorkflowInstances] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[WorkflowQueueItems]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [workflow].[WorkflowQueueItems](
	[Id] [uniqueidentifier] NOT NULL,
	[Payload] [varbinary](max) NULL,
	[WorkflowInstanceId] [uniqueidentifier] NOT NULL,
	[ApplicationId] [uniqueidentifier] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.WorkflowQueueItems] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [workflow].[WorkflowRuntimeConfigurations]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[WorkflowRuntimeConfigurations](
	[Id] [uniqueidentifier] NOT NULL,
	[WorkflowId] [uniqueidentifier] NOT NULL,
	[ConfigurationId] [uniqueidentifier] NOT NULL,
	[Title] [nvarchar](max) NOT NULL,
	[Version] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[Target] [int] NOT NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
	[Discriminator] [nvarchar](128) NOT NULL,
 CONSTRAINT [PK_workflow.WorkflowRuntimeConfigurations] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [workflow].[WorkflowTraces]    Script Date: 9/04/2015 12:50:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [workflow].[WorkflowTraces](
	[Id] [uniqueidentifier] NOT NULL,
	[WorkflowInstanceId] [uniqueidentifier] NOT NULL,
	[WorkflowId] [uniqueidentifier] NOT NULL,
	[WorkflowConfigurationId] [uniqueidentifier] NOT NULL,
	[WorkflowTitle] [nvarchar](max) NULL,
	[WorkflowDescription] [nvarchar](max) NULL,
	[WorkflowVersion] [nvarchar](max) NULL,
	[InternalStatus] [nvarchar](max) NULL,
	[ExternalStatus] [nvarchar](max) NULL,
	[InitiatedBy] [nvarchar](max) NULL,
	[InitiatedByDisplayName] [nvarchar](max) NULL,
	[StartTime] [datetime] NOT NULL,
	[SLATicks] [bigint] NOT NULL,
	[EndTime] [datetime] NULL,
	[WorkflowData] [nvarchar](max) NULL,
	[TenantId] [nvarchar](max) NULL,
	[DateCreated] [datetime] NOT NULL,
	[DateChanged] [datetime] NULL,
 CONSTRAINT [PK_workflow.WorkflowTraces] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Index [IX_UserGroupId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_UserGroupId] ON [admin].[GroupMembers]
(
	[UserGroupId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_SecurityDefinitionId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_SecurityDefinitionId] ON [admin].[SecurityDefinitionAssociations]
(
	[SecurityDefinitionId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_Group_Id]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_Group_Id] ON [admin].[SecurityDefinitions]
(
	[Group_Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_WorkflowAssociationId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_WorkflowAssociationId] ON [config].[RoleConfigurations]
(
	[WorkflowAssociationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_RoleConfigurationId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_RoleConfigurationId] ON [config].[RoleUserAccounts]
(
	[RoleConfigurationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_ActivityEventId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_ActivityEventId] ON [social].[ActivityEventAudienceList]
(
	[ActivityEventId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_TemplateId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_TemplateId] ON [social].[ActivityEvents]
(
	[TemplateId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_WorkflowInstanceId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_WorkflowInstanceId] ON [workflow].[Challenges]
(
	[WorkflowInstanceId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_ChallengeId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_ChallengeId] ON [workflow].[Tasks]
(
	[ChallengeId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_WorkflowInstanceId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_WorkflowInstanceId] ON [workflow].[Tasks]
(
	[WorkflowInstanceId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_TaskSyncId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_TaskSyncId] ON [workflow].[TaskSyncMappings]
(
	[TaskSyncId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_DeployedWorkflowRuntimeConfigurationInfoId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_DeployedWorkflowRuntimeConfigurationInfoId] ON [workflow].[WorkflowAssociations]
(
	[DeployedWorkflowRuntimeConfigurationInfoId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_WorkflowRuntimeConfigurationInfoId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_WorkflowRuntimeConfigurationInfoId] ON [workflow].[WorkflowAssociations]
(
	[WorkflowRuntimeConfigurationInfoId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_WorkflowAssociationId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_WorkflowAssociationId] ON [workflow].[WorkflowInstances]
(
	[WorkflowAssociationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
/****** Object:  Index [IX_WorkflowRuntimeConfigurationInfoId]    Script Date: 9/04/2015 12:50:48 ******/
CREATE NONCLUSTERED INDEX [IX_WorkflowRuntimeConfigurationInfoId] ON [workflow].[WorkflowInstances]
(
	[WorkflowRuntimeConfigurationInfoId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, DROP_EXISTING = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
GO
ALTER TABLE [admin].[GroupMembers]  WITH CHECK ADD  CONSTRAINT [FK_admin.GroupMembers_admin.Groups_UserGroupId] FOREIGN KEY([UserGroupId])
REFERENCES [admin].[Groups] ([Id])
GO
ALTER TABLE [admin].[GroupMembers] CHECK CONSTRAINT [FK_admin.GroupMembers_admin.Groups_UserGroupId]
GO
ALTER TABLE [admin].[SecurityDefinitionAssociations]  WITH CHECK ADD  CONSTRAINT [FK_admin.SecurityDefinitionAssociations_admin.SecurityDefinitions_SecurityDefinitionId] FOREIGN KEY([SecurityDefinitionId])
REFERENCES [admin].[SecurityDefinitions] ([Id])
GO
ALTER TABLE [admin].[SecurityDefinitionAssociations] CHECK CONSTRAINT [FK_admin.SecurityDefinitionAssociations_admin.SecurityDefinitions_SecurityDefinitionId]
GO
ALTER TABLE [admin].[SecurityDefinitions]  WITH CHECK ADD  CONSTRAINT [FK_admin.SecurityDefinitions_admin.Groups_Group_Id] FOREIGN KEY([Group_Id])
REFERENCES [admin].[Groups] ([Id])
GO
ALTER TABLE [admin].[SecurityDefinitions] CHECK CONSTRAINT [FK_admin.SecurityDefinitions_admin.Groups_Group_Id]
GO
ALTER TABLE [config].[RoleConfigurations]  WITH CHECK ADD  CONSTRAINT [FK_config.RoleConfigurations_workflow.WorkflowAssociations_WorkflowAssociationId] FOREIGN KEY([WorkflowAssociationId])
REFERENCES [workflow].[WorkflowAssociations] ([Id])
GO
ALTER TABLE [config].[RoleConfigurations] CHECK CONSTRAINT [FK_config.RoleConfigurations_workflow.WorkflowAssociations_WorkflowAssociationId]
GO
ALTER TABLE [config].[RoleUserAccounts]  WITH CHECK ADD  CONSTRAINT [FK_config.RoleUserAccounts_config.RoleConfigurations_RoleConfigurationId] FOREIGN KEY([RoleConfigurationId])
REFERENCES [config].[RoleConfigurations] ([Id])
GO
ALTER TABLE [config].[RoleUserAccounts] CHECK CONSTRAINT [FK_config.RoleUserAccounts_config.RoleConfigurations_RoleConfigurationId]
GO
ALTER TABLE [social].[ActivityEventAudienceList]  WITH CHECK ADD  CONSTRAINT [FK_social.ActivityEventAudienceList_social.ActivityEvents_ActivityEventId] FOREIGN KEY([ActivityEventId])
REFERENCES [social].[ActivityEvents] ([Id])
GO
ALTER TABLE [social].[ActivityEventAudienceList] CHECK CONSTRAINT [FK_social.ActivityEventAudienceList_social.ActivityEvents_ActivityEventId]
GO
ALTER TABLE [social].[ActivityEvents]  WITH CHECK ADD  CONSTRAINT [FK_social.ActivityEvents_social.ActivityEventTemplates_TemplateId] FOREIGN KEY([TemplateId])
REFERENCES [social].[ActivityEventTemplates] ([Id])
GO
ALTER TABLE [social].[ActivityEvents] CHECK CONSTRAINT [FK_social.ActivityEvents_social.ActivityEventTemplates_TemplateId]
GO
ALTER TABLE [workflow].[Challenges]  WITH CHECK ADD  CONSTRAINT [FK_workflow.Challenges_workflow.WorkflowInstances_WorkflowInstanceId] FOREIGN KEY([WorkflowInstanceId])
REFERENCES [workflow].[WorkflowInstances] ([Id])
GO
ALTER TABLE [workflow].[Challenges] CHECK CONSTRAINT [FK_workflow.Challenges_workflow.WorkflowInstances_WorkflowInstanceId]
GO
ALTER TABLE [workflow].[Tasks]  WITH CHECK ADD  CONSTRAINT [FK_workflow.Tasks_workflow.Challenges_ChallengeId] FOREIGN KEY([ChallengeId])
REFERENCES [workflow].[Challenges] ([Id])
GO
ALTER TABLE [workflow].[Tasks] CHECK CONSTRAINT [FK_workflow.Tasks_workflow.Challenges_ChallengeId]
GO
ALTER TABLE [workflow].[Tasks]  WITH CHECK ADD  CONSTRAINT [FK_workflow.Tasks_workflow.WorkflowInstances_WorkflowInstanceId] FOREIGN KEY([WorkflowInstanceId])
REFERENCES [workflow].[WorkflowInstances] ([Id])
GO
ALTER TABLE [workflow].[Tasks] CHECK CONSTRAINT [FK_workflow.Tasks_workflow.WorkflowInstances_WorkflowInstanceId]
GO
ALTER TABLE [workflow].[TaskSyncMappings]  WITH CHECK ADD  CONSTRAINT [FK_workflow.TaskSyncMappings_workflow.TaskSyncs_TaskSyncId] FOREIGN KEY([TaskSyncId])
REFERENCES [workflow].[TaskSyncs] ([Id])
GO
ALTER TABLE [workflow].[TaskSyncMappings] CHECK CONSTRAINT [FK_workflow.TaskSyncMappings_workflow.TaskSyncs_TaskSyncId]
GO
ALTER TABLE [workflow].[WorkflowAssociations]  WITH CHECK ADD  CONSTRAINT [FK_workflow.WorkflowAssociations_workflow.WorkflowRuntimeConfigurations_DeployedWorkflowRuntimeConfigurationInfoId] FOREIGN KEY([DeployedWorkflowRuntimeConfigurationInfoId])
REFERENCES [workflow].[WorkflowRuntimeConfigurations] ([Id])
GO
ALTER TABLE [workflow].[WorkflowAssociations] CHECK CONSTRAINT [FK_workflow.WorkflowAssociations_workflow.WorkflowRuntimeConfigurations_DeployedWorkflowRuntimeConfigurationInfoId]
GO
ALTER TABLE [workflow].[WorkflowAssociations]  WITH CHECK ADD  CONSTRAINT [FK_workflow.WorkflowAssociations_workflow.WorkflowRuntimeConfigurations_WorkflowRuntimeConfigurationInfoId] FOREIGN KEY([WorkflowRuntimeConfigurationInfoId])
REFERENCES [workflow].[WorkflowRuntimeConfigurations] ([Id])
GO
ALTER TABLE [workflow].[WorkflowAssociations] CHECK CONSTRAINT [FK_workflow.WorkflowAssociations_workflow.WorkflowRuntimeConfigurations_WorkflowRuntimeConfigurationInfoId]
GO
ALTER TABLE [workflow].[WorkflowInstances]  WITH CHECK ADD  CONSTRAINT [FK_workflow.WorkflowInstances_workflow.WorkflowAssociations_WorkflowAssociationId] FOREIGN KEY([WorkflowAssociationId])
REFERENCES [workflow].[WorkflowAssociations] ([Id])
GO
ALTER TABLE [workflow].[WorkflowInstances] CHECK CONSTRAINT [FK_workflow.WorkflowInstances_workflow.WorkflowAssociations_WorkflowAssociationId]
GO
ALTER TABLE [workflow].[WorkflowInstances]  WITH CHECK ADD  CONSTRAINT [FK_workflow.WorkflowInstances_workflow.WorkflowRuntimeConfigurations_WorkflowRuntimeConfigurationInfoId] FOREIGN KEY([WorkflowRuntimeConfigurationInfoId])
REFERENCES [workflow].[WorkflowRuntimeConfigurations] ([Id])
GO
ALTER TABLE [workflow].[WorkflowInstances] CHECK CONSTRAINT [FK_workflow.WorkflowInstances_workflow.WorkflowRuntimeConfigurations_WorkflowRuntimeConfigurationInfoId]
GO
USE [master]
GO
ALTER DATABASE [SPTG_ClientDb] SET  READ_WRITE 
GO
