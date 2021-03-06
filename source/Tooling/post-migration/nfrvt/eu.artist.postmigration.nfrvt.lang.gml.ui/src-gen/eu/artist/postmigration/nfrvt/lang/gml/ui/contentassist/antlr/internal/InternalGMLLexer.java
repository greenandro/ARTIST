package eu.artist.postmigration.nfrvt.lang.gml.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGMLLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=8;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int RULE_SMALL_DECIMAL=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_EBIGDECIMAL=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__44=44;
    public static final int T__82=82;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_NULL=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=5;
    public static final int RULE_EBOOLEAN=10;
    public static final int RULE_DATE_TIME=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__76=76;
    public static final int RULE_WS=15;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalGMLLexer() {;} 
    public InternalGMLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGMLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:11:7: ( '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:12:7: ( ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:13:7: ( 'or' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:13:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:14:7: ( '||' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:14:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15:7: ( 'xor' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:16:7: ( '^' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:16:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:17:7: ( 'and' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:17:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:18:7: ( '&&' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:18:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:19:7: ( '=>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:19:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:20:7: ( '->' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:20:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:21:7: ( '!=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:21:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:22:7: ( '<>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:22:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:23:7: ( '!' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:23:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:24:7: ( 'not' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:24:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:25:7: ( 'required' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:25:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:26:7: ( 'offered' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:26:9: 'offered'
            {
            match("offered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:27:7: ( 'contract' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:27:9: 'contract'
            {
            match("contract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:28:7: ( 'goalmodel' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:28:9: 'goalmodel'
            {
            match("goalmodel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:29:7: ( '{' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:29:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:30:7: ( 'workloads' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:30:9: 'workloads'
            {
            match("workloads"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:31:7: ( '[' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:31:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:32:7: ( ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:32:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:33:7: ( 'applied-properties' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:33:9: 'applied-properties'
            {
            match("applied-properties"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:34:7: ( 'goals' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:34:9: 'goals'
            {
            match("goals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:35:7: ( '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:35:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:36:7: ( ',' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:37:7: ( 'activity' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:37:9: 'activity'
            {
            match("activity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:38:7: ( 'pattern' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:38:9: 'pattern'
            {
            match("pattern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:39:7: ( 'qualitative' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:39:9: 'qualitative'
            {
            match("qualitative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:40:7: ( 'property' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:40:9: 'property'
            {
            match("property"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:41:7: ( 'context' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:41:9: 'context'
            {
            match("context"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:42:7: ( 'quantitative' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:42:9: 'quantitative'
            {
            match("quantitative"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:43:7: ( 'function' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:43:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:44:7: ( 'workload' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:44:9: 'workload'
            {
            match("workload"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:45:7: ( 'softgoal' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:45:9: 'softgoal'
            {
            match("softgoal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:46:7: ( 'kind' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:46:9: 'kind'
            {
            match("kind"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:47:7: ( 'priority' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:47:9: 'priority'
            {
            match("priority"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:48:7: ( '$' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:48:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:49:7: ( 'threshold' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:49:9: 'threshold'
            {
            match("threshold"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:50:7: ( 'impacts' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:50:9: 'impacts'
            {
            match("impacts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:51:7: ( 'hardgoal' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:51:9: 'hardgoal'
            {
            match("hardgoal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:52:7: ( 'condition' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:52:9: 'condition'
            {
            match("condition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:53:7: ( 'successRate' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:53:9: 'successRate'
            {
            match("successRate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:54:7: ( 'composite' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:54:9: 'composite'
            {
            match("composite"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:55:7: ( '=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:55:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:56:7: ( '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:56:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:57:7: ( '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:57:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:58:7: ( '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:58:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:59:7: ( '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:59:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:60:7: ( '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:60:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:61:7: ( '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:61:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:62:7: ( '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:62:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:63:7: ( '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:63:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:64:7: ( '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:64:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:65:7: ( '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:65:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:66:7: ( 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:66:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:67:7: ( 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:67:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:68:7: ( 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:68:9: 'avg'
            {
            match("avg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:69:7: ( 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:69:9: 'sum'
            {
            match("sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:70:7: ( 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:70:9: 'exp'
            {
            match("exp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:71:7: ( 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:71:9: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:72:7: ( 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:72:9: 'ln'
            {
            match("ln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:73:7: ( 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:73:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:74:7: ( '.' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:74:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:75:7: ( '.*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:75:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:76:7: ( 'import' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:76:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "RULE_EBOOLEAN"
    public final void mRULE_EBOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_EBOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15668:15: ( ( 'true' | 'false' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15668:17: ( 'true' | 'false' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15668:17: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15668:18: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15668:25: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EBOOLEAN"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15670:11: ( 'null' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15670:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15672:10: ( ( '0' .. '9' )+ )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15672:12: ( '0' .. '9' )+
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15672:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15672:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_POSITIVE_SMALL_DECIMAL"
    public final void mRULE_POSITIVE_SMALL_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_POSITIVE_SMALL_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:29: ( ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:31: ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:31: ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '1':
                {
                alt8=1;
                }
                break;
            case '0':
                {
                alt8=2;
                }
                break;
            case '.':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:32: '1' ( '.' ( '0' )+ )?
                    {
                    match('1'); 
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:36: ( '.' ( '0' )+ )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:37: '.' ( '0' )+
                            {
                            match('.'); 
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:41: ( '0' )+
                            int cnt3=0;
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0=='0') ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:41: '0'
                            	    {
                            	    match('0'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt3 >= 1 ) break loop3;
                                        EarlyExitException eee =
                                            new EarlyExitException(3, input);
                                        throw eee;
                                }
                                cnt3++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:48: '0' ( '.' ( '0' .. '9' )+ )?
                    {
                    match('0'); 
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:52: ( '.' ( '0' .. '9' )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:53: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:57: ( '0' .. '9' )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:58: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt5 >= 1 ) break loop5;
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:71: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:75: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15674:76: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSITIVE_SMALL_DECIMAL"

    // $ANTLR start "RULE_SMALL_DECIMAL"
    public final void mRULE_SMALL_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_SMALL_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15676:20: ( ( '+' | '-' )? RULE_POSITIVE_SMALL_DECIMAL )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15676:22: ( '+' | '-' )? RULE_POSITIVE_SMALL_DECIMAL
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15676:22: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_POSITIVE_SMALL_DECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SMALL_DECIMAL"

    // $ANTLR start "RULE_EBIGDECIMAL"
    public final void mRULE_EBIGDECIMAL() throws RecognitionException {
        try {
            int _type = RULE_EBIGDECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:18: ( ( '+' | '-' )? ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:20: ( '+' | '-' )? ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:20: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:31: ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:32: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:41: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15678:54: RULE_INT '.' RULE_INT
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EBIGDECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15680:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00A7' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00A7' )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15680:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00A7' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00A7' )*
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15680:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15680:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='#'||input.LA(1)=='%'||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='<' && input.LA(1)<='>')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A7' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15680:85: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00A7' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='#'||LA13_0=='%'||(LA13_0>='*' && LA13_0<='+')||LA13_0=='-'||(LA13_0>='/' && LA13_0<='9')||(LA13_0>='<' && LA13_0<='>')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')||LA13_0=='\u00A7') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:
            	    {
            	    if ( input.LA(1)=='#'||input.LA(1)=='%'||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||(input.LA(1)>='/' && input.LA(1)<='9')||(input.LA(1)>='<' && input.LA(1)<='>')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00A7' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:16: ( RULE_INT '-' RULE_INT '-' RULE_INT ( 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )? )? )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:18: RULE_INT '-' RULE_INT '-' RULE_INT ( 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )? )?
            {
            mRULE_INT(); 
            match('-'); 
            mRULE_INT(); 
            match('-'); 
            mRULE_INT(); 
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:53: ( 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='T') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:54: 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )?
                    {
                    match('T'); 
                    mRULE_INT(); 
                    match(':'); 
                    mRULE_INT(); 
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:80: ( ':' RULE_INT ( '.' RULE_INT )? )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==':') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:81: ':' RULE_INT ( '.' RULE_INT )?
                            {
                            match(':'); 
                            mRULE_INT(); 
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:94: ( '.' RULE_INT )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0=='.') ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15682:95: '.' RULE_INT
                                    {
                                    match('.'); 
                                    mRULE_INT(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15684:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15686:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15686:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15686:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15686:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:41: ( '\\r' )? '\\n'
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15688:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15690:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15690:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15690:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15692:16: ( . )
            // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:15692:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_EBOOLEAN | RULE_NULL | RULE_INT | RULE_POSITIVE_SMALL_DECIMAL | RULE_SMALL_DECIMAL | RULE_EBIGDECIMAL | RULE_ID | RULE_DATE_TIME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=79;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:340: T__72
                {
                mT__72(); 

                }
                break;
            case 57 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:346: T__73
                {
                mT__73(); 

                }
                break;
            case 58 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:352: T__74
                {
                mT__74(); 

                }
                break;
            case 59 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:358: T__75
                {
                mT__75(); 

                }
                break;
            case 60 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:364: T__76
                {
                mT__76(); 

                }
                break;
            case 61 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:370: T__77
                {
                mT__77(); 

                }
                break;
            case 62 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:376: T__78
                {
                mT__78(); 

                }
                break;
            case 63 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:382: T__79
                {
                mT__79(); 

                }
                break;
            case 64 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:388: T__80
                {
                mT__80(); 

                }
                break;
            case 65 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:394: T__81
                {
                mT__81(); 

                }
                break;
            case 66 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:400: T__82
                {
                mT__82(); 

                }
                break;
            case 67 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:406: RULE_EBOOLEAN
                {
                mRULE_EBOOLEAN(); 

                }
                break;
            case 68 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:420: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 69 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:430: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 70 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:439: RULE_POSITIVE_SMALL_DECIMAL
                {
                mRULE_POSITIVE_SMALL_DECIMAL(); 

                }
                break;
            case 71 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:467: RULE_SMALL_DECIMAL
                {
                mRULE_SMALL_DECIMAL(); 

                }
                break;
            case 72 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:486: RULE_EBIGDECIMAL
                {
                mRULE_EBIGDECIMAL(); 

                }
                break;
            case 73 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:503: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 74 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:511: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 75 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:526: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 76 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:538: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:554: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 78 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:570: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // ../eu.artist.postmigration.nfrvt.lang.gml.ui/src-gen/eu/artist/postmigration/nfrvt/lang/gml/ui/contentassist/antlr/internal/InternalGML.g:1:578: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA11_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\2\71\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "15678:31: ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )";
        }
    }
    static final String DFA25_eotS =
        "\3\uffff\1\65\1\60\1\65\1\70\1\65\1\60\1\101\1\103\1\111\1\114"+
        "\4\65\1\uffff\1\65\4\uffff\5\65\1\uffff\3\65\1\146\1\147\1\150\1"+
        "\153\1\154\3\65\1\163\3\165\1\uffff\2\60\4\uffff\1\175\1\65\2\uffff"+
        "\1\65\1\uffff\5\65\1\uffff\1\u0085\1\u0086\1\uffff\1\u0087\1\uffff"+
        "\2\u0089\1\172\3\uffff\1\u008c\1\u008d\1\uffff\5\65\1\uffff\1\65"+
        "\4\uffff\10\65\1\uffff\4\65\1\u00a3\3\uffff\2\65\2\uffff\3\65\1"+
        "\u00ac\1\65\2\uffff\1\u00ae\2\uffff\1\165\6\uffff\1\65\1\u00b2\1"+
        "\u00b3\2\65\1\u00b6\1\u00b7\6\uffff\1\u0089\2\uffff\1\u00ba\16\65"+
        "\1\u00cb\5\65\1\uffff\2\65\1\uffff\1\65\1\uffff\1\u00d3\1\u00d4"+
        "\1\u00d5\1\uffff\1\u00d6\1\uffff\2\u00ae\1\65\2\uffff\2\65\2\uffff"+
        "\2\u0089\1\uffff\1\u00da\17\65\1\uffff\1\u00ec\1\65\1\u00ee\4\65"+
        "\4\uffff\3\65\1\uffff\6\65\1\u00fb\7\65\1\u00ee\2\65\1\uffff\1\65"+
        "\1\uffff\14\65\1\uffff\13\65\1\u011d\1\65\1\u011f\4\65\1\u0124\4"+
        "\65\1\u0129\10\65\1\u0132\1\uffff\1\65\1\uffff\1\65\1\u0135\1\u0136"+
        "\1\u0137\1\uffff\3\65\1\u013c\1\uffff\1\u013d\1\u013e\2\65\1\u0141"+
        "\1\u0142\2\65\1\uffff\1\u0145\1\65\3\uffff\1\u0147\1\u0148\1\u0149"+
        "\1\u014a\3\uffff\2\65\2\uffff\1\65\1\u014e\1\uffff\1\65\4\uffff"+
        "\3\65\1\uffff\1\65\1\u0154\1\65\1\u0156\1\65\1\uffff\1\u0158\1\uffff"+
        "\1\65\1\uffff\4\65\1\u015e\1\uffff";
    static final String DFA25_eofS =
        "\u015f\uffff";
    static final String DFA25_minS =
        "\1\0\2\uffff\1\146\1\174\1\157\1\43\1\142\1\46\2\43\1\75\1\43\1"+
        "\157\1\145\2\157\1\uffff\1\157\4\uffff\1\141\1\165\1\141\1\157\1"+
        "\151\1\uffff\1\150\1\155\1\141\5\43\1\141\1\170\1\156\1\52\3\55"+
        "\1\uffff\2\0\4\uffff\1\43\1\146\2\uffff\1\162\1\uffff\1\144\1\160"+
        "\1\164\1\147\1\163\1\uffff\2\43\1\uffff\1\43\1\uffff\3\43\1\60\2"+
        "\uffff\2\43\1\uffff\1\164\1\154\1\161\1\155\1\141\1\uffff\1\162"+
        "\4\uffff\1\164\1\151\1\141\1\156\1\154\1\146\1\143\1\156\1\uffff"+
        "\1\162\1\165\1\160\1\162\1\43\3\uffff\2\0\2\uffff\1\170\1\156\1"+
        "\160\1\43\1\147\2\uffff\1\60\1\uffff\1\60\1\55\1\uffff\1\60\4\uffff"+
        "\1\145\2\43\1\154\1\151\2\43\3\uffff\1\60\1\uffff\2\60\2\uffff\1"+
        "\43\1\154\1\165\1\144\1\160\1\154\1\153\1\164\1\160\1\157\1\154"+
        "\1\143\1\163\1\164\1\143\1\43\1\144\2\145\1\141\1\144\1\uffff\2"+
        "\0\1\uffff\1\0\1\uffff\3\43\1\uffff\1\43\1\uffff\2\60\1\162\2\uffff"+
        "\1\151\1\166\2\uffff\2\60\1\uffff\1\43\1\151\1\145\1\151\1\157\1"+
        "\155\1\154\2\145\1\162\1\151\2\164\1\145\1\147\1\145\1\uffff\1\43"+
        "\1\163\1\43\1\143\1\162\1\147\1\0\4\uffff\2\145\1\151\1\uffff\1"+
        "\162\1\141\1\170\1\164\1\163\1\157\1\43\1\157\2\162\1\151\1\164"+
        "\2\151\1\43\1\157\1\163\1\uffff\1\150\1\uffff\2\164\1\157\2\144"+
        "\1\164\1\145\1\143\1\164\2\151\1\144\1\uffff\1\141\1\156\2\164\1"+
        "\141\1\164\1\157\1\141\1\163\1\157\1\163\1\43\1\141\1\43\1\55\1"+
        "\171\1\144\1\164\1\43\1\157\1\164\1\145\1\144\1\43\2\171\1\164\1"+
        "\141\1\156\1\154\1\122\1\154\1\43\1\uffff\1\154\1\uffff\1\160\3"+
        "\43\1\uffff\1\156\1\145\1\154\1\43\1\uffff\2\43\1\151\1\164\2\43"+
        "\1\141\1\144\1\uffff\1\43\1\162\3\uffff\4\43\3\uffff\1\166\1\151"+
        "\2\uffff\1\164\1\43\1\uffff\1\157\4\uffff\1\145\1\166\1\145\1\uffff"+
        "\1\160\1\43\1\145\1\43\1\145\1\uffff\1\43\1\uffff\1\162\1\uffff"+
        "\1\164\1\151\1\145\1\163\1\43\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\2\uffff\1\162\1\174\1\157\1\u00a7\1\166\1\46\2\u00a7\1"+
        "\75\1\u00a7\1\165\1\145\2\157\1\uffff\1\157\4\uffff\1\162\3\165"+
        "\1\151\1\uffff\1\162\1\155\1\141\5\u00a7\1\151\1\170\1\157\4\71"+
        "\1\uffff\2\uffff\4\uffff\1\u00a7\1\146\2\uffff\1\162\1\uffff\1\144"+
        "\1\160\1\164\1\147\1\163\1\uffff\2\u00a7\1\uffff\1\u00a7\1\uffff"+
        "\3\u00a7\1\71\2\uffff\2\u00a7\1\uffff\1\164\1\154\1\161\1\156\1"+
        "\141\1\uffff\1\162\4\uffff\1\164\1\157\1\141\1\156\1\154\1\146\1"+
        "\155\1\156\1\uffff\1\162\1\165\1\160\1\162\1\u00a7\3\uffff\2\uffff"+
        "\2\uffff\1\170\1\156\1\160\1\u00a7\1\147\2\uffff\1\71\1\uffff\2"+
        "\71\1\uffff\1\71\4\uffff\1\145\2\u00a7\1\154\1\151\2\u00a7\3\uffff"+
        "\1\71\1\uffff\2\71\2\uffff\1\u00a7\1\154\1\165\1\164\1\160\1\154"+
        "\1\153\1\164\1\160\1\157\1\156\1\143\1\163\1\164\1\143\1\u00a7\1"+
        "\144\2\145\1\157\1\144\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\3"+
        "\u00a7\1\uffff\1\u00a7\1\uffff\2\71\1\162\2\uffff\1\151\1\166\2"+
        "\uffff\2\71\1\uffff\1\u00a7\1\151\1\162\1\151\1\157\1\163\1\154"+
        "\2\145\1\162\1\151\2\164\1\145\1\147\1\145\1\uffff\1\u00a7\1\163"+
        "\1\u00a7\1\143\1\162\1\147\1\uffff\4\uffff\2\145\1\151\1\uffff\1"+
        "\162\1\141\1\170\1\164\1\163\1\157\1\u00a7\1\157\2\162\1\151\1\164"+
        "\2\151\1\u00a7\1\157\1\163\1\uffff\1\150\1\uffff\2\164\1\157\2\144"+
        "\1\164\1\145\1\143\1\164\2\151\1\144\1\uffff\1\141\1\156\2\164\1"+
        "\141\1\164\1\157\1\141\1\163\1\157\1\163\1\u00a7\1\141\1\u00a7\1"+
        "\55\1\171\1\144\1\164\1\u00a7\1\157\1\164\1\145\1\144\1\u00a7\2"+
        "\171\1\164\1\141\1\156\1\154\1\122\1\154\1\u00a7\1\uffff\1\154\1"+
        "\uffff\1\160\3\u00a7\1\uffff\1\156\1\145\1\154\1\u00a7\1\uffff\2"+
        "\u00a7\1\151\1\164\2\u00a7\1\141\1\144\1\uffff\1\u00a7\1\162\3\uffff"+
        "\4\u00a7\3\uffff\1\166\1\151\2\uffff\1\164\1\u00a7\1\uffff\1\157"+
        "\4\uffff\1\145\1\166\1\145\1\uffff\1\160\1\u00a7\1\145\1\u00a7\1"+
        "\145\1\uffff\1\u00a7\1\uffff\1\162\1\uffff\1\164\1\151\1\145\1\163"+
        "\1\u00a7\1\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\16\uffff\1\23\1\uffff\1\25\1\26\1\31\1\32\5\uffff"+
        "\1\46\17\uffff\1\111\2\uffff\1\116\1\117\1\1\1\2\2\uffff\1\111\1"+
        "\4\1\uffff\1\6\5\uffff\1\10\2\uffff\1\55\1\uffff\1\64\4\uffff\1"+
        "\13\1\15\2\uffff\1\61\5\uffff\1\23\1\uffff\1\25\1\26\1\31\1\32\10"+
        "\uffff\1\46\5\uffff\1\57\1\63\1\65\2\uffff\1\66\1\67\5\uffff\1\101"+
        "\1\100\1\uffff\1\105\2\uffff\1\112\1\uffff\1\110\1\113\1\116\1\3"+
        "\7\uffff\1\11\1\56\1\12\1\uffff\1\107\2\uffff\1\14\1\62\25\uffff"+
        "\1\60\2\uffff\1\114\1\uffff\1\115\3\uffff\1\76\1\uffff\1\106\3\uffff"+
        "\1\5\1\7\2\uffff\1\72\1\75\2\uffff\1\16\20\uffff\1\73\7\uffff\1"+
        "\70\1\71\1\74\1\77\3\uffff\1\104\21\uffff\1\44\1\uffff\1\103\14"+
        "\uffff\1\30\41\uffff\1\102\1\uffff\1\20\4\uffff\1\37\4\uffff\1\34"+
        "\10\uffff\1\50\2\uffff\1\33\1\17\1\21\4\uffff\1\42\1\36\1\45\2\uffff"+
        "\1\41\1\43\2\uffff\1\51\1\uffff\1\52\1\54\1\22\1\24\3\uffff\1\47"+
        "\5\uffff\1\35\1\uffff\1\53\1\uffff\1\40\5\uffff\1\27";
    static final String DFA25_specialS =
        "\1\2\54\uffff\1\3\1\6\72\uffff\1\7\1\10\71\uffff\1\1\1\4\1\uffff"+
        "\1\0\52\uffff\1\5\u008c\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\13\1\55\1\54\1\34\1\44\1"+
            "\10\1\56\1\1\1\2\1\42\1\41\1\26\1\12\1\50\1\43\1\52\1\51\10"+
            "\53\2\60\1\14\1\11\1\40\2\60\32\54\1\23\1\60\1\24\1\6\1\54\1"+
            "\60\1\7\1\54\1\17\1\54\1\46\1\31\1\20\1\37\1\36\1\54\1\33\1"+
            "\47\1\45\1\15\1\3\1\27\1\30\1\16\1\32\1\35\2\54\1\22\1\5\2\54"+
            "\1\21\1\4\1\25\51\60\1\54\uff58\60",
            "",
            "",
            "\1\64\13\uffff\1\63",
            "\1\66",
            "\1\67",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\1\65"+
            "\14\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\75\1\73\12\uffff\1\71\1\uffff\1\72\5\uffff\1\74",
            "\1\76",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\1\65\1\100\1\77\2\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65\54\uffff\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\107\1\65\1"+
            "\105\1\104\10\106\2\uffff\2\65\1\102\2\uffff\32\65\4\uffff\1"+
            "\65\1\uffff\32\65\54\uffff\1\65",
            "\1\110",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\1\65\1\113\1\112\2\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65\54\uffff\1\65",
            "\1\115\5\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "\1\123",
            "",
            "",
            "",
            "",
            "\1\130\20\uffff\1\131",
            "\1\132",
            "\1\134\23\uffff\1\133",
            "\1\135\5\uffff\1\136",
            "\1\137",
            "",
            "\1\141\11\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\1\65\1\145\1\65\2\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65\54\uffff\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\107\1\65\1"+
            "\105\1\104\10\106\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1"+
            "\uffff\32\65\54\uffff\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\1\151\1\65\1\uffff\1\65\1\uffff"+
            "\1\152\12\65\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff"+
            "\32\65\54\uffff\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\155\7\uffff\1\156",
            "\1\157",
            "\1\160\1\161",
            "\1\162\5\uffff\12\164",
            "\1\170\1\166\1\uffff\12\167",
            "\1\170\1\171\1\uffff\12\167",
            "\1\170\1\172\1\uffff\12\167",
            "",
            "\0\173",
            "\0\173",
            "",
            "",
            "",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\176",
            "",
            "",
            "\1\177",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\u0088\1\65"+
            "\12\106\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65"+
            "\54\uffff\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\u008a\1\65"+
            "\12\106\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65"+
            "\54\uffff\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\1\65"+
            "\12\106\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65"+
            "\54\uffff\1\65",
            "\12\u008b",
            "",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0092\1\u0091",
            "\1\u0093",
            "",
            "\1\u0094",
            "",
            "",
            "",
            "",
            "\1\u0095",
            "\1\u0097\5\uffff\1\u0096",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\11\uffff\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "",
            "",
            "\43\u00a6\1\u00a5\1\u00a6\1\u00a5\4\u00a6\1\u00a4\1\u00a5"+
            "\1\u00a6\1\u00a5\1\u00a6\13\u00a5\2\u00a6\3\u00a5\2\u00a6\32"+
            "\u00a5\4\u00a6\1\u00a5\1\u00a6\32\u00a5\54\u00a6\1\u00a5\uff58"+
            "\u00a6",
            "\43\u00a8\1\u00a7\1\u00a8\1\u00a7\4\u00a8\2\u00a7\1\u00a8"+
            "\1\u00a7\1\u00a8\13\u00a7\2\u00a8\3\u00a7\2\u00a8\32\u00a7\4"+
            "\u00a8\1\u00a7\1\u00a8\32\u00a7\54\u00a8\1\u00a7\uff58\u00a8",
            "",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00ad",
            "",
            "",
            "\12\164",
            "",
            "\1\u00af\11\172",
            "\1\170\1\172\1\uffff\12\167",
            "",
            "\12\u00b0",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00b4",
            "\1\u00b5",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "",
            "",
            "\1\u00b8\11\172",
            "",
            "\12\u00b9",
            "\12\u008b",
            "",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\17\uffff\1\u00bd",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\1\uffff\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\15\uffff\1\u00d0",
            "\1\u00d1",
            "",
            "\43\u00a6\1\u00a5\1\u00a6\1\u00a5\4\u00a6\1\u00a4\1\u00a5"+
            "\1\u00a6\1\u00a5\1\u00a6\1\u00d2\12\u00a5\2\u00a6\3\u00a5\2"+
            "\u00a6\32\u00a5\4\u00a6\1\u00a5\1\u00a6\32\u00a5\54\u00a6\1"+
            "\u00a5\uff58\u00a6",
            "\43\u00a6\1\u00a5\1\u00a6\1\u00a5\4\u00a6\1\u00a4\1\u00a5"+
            "\1\u00a6\1\u00a5\1\u00a6\13\u00a5\2\u00a6\3\u00a5\2\u00a6\32"+
            "\u00a5\4\u00a6\1\u00a5\1\u00a6\32\u00a5\54\u00a6\1\u00a5\uff58"+
            "\u00a6",
            "",
            "\43\u00a8\1\u00a7\1\u00a8\1\u00a7\4\u00a8\2\u00a7\1\u00a8"+
            "\1\u00a7\1\u00a8\13\u00a7\2\u00a8\3\u00a7\2\u00a8\32\u00a7\4"+
            "\u00a8\1\u00a7\1\u00a8\32\u00a7\54\u00a8\1\u00a7\uff58\u00a8",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\u00af\11\172",
            "\12\u00b0",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "\1\u00b8\11\172",
            "\12\u00b9",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00db",
            "\1\u00dd\14\uffff\1\u00dc",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0\5\uffff\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00ed",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\43\u00a6\1\u00a5\1\u00a6\1\u00a5\4\u00a6\1\u00a4\1\u00a5"+
            "\1\u00a6\1\u00a5\1\u00a6\13\u00a5\2\u00a6\3\u00a5\2\u00a6\32"+
            "\u00a5\4\u00a6\1\u00a5\1\u00a6\32\u00a5\54\u00a6\1\u00a5\uff58"+
            "\u00a6",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u011e",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\22\65\1\u013b"+
            "\7\65\54\uffff\1\65",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u013f",
            "\1\u0140",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0146",
            "",
            "",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "",
            "",
            "\1\u014b",
            "\1\u014c",
            "",
            "",
            "\1\u014d",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\u014f",
            "",
            "",
            "",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0155",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "\1\u0157",
            "",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            "",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\65\1\uffff\1\65\4\uffff\2\65\1\uffff\1\65\1\uffff\13\65"+
            "\2\uffff\3\65\2\uffff\32\65\4\uffff\1\65\1\uffff\32\65\54\uffff"+
            "\1\65",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | RULE_EBOOLEAN | RULE_NULL | RULE_INT | RULE_POSITIVE_SMALL_DECIMAL | RULE_SMALL_DECIMAL | RULE_EBIGDECIMAL | RULE_ID | RULE_DATE_TIME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_167 = input.LA(1);

                        s = -1;
                        if ( ((LA25_167>='\u0000' && LA25_167<='\"')||LA25_167=='$'||(LA25_167>='&' && LA25_167<=')')||LA25_167==','||LA25_167=='.'||(LA25_167>=':' && LA25_167<=';')||(LA25_167>='?' && LA25_167<='@')||(LA25_167>='[' && LA25_167<='^')||LA25_167=='`'||(LA25_167>='{' && LA25_167<='\u00A6')||(LA25_167>='\u00A8' && LA25_167<='\uFFFF')) ) {s = 168;}

                        else if ( (LA25_167=='#'||LA25_167=='%'||(LA25_167>='*' && LA25_167<='+')||LA25_167=='-'||(LA25_167>='/' && LA25_167<='9')||(LA25_167>='<' && LA25_167<='>')||(LA25_167>='A' && LA25_167<='Z')||LA25_167=='_'||(LA25_167>='a' && LA25_167<='z')||LA25_167=='\u00A7') ) {s = 167;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_164 = input.LA(1);

                        s = -1;
                        if ( (LA25_164=='/') ) {s = 210;}

                        else if ( (LA25_164=='*') ) {s = 164;}

                        else if ( (LA25_164=='#'||LA25_164=='%'||LA25_164=='+'||LA25_164=='-'||(LA25_164>='0' && LA25_164<='9')||(LA25_164>='<' && LA25_164<='>')||(LA25_164>='A' && LA25_164<='Z')||LA25_164=='_'||(LA25_164>='a' && LA25_164<='z')||LA25_164=='\u00A7') ) {s = 165;}

                        else if ( ((LA25_164>='\u0000' && LA25_164<='\"')||LA25_164=='$'||(LA25_164>='&' && LA25_164<=')')||LA25_164==','||LA25_164=='.'||(LA25_164>=':' && LA25_164<=';')||(LA25_164>='?' && LA25_164<='@')||(LA25_164>='[' && LA25_164<='^')||LA25_164=='`'||(LA25_164>='{' && LA25_164<='\u00A6')||(LA25_164>='\u00A8' && LA25_164<='\uFFFF')) ) {s = 166;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='(') ) {s = 1;}

                        else if ( (LA25_0==')') ) {s = 2;}

                        else if ( (LA25_0=='o') ) {s = 3;}

                        else if ( (LA25_0=='|') ) {s = 4;}

                        else if ( (LA25_0=='x') ) {s = 5;}

                        else if ( (LA25_0=='^') ) {s = 6;}

                        else if ( (LA25_0=='a') ) {s = 7;}

                        else if ( (LA25_0=='&') ) {s = 8;}

                        else if ( (LA25_0=='=') ) {s = 9;}

                        else if ( (LA25_0=='-') ) {s = 10;}

                        else if ( (LA25_0=='!') ) {s = 11;}

                        else if ( (LA25_0=='<') ) {s = 12;}

                        else if ( (LA25_0=='n') ) {s = 13;}

                        else if ( (LA25_0=='r') ) {s = 14;}

                        else if ( (LA25_0=='c') ) {s = 15;}

                        else if ( (LA25_0=='g') ) {s = 16;}

                        else if ( (LA25_0=='{') ) {s = 17;}

                        else if ( (LA25_0=='w') ) {s = 18;}

                        else if ( (LA25_0=='[') ) {s = 19;}

                        else if ( (LA25_0==']') ) {s = 20;}

                        else if ( (LA25_0=='}') ) {s = 21;}

                        else if ( (LA25_0==',') ) {s = 22;}

                        else if ( (LA25_0=='p') ) {s = 23;}

                        else if ( (LA25_0=='q') ) {s = 24;}

                        else if ( (LA25_0=='f') ) {s = 25;}

                        else if ( (LA25_0=='s') ) {s = 26;}

                        else if ( (LA25_0=='k') ) {s = 27;}

                        else if ( (LA25_0=='$') ) {s = 28;}

                        else if ( (LA25_0=='t') ) {s = 29;}

                        else if ( (LA25_0=='i') ) {s = 30;}

                        else if ( (LA25_0=='h') ) {s = 31;}

                        else if ( (LA25_0=='>') ) {s = 32;}

                        else if ( (LA25_0=='+') ) {s = 33;}

                        else if ( (LA25_0=='*') ) {s = 34;}

                        else if ( (LA25_0=='/') ) {s = 35;}

                        else if ( (LA25_0=='%') ) {s = 36;}

                        else if ( (LA25_0=='m') ) {s = 37;}

                        else if ( (LA25_0=='e') ) {s = 38;}

                        else if ( (LA25_0=='l') ) {s = 39;}

                        else if ( (LA25_0=='.') ) {s = 40;}

                        else if ( (LA25_0=='1') ) {s = 41;}

                        else if ( (LA25_0=='0') ) {s = 42;}

                        else if ( ((LA25_0>='2' && LA25_0<='9')) ) {s = 43;}

                        else if ( (LA25_0=='#'||(LA25_0>='A' && LA25_0<='Z')||LA25_0=='_'||LA25_0=='b'||LA25_0=='d'||LA25_0=='j'||(LA25_0>='u' && LA25_0<='v')||(LA25_0>='y' && LA25_0<='z')||LA25_0=='\u00A7') ) {s = 44;}

                        else if ( (LA25_0=='\"') ) {s = 45;}

                        else if ( (LA25_0=='\'') ) {s = 46;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {s = 47;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||(LA25_0>=':' && LA25_0<=';')||(LA25_0>='?' && LA25_0<='@')||LA25_0=='\\'||LA25_0=='`'||(LA25_0>='~' && LA25_0<='\u00A6')||(LA25_0>='\u00A8' && LA25_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_45 = input.LA(1);

                        s = -1;
                        if ( ((LA25_45>='\u0000' && LA25_45<='\uFFFF')) ) {s = 123;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_165 = input.LA(1);

                        s = -1;
                        if ( (LA25_165=='*') ) {s = 164;}

                        else if ( (LA25_165=='#'||LA25_165=='%'||LA25_165=='+'||LA25_165=='-'||(LA25_165>='/' && LA25_165<='9')||(LA25_165>='<' && LA25_165<='>')||(LA25_165>='A' && LA25_165<='Z')||LA25_165=='_'||(LA25_165>='a' && LA25_165<='z')||LA25_165=='\u00A7') ) {s = 165;}

                        else if ( ((LA25_165>='\u0000' && LA25_165<='\"')||LA25_165=='$'||(LA25_165>='&' && LA25_165<=')')||LA25_165==','||LA25_165=='.'||(LA25_165>=':' && LA25_165<=';')||(LA25_165>='?' && LA25_165<='@')||(LA25_165>='[' && LA25_165<='^')||LA25_165=='`'||(LA25_165>='{' && LA25_165<='\u00A6')||(LA25_165>='\u00A8' && LA25_165<='\uFFFF')) ) {s = 166;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_210 = input.LA(1);

                        s = -1;
                        if ( (LA25_210=='*') ) {s = 164;}

                        else if ( (LA25_210=='#'||LA25_210=='%'||LA25_210=='+'||LA25_210=='-'||(LA25_210>='/' && LA25_210<='9')||(LA25_210>='<' && LA25_210<='>')||(LA25_210>='A' && LA25_210<='Z')||LA25_210=='_'||(LA25_210>='a' && LA25_210<='z')||LA25_210=='\u00A7') ) {s = 165;}

                        else if ( ((LA25_210>='\u0000' && LA25_210<='\"')||LA25_210=='$'||(LA25_210>='&' && LA25_210<=')')||LA25_210==','||LA25_210=='.'||(LA25_210>=':' && LA25_210<=';')||(LA25_210>='?' && LA25_210<='@')||(LA25_210>='[' && LA25_210<='^')||LA25_210=='`'||(LA25_210>='{' && LA25_210<='\u00A6')||(LA25_210>='\u00A8' && LA25_210<='\uFFFF')) ) {s = 166;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_46 = input.LA(1);

                        s = -1;
                        if ( ((LA25_46>='\u0000' && LA25_46<='\uFFFF')) ) {s = 123;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_105 = input.LA(1);

                        s = -1;
                        if ( (LA25_105=='*') ) {s = 164;}

                        else if ( (LA25_105=='#'||LA25_105=='%'||LA25_105=='+'||LA25_105=='-'||(LA25_105>='/' && LA25_105<='9')||(LA25_105>='<' && LA25_105<='>')||(LA25_105>='A' && LA25_105<='Z')||LA25_105=='_'||(LA25_105>='a' && LA25_105<='z')||LA25_105=='\u00A7') ) {s = 165;}

                        else if ( ((LA25_105>='\u0000' && LA25_105<='\"')||LA25_105=='$'||(LA25_105>='&' && LA25_105<=')')||LA25_105==','||LA25_105=='.'||(LA25_105>=':' && LA25_105<=';')||(LA25_105>='?' && LA25_105<='@')||(LA25_105>='[' && LA25_105<='^')||LA25_105=='`'||(LA25_105>='{' && LA25_105<='\u00A6')||(LA25_105>='\u00A8' && LA25_105<='\uFFFF')) ) {s = 166;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_106 = input.LA(1);

                        s = -1;
                        if ( (LA25_106=='#'||LA25_106=='%'||(LA25_106>='*' && LA25_106<='+')||LA25_106=='-'||(LA25_106>='/' && LA25_106<='9')||(LA25_106>='<' && LA25_106<='>')||(LA25_106>='A' && LA25_106<='Z')||LA25_106=='_'||(LA25_106>='a' && LA25_106<='z')||LA25_106=='\u00A7') ) {s = 167;}

                        else if ( ((LA25_106>='\u0000' && LA25_106<='\"')||LA25_106=='$'||(LA25_106>='&' && LA25_106<=')')||LA25_106==','||LA25_106=='.'||(LA25_106>=':' && LA25_106<=';')||(LA25_106>='?' && LA25_106<='@')||(LA25_106>='[' && LA25_106<='^')||LA25_106=='`'||(LA25_106>='{' && LA25_106<='\u00A6')||(LA25_106>='\u00A8' && LA25_106<='\uFFFF')) ) {s = 168;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}