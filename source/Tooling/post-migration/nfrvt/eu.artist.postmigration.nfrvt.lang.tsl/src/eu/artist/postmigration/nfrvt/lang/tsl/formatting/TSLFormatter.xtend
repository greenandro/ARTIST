/*
 * generated by Xtext
 */
package eu.artist.postmigration.nfrvt.lang.tsl.formatting

import com.google.inject.Inject
import eu.artist.postmigration.nfrvt.lang.tsl.services.TSLGrammarAccess
import org.eclipse.xtext.formatting.impl.FormattingConfig
import eu.artist.postmigration.nfrvt.lang.common.formatting.ARTISTDeclarativeFormatter

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
class TSLFormatter extends ARTISTDeclarativeFormatter {

	@Inject TSLGrammarAccess grammarAccess
	
	override protected void configureFormatting(FormattingConfig c) {
		configureCommaStyle(c, ",");
		configureParenthesisStyle(c, "(", ")");
		configureParenthesisStyle(c, "{", "}");
		configureParenthesisStyle(c, "[", "]");
		preserveNewLinesAroundComments(c, grammarAccess.getSL_COMMENTRule(), grammarAccess.getML_COMMENTRule());		
		preserveVariableNames(c, "$");
		formatImports(c, grammarAccess.getImportNamespaceRule());
		formatImports(c, grammarAccess.getImportURIRule());
		formatImports(c, grammarAccess.getImportURIorNamespaceRule());
	}
}
