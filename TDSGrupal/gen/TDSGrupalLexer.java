// Generated from /Users/raulrodriguezlopez-rey/Desktop/Procesadores del Lenguaje/git/TDSGrupal/TDSGrupal/src/TDSGrupal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TDSGrupalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, IDENTIFIER=42, NUMERIC_INTEGER_CONST=43, 
		NUMERIC_REAL_CONST=44, STRING_CONST=45, COMENTARIO=46, CORCHETE=47, PARENTESIS_ASTERISCO=48, 
		WHITESPACE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
			"IDENTIFIER", "NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", 
			"COMENTARIO", "CORCHETE", "PARENTESIS_ASTERISCO", "LETRAS", "NUMEROS", 
			"PUNTOFIJO", "EXPONENCIAL", "MIXTO", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "';'", "'.'", "'BEGIN'", "'END'", "'CONST'", "'='", 
			"'VAR'", "':'", "','", "'PROCEDURE'", "'FUNCTION'", "'('", "')'", "'integer'", 
			"'real'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "'REPEAT'", 
			"'UNTIL'", "'FOR'", "':='", "'TO'", "'DOWNTO'", "'OR'", "'AND'", "'NOT'", 
			"'TRUE'", "'FALSE'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", 
			"'DIV'", "'MOD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "IDENTIFIER", "NUMERIC_INTEGER_CONST", 
			"NUMERIC_REAL_CONST", "STRING_CONST", "COMENTARIO", "CORCHETE", "PARENTESIS_ASTERISCO", 
			"WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TDSGrupalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TDSGrupal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3+\3+\6+\u011e\n+\r+\16+\u011f\3+\7+\u0123\n+\f+\16+\u0126\13+\3"+
		"+\3+\7+\u012a\n+\f+\16+\u012d\13+\3,\5,\u0130\n,\3,\6,\u0133\n,\r,\16"+
		",\u0134\3-\3-\3-\5-\u013a\n-\3.\3.\6.\u013e\n.\r.\16.\u013f\3.\3.\7.\u0144"+
		"\n.\f.\16.\u0147\13.\3.\6.\u014a\n.\r.\16.\u014b\3.\3.\3.\6.\u0151\n."+
		"\r.\16.\u0152\3.\3.\7.\u0157\n.\f.\16.\u015a\13.\3.\6.\u015d\n.\r.\16"+
		".\u015e\3.\5.\u0162\n.\3/\3/\5/\u0166\n/\3/\3/\3\60\3\60\7\60\u016c\n"+
		"\60\f\60\16\60\u016f\13\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0177\n"+
		"\61\f\61\16\61\u017a\13\61\3\61\3\61\7\61\u017e\n\61\f\61\16\61\u0181"+
		"\13\61\3\61\7\61\u0184\n\61\f\61\16\61\u0187\13\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\5\64\u0191\n\64\3\64\6\64\u0194\n\64\r\64\16\64\u0195"+
		"\3\64\3\64\5\64\u019a\n\64\3\64\6\64\u019d\n\64\r\64\16\64\u019e\3\65"+
		"\5\65\u01a2\n\65\3\65\6\65\u01a5\n\65\r\65\16\65\u01a6\3\65\3\65\5\65"+
		"\u01ab\n\65\3\65\6\65\u01ae\n\65\r\65\16\65\u01af\3\66\5\66\u01b3\n\66"+
		"\3\66\6\66\u01b6\n\66\r\66\16\66\u01b7\3\66\3\66\6\66\u01bc\n\66\r\66"+
		"\16\66\u01bd\3\66\3\66\5\66\u01c2\n\66\3\66\6\66\u01c5\n\66\r\66\16\66"+
		"\u01c6\3\67\6\67\u01ca\n\67\r\67\16\67\u01cb\3\67\3\67\3\u017f\28\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2m\63\3\2\f\4"+
		"\2--//\3\2))\3\2$$\4\2\f\f\177\177\3\2,,\3\2++\4\2C\\c|\3\2\62;\4\2GG"+
		"gg\5\2\13\f\17\17\"\"\2\u01ec\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5w\3\2\2\2\7"+
		"y\3\2\2\2\t{\3\2\2\2\13\u0081\3\2\2\2\r\u0085\3\2\2\2\17\u008b\3\2\2\2"+
		"\21\u008d\3\2\2\2\23\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31"+
		"\u009f\3\2\2\2\33\u00a8\3\2\2\2\35\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00b4"+
		"\3\2\2\2#\u00b9\3\2\2\2%\u00bc\3\2\2\2\'\u00c1\3\2\2\2)\u00c6\3\2\2\2"+
		"+\u00cc\3\2\2\2-\u00cf\3\2\2\2/\u00d6\3\2\2\2\61\u00dc\3\2\2\2\63\u00e0"+
		"\3\2\2\2\65\u00e3\3\2\2\2\67\u00e6\3\2\2\29\u00ed\3\2\2\2;\u00f0\3\2\2"+
		"\2=\u00f4\3\2\2\2?\u00f8\3\2\2\2A\u00fd\3\2\2\2C\u0103\3\2\2\2E\u0105"+
		"\3\2\2\2G\u0107\3\2\2\2I\u010a\3\2\2\2K\u010d\3\2\2\2M\u010f\3\2\2\2O"+
		"\u0111\3\2\2\2Q\u0113\3\2\2\2S\u0117\3\2\2\2U\u011d\3\2\2\2W\u012f\3\2"+
		"\2\2Y\u0139\3\2\2\2[\u0161\3\2\2\2]\u0165\3\2\2\2_\u0169\3\2\2\2a\u0172"+
		"\3\2\2\2c\u018b\3\2\2\2e\u018d\3\2\2\2g\u0190\3\2\2\2i\u01a1\3\2\2\2k"+
		"\u01b2\3\2\2\2m\u01c9\3\2\2\2op\7R\2\2pq\7T\2\2qr\7Q\2\2rs\7I\2\2st\7"+
		"T\2\2tu\7C\2\2uv\7O\2\2v\4\3\2\2\2wx\7=\2\2x\6\3\2\2\2yz\7\60\2\2z\b\3"+
		"\2\2\2{|\7D\2\2|}\7G\2\2}~\7I\2\2~\177\7K\2\2\177\u0080\7P\2\2\u0080\n"+
		"\3\2\2\2\u0081\u0082\7G\2\2\u0082\u0083\7P\2\2\u0083\u0084\7F\2\2\u0084"+
		"\f\3\2\2\2\u0085\u0086\7E\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7P\2\2\u0088"+
		"\u0089\7U\2\2\u0089\u008a\7V\2\2\u008a\16\3\2\2\2\u008b\u008c\7?\2\2\u008c"+
		"\20\3\2\2\2\u008d\u008e\7X\2\2\u008e\u008f\7C\2\2\u008f\u0090\7T\2\2\u0090"+
		"\22\3\2\2\2\u0091\u0092\7<\2\2\u0092\24\3\2\2\2\u0093\u0094\7.\2\2\u0094"+
		"\26\3\2\2\2\u0095\u0096\7R\2\2\u0096\u0097\7T\2\2\u0097\u0098\7Q\2\2\u0098"+
		"\u0099\7E\2\2\u0099\u009a\7G\2\2\u009a\u009b\7F\2\2\u009b\u009c\7W\2\2"+
		"\u009c\u009d\7T\2\2\u009d\u009e\7G\2\2\u009e\30\3\2\2\2\u009f\u00a0\7"+
		"H\2\2\u00a0\u00a1\7W\2\2\u00a1\u00a2\7P\2\2\u00a2\u00a3\7E\2\2\u00a3\u00a4"+
		"\7V\2\2\u00a4\u00a5\7K\2\2\u00a5\u00a6\7Q\2\2\u00a6\u00a7\7P\2\2\u00a7"+
		"\32\3\2\2\2\u00a8\u00a9\7*\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\7+\2\2\u00ab"+
		"\36\3\2\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7v\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7i\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3 \3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7c\2"+
		"\2\u00b7\u00b8\7n\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7K\2\2\u00ba\u00bb\7"+
		"H\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\7J\2\2\u00be\u00bf"+
		"\7G\2\2\u00bf\u00c0\7P\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7G\2\2\u00c2\u00c3"+
		"\7N\2\2\u00c3\u00c4\7U\2\2\u00c4\u00c5\7G\2\2\u00c5(\3\2\2\2\u00c6\u00c7"+
		"\7Y\2\2\u00c7\u00c8\7J\2\2\u00c8\u00c9\7K\2\2\u00c9\u00ca\7N\2\2\u00ca"+
		"\u00cb\7G\2\2\u00cb*\3\2\2\2\u00cc\u00cd\7F\2\2\u00cd\u00ce\7Q\2\2\u00ce"+
		",\3\2\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7G\2\2\u00d1\u00d2\7R\2\2\u00d2"+
		"\u00d3\7G\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7V\2\2\u00d5.\3\2\2\2\u00d6"+
		"\u00d7\7W\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\7V\2\2\u00d9\u00da\7K\2\2"+
		"\u00da\u00db\7N\2\2\u00db\60\3\2\2\2\u00dc\u00dd\7H\2\2\u00dd\u00de\7"+
		"Q\2\2\u00de\u00df\7T\2\2\u00df\62\3\2\2\2\u00e0\u00e1\7<\2\2\u00e1\u00e2"+
		"\7?\2\2\u00e2\64\3\2\2\2\u00e3\u00e4\7V\2\2\u00e4\u00e5\7Q\2\2\u00e5\66"+
		"\3\2\2\2\u00e6\u00e7\7F\2\2\u00e7\u00e8\7Q\2\2\u00e8\u00e9\7Y\2\2\u00e9"+
		"\u00ea\7P\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ec\7Q\2\2\u00ec8\3\2\2\2\u00ed"+
		"\u00ee\7Q\2\2\u00ee\u00ef\7T\2\2\u00ef:\3\2\2\2\u00f0\u00f1\7C\2\2\u00f1"+
		"\u00f2\7P\2\2\u00f2\u00f3\7F\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7P\2\2\u00f5"+
		"\u00f6\7Q\2\2\u00f6\u00f7\7V\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7V\2\2\u00f9"+
		"\u00fa\7T\2\2\u00fa\u00fb\7W\2\2\u00fb\u00fc\7G\2\2\u00fc@\3\2\2\2\u00fd"+
		"\u00fe\7H\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7N\2\2\u0100\u0101\7U\2\2"+
		"\u0101\u0102\7G\2\2\u0102B\3\2\2\2\u0103\u0104\7>\2\2\u0104D\3\2\2\2\u0105"+
		"\u0106\7@\2\2\u0106F\3\2\2\2\u0107\u0108\7>\2\2\u0108\u0109\7?\2\2\u0109"+
		"H\3\2\2\2\u010a\u010b\7@\2\2\u010b\u010c\7?\2\2\u010cJ\3\2\2\2\u010d\u010e"+
		"\7-\2\2\u010eL\3\2\2\2\u010f\u0110\7/\2\2\u0110N\3\2\2\2\u0111\u0112\7"+
		",\2\2\u0112P\3\2\2\2\u0113\u0114\7F\2\2\u0114\u0115\7K\2\2\u0115\u0116"+
		"\7X\2\2\u0116R\3\2\2\2\u0117\u0118\7O\2\2\u0118\u0119\7Q\2\2\u0119\u011a"+
		"\7F\2\2\u011aT\3\2\2\2\u011b\u011e\5c\62\2\u011c\u011e\7a\2\2\u011d\u011b"+
		"\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0124\3\2\2\2\u0121\u0123\5e\63\2\u0122\u0121\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u012b\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u012a\5c\62\2\u0128\u012a\7a"+
		"\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012cV\3\2\2\2\u012d\u012b\3\2\2\2"+
		"\u012e\u0130\t\2\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u0133\5e\63\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135X\3\2\2\2\u0136\u013a\5g\64\2"+
		"\u0137\u013a\5i\65\2\u0138\u013a\5k\66\2\u0139\u0136\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u0138\3\2\2\2\u013aZ\3\2\2\2\u013b\u013d\7)\2\2\u013c\u013e"+
		"\n\3\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0145\3\2\2\2\u0141\u0142\7)\2\2\u0142\u0144\7)\2"+
		"\2\u0143\u0141\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\n\3\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u0162\7)\2\2\u014e\u0150\7$\2\2\u014f\u0151"+
		"\n\4\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0158\3\2\2\2\u0154\u0155\7$\2\2\u0155\u0157\7$\2"+
		"\2\u0156\u0154\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\n\4\2\2\u015c"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u0160\3\2\2\2\u0160\u0162\7$\2\2\u0161\u013b\3\2\2\2\u0161"+
		"\u014e\3\2\2\2\u0162\\\3\2\2\2\u0163\u0166\5_\60\2\u0164\u0166\5a\61\2"+
		"\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168"+
		"\b/\2\2\u0168^\3\2\2\2\u0169\u016d\7}\2\2\u016a\u016c\n\5\2\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\177\2\2\u0171`\3\2\2"+
		"\2\u0172\u0173\7*\2\2\u0173\u0174\7,\2\2\u0174\u0178\3\2\2\2\u0175\u0177"+
		"\n\6\2\2\u0176\u0175\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017f\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\7,"+
		"\2\2\u017c\u017e\n\7\2\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0185\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0184\n\6\2\2\u0183\u0182\3\2\2\2\u0184\u0187\3\2\2\2\u0185"+
		"\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0188\u0189\7,\2\2\u0189\u018a\7+\2\2\u018ab\3\2\2\2\u018b\u018c"+
		"\t\b\2\2\u018cd\3\2\2\2\u018d\u018e\t\t\2\2\u018ef\3\2\2\2\u018f\u0191"+
		"\t\2\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0194\5e\63\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\7\60\2\2\u0198"+
		"\u019a\t\2\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2"+
		"\2\2\u019b\u019d\5e\63\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fh\3\2\2\2\u01a0\u01a2\t\2\2\2"+
		"\u01a1\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a5"+
		"\5e\63\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\t\n\2\2\u01a9\u01ab\t\2"+
		"\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01ae\5e\63\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01af\u01b0\3\2\2\2\u01b0j\3\2\2\2\u01b1\u01b3\t\2\2\2\u01b2\u01b1"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6\5e\63\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7\60\2\2\u01ba\u01bc\5e\63\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\t\n\2\2\u01c0\u01c2\t\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\5e"+
		"\63\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7l\3\2\2\2\u01c8\u01ca\t\13\2\2\u01c9\u01c8\3\2\2\2"+
		"\u01ca\u01cb\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd"+
		"\3\2\2\2\u01cd\u01ce\b\67\3\2\u01cen\3\2\2\2%\2\u011d\u011f\u0124\u0129"+
		"\u012b\u012f\u0134\u0139\u013f\u0145\u014b\u0152\u0158\u015e\u0161\u0165"+
		"\u016d\u0178\u017f\u0185\u0190\u0195\u0199\u019e\u01a1\u01a6\u01aa\u01af"+
		"\u01b2\u01b7\u01bd\u01c1\u01c6\u01cb\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}