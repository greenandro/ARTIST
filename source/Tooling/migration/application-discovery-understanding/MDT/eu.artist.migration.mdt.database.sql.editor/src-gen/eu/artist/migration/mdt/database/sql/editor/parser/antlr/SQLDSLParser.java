/*
* generated by Xtext
*/
package eu.artist.migration.mdt.database.sql.editor.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import eu.artist.migration.mdt.database.sql.editor.services.SQLDSLGrammarAccess;

public class SQLDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SQLDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected eu.artist.migration.mdt.database.sql.editor.parser.antlr.internal.InternalSQLDSLParser createParser(XtextTokenStream stream) {
		return new eu.artist.migration.mdt.database.sql.editor.parser.antlr.internal.InternalSQLDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public SQLDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SQLDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
