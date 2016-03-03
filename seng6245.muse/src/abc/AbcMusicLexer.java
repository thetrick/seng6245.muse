// Generated from AbcMusic.g4 by ANTLR 4.5.2

package abc;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcMusicLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, COMMENT=3, HEADER_INDEX=4, HEADER_TITLE=5, HEADER_COMPOSER=6, 
		HEADER_LENGTH=7, HEADER_METER=8, HEADER_TEMPO=9, HEADER_VOICE=10, HEADER_KEY=11, 
		NOTE=12, REST=13, DUPLET=14, TRIPLET=15, QUADRUPLET=16, BAR_LINE=17, CHORD_OPEN=18, 
		CHORD_CLOSE=19, REPEAT_BEGIN=20, REPEAT_END=21, REPEAT_ONE=22, REPEAT_TWO=23, 
		END_MAJOR_SECTION=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "NEWLINE", "COMMENT", "HEADER_INDEX", "HEADER_TITLE", "HEADER_COMPOSER", 
		"HEADER_LENGTH", "HEADER_METER", "HEADER_TEMPO", "HEADER_VOICE", "HEADER_KEY", 
		"NOTE", "REST", "DUPLET", "TRIPLET", "QUADRUPLET", "BAR_LINE", "CHORD_OPEN", 
		"CHORD_CLOSE", "REPEAT_BEGIN", "REPEAT_END", "REPEAT_ONE", "REPEAT_TWO", 
		"END_MAJOR_SECTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'['", "']'", null, null, "'[1'", 
		"'[2'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "COMMENT", "HEADER_INDEX", "HEADER_TITLE", 
		"HEADER_COMPOSER", "HEADER_LENGTH", "HEADER_METER", "HEADER_TEMPO", "HEADER_VOICE", 
		"HEADER_KEY", "NOTE", "REST", "DUPLET", "TRIPLET", "QUADRUPLET", "BAR_LINE", 
		"CHORD_OPEN", "CHORD_CLOSE", "REPEAT_BEGIN", "REPEAT_END", "REPEAT_ONE", 
		"REPEAT_TWO", "END_MAJOR_SECTION"
	};
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


	public AbcMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AbcMusic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u01ac\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4A"+
		"\n\4\f\4\16\4D\13\4\3\4\6\4G\n\4\r\4\16\4H\5\4K\n\4\3\5\3\5\3\5\3\5\7"+
		"\5Q\n\5\f\5\16\5T\13\5\3\5\6\5W\n\5\r\5\16\5X\3\5\7\5\\\n\5\f\5\16\5_"+
		"\13\5\3\5\6\5b\n\5\r\5\16\5c\3\6\3\6\3\6\3\6\7\6j\n\6\f\6\16\6m\13\6\3"+
		"\6\6\6p\n\6\r\6\16\6q\3\6\7\6u\n\6\f\6\16\6x\13\6\3\6\6\6{\n\6\r\6\16"+
		"\6|\3\7\3\7\3\7\3\7\7\7\u0083\n\7\f\7\16\7\u0086\13\7\3\7\6\7\u0089\n"+
		"\7\r\7\16\7\u008a\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\7\6\7\u0094"+
		"\n\7\r\7\16\7\u0095\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b"+
		"\3\b\6\b\u00a2\n\b\r\b\16\b\u00a3\3\b\3\b\6\b\u00a8\n\b\r\b\16\b\u00a9"+
		"\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\6\b\u00b3\n\b\r\b\16\b\u00b4"+
		"\3\t\3\t\3\t\3\t\7\t\u00bb\n\t\f\t\16\t\u00be\13\t\3\t\3\t\3\t\3\t\6\t"+
		"\u00c4\n\t\r\t\16\t\u00c5\3\t\3\t\6\t\u00ca\n\t\r\t\16\t\u00cb\5\t\u00ce"+
		"\n\t\3\t\7\t\u00d1\n\t\f\t\16\t\u00d4\13\t\3\t\6\t\u00d7\n\t\r\t\16\t"+
		"\u00d8\3\n\3\n\3\n\3\n\7\n\u00df\n\n\f\n\16\n\u00e2\13\n\3\n\6\n\u00e5"+
		"\n\n\r\n\16\n\u00e6\3\n\3\n\6\n\u00eb\n\n\r\n\16\n\u00ec\3\n\7\n\u00f0"+
		"\n\n\f\n\16\n\u00f3\13\n\3\n\5\n\u00f6\n\n\3\n\7\n\u00f9\n\n\f\n\16\n"+
		"\u00fc\13\n\3\n\6\n\u00ff\n\n\r\n\16\n\u0100\3\n\7\n\u0104\n\n\f\n\16"+
		"\n\u0107\13\n\3\n\6\n\u010a\n\n\r\n\16\n\u010b\3\13\3\13\3\13\3\13\7\13"+
		"\u0112\n\13\f\13\16\13\u0115\13\13\3\13\6\13\u0118\n\13\r\13\16\13\u0119"+
		"\3\13\7\13\u011d\n\13\f\13\16\13\u0120\13\13\3\13\6\13\u0123\n\13\r\13"+
		"\16\13\u0124\3\f\3\f\3\f\3\f\7\f\u012b\n\f\f\f\16\f\u012e\13\f\3\f\3\f"+
		"\5\f\u0132\n\f\3\f\5\f\u0135\n\f\3\f\7\f\u0138\n\f\f\f\16\f\u013b\13\f"+
		"\3\f\6\f\u013e\n\f\r\f\16\f\u013f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0149"+
		"\n\r\3\r\3\r\7\r\u014d\n\r\f\r\16\r\u0150\13\r\3\r\7\r\u0153\n\r\f\r\16"+
		"\r\u0156\13\r\3\r\3\r\6\r\u015a\n\r\r\r\16\r\u015b\3\r\6\r\u015f\n\r\r"+
		"\r\16\r\u0160\3\r\5\r\u0164\n\r\3\r\5\r\u0167\n\r\3\16\3\16\7\16\u016b"+
		"\n\16\f\16\16\16\u016e\13\16\3\16\3\16\6\16\u0172\n\16\r\16\16\16\u0173"+
		"\3\16\6\16\u0177\n\16\r\16\16\16\u0178\3\16\5\16\u017c\n\16\3\16\5\16"+
		"\u017f\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\5\22\u018d\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0198"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u019f\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\5\31\u01ab\n\31\3B\2\32\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\3\2\f\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\13\2"+
		"\"#%%(+..\60\60\62;AAC\\c|\b\2\"\"))\60\60\62;C\\c|\5\2\62;C\\c|\4\2C"+
		"Ici\5\2%%))dd\4\2))..\3\2\63;\u01f1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\64\3\2\2\2\5:\3\2"+
		"\2\2\7J\3\2\2\2\tL\3\2\2\2\13e\3\2\2\2\r~\3\2\2\2\17\u0097\3\2\2\2\21"+
		"\u00b6\3\2\2\2\23\u00da\3\2\2\2\25\u010d\3\2\2\2\27\u0126\3\2\2\2\31\u0148"+
		"\3\2\2\2\33\u0168\3\2\2\2\35\u0180\3\2\2\2\37\u0183\3\2\2\2!\u0186\3\2"+
		"\2\2#\u018c\3\2\2\2%\u018e\3\2\2\2\'\u0190\3\2\2\2)\u0197\3\2\2\2+\u019e"+
		"\3\2\2\2-\u01a0\3\2\2\2/\u01a3\3\2\2\2\61\u01aa\3\2\2\2\63\65\t\2\2\2"+
		"\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28"+
		"9\b\2\2\29\4\3\2\2\2:;\t\3\2\2;\6\3\2\2\2<=\7\'\2\2=K\7\f\2\2>B\7\'\2"+
		"\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CF\3\2\2\2DB\3\2"+
		"\2\2EG\t\3\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J<\3\2"+
		"\2\2J>\3\2\2\2K\b\3\2\2\2LM\7Z\2\2MN\7<\2\2NR\3\2\2\2OQ\7\"\2\2PO\3\2"+
		"\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2\2\2UW\t\4\2\2VU\3\2"+
		"\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y]\3\2\2\2Z\\\7\"\2\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\t\3\2\2a`\3\2\2\2bc\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2d\n\3\2\2\2ef\7V\2\2fg\7<\2\2gk\3\2\2\2hj\7"+
		"\"\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\t"+
		"\5\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rv\3\2\2\2su\7\"\2\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\t\3\2\2zy\3"+
		"\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\f\3\2\2\2~\177\7E\2\2\177\u0080"+
		"\7<\2\2\u0080\u0084\3\2\2\2\u0081\u0083\7\"\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0089\t\6\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008f\3\2"+
		"\2\2\u008c\u008e\7\"\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0092\u0094\t\3\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\16\3\2\2\2\u0097\u0098\7N\2\2"+
		"\u0098\u0099\7<\2\2\u0099\u009d\3\2\2\2\u009a\u009c\7\"\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a7\7\61\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ae\3\2\2\2\u00ab\u00ad\7\"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\20\3\2\2\2\u00b6\u00b7"+
		"\7O\2\2\u00b7\u00b8\7<\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\7\"\2\2\u00ba"+
		"\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00cd\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00ce\7E\2\2\u00c0"+
		"\u00c1\7E\2\2\u00c1\u00ce\7~\2\2\u00c2\u00c4\t\4\2\2\u00c3\u00c2\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c9\7\61\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c8\3\2\2\2"+
		"\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce"+
		"\3\2\2\2\u00cd\u00bf\3\2\2\2\u00cd\u00c0\3\2\2\2\u00cd\u00c3\3\2\2\2\u00ce"+
		"\u00d2\3\2\2\2\u00cf\u00d1\7\"\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\22\3\2\2\2\u00da\u00db"+
		"\7S\2\2\u00db\u00dc\7<\2\2\u00dc\u00e0\3\2\2\2\u00dd\u00df\7\"\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00f5\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\t\4\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7\61\2\2\u00e9\u00eb\t\4\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00f1\3\2\2\2\u00ee\u00f0\7\"\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\7?\2\2\u00f5\u00e4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\7\"\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\t\4\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0104\7\"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010a\t\3\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\24\3\2\2\2\u010d\u010e"+
		"\7X\2\2\u010e\u010f\7<\2\2\u010f\u0113\3\2\2\2\u0110\u0112\7\"\2\2\u0111"+
		"\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\t\7\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011e\3\2\2\2\u011b\u011d\7\"\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0122\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0123\t\3\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\26\3\2\2"+
		"\2\u0126\u0127\7M\2\2\u0127\u0128\7<\2\2\u0128\u012c\3\2\2\2\u0129\u012b"+
		"\7\"\2\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0131\t\b"+
		"\2\2\u0130\u0132\t\t\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0134\3\2\2\2\u0133\u0135\7o\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0139\3\2\2\2\u0136\u0138\7\"\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013e\t\3\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\30\3\2\2"+
		"\2\u0141\u0149\7`\2\2\u0142\u0143\7`\2\2\u0143\u0149\7`\2\2\u0144\u0149"+
		"\7a\2\2\u0145\u0146\7a\2\2\u0146\u0149\7a\2\2\u0147\u0149\7?\2\2\u0148"+
		"\u0141\3\2\2\2\u0148\u0142\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0145\3\2"+
		"\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014e\t\b\2\2\u014b\u014d\t\n\2\2\u014c\u014b\3\2\2\2\u014d\u0150\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0166\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0151\u0153\t\13\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\7\61\2\2\u0158\u015a\t\13\2\2\u0159\u0158\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u0167\3\2\2\2\u015d\u015f\t\13\2\2\u015e\u015d\3\2\2\2\u015f\u0160\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0164\7\61\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0167\7\61\2\2\u0166\u0154\3\2\2\2\u0166\u015e\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\32\3\2\2\2\u0168\u017e\7|\2\2"+
		"\u0169\u016b\t\13\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0171\7\61\2\2\u0170\u0172\t\13\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u017f\3\2\2\2\u0175"+
		"\u0177\t\13\2\2\u0176\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0176\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u017b\3\2\2\2\u017a\u017c\7\61\2\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017f\7\61"+
		"\2\2\u017e\u016c\3\2\2\2\u017e\u0176\3\2\2\2\u017e\u017d\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\34\3\2\2\2\u0180\u0181\7*\2\2\u0181\u0182\7\64\2"+
		"\2\u0182\36\3\2\2\2\u0183\u0184\7*\2\2\u0184\u0185\7\65\2\2\u0185 \3\2"+
		"\2\2\u0186\u0187\7*\2\2\u0187\u0188\7\66\2\2\u0188\"\3\2\2\2\u0189\u018d"+
		"\7~\2\2\u018a\u018b\7]\2\2\u018b\u018d\7~\2\2\u018c\u0189\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d$\3\2\2\2\u018e\u018f\7]\2\2\u018f&\3\2\2\2\u0190"+
		"\u0191\7_\2\2\u0191(\3\2\2\2\u0192\u0193\7~\2\2\u0193\u0198\7<\2\2\u0194"+
		"\u0195\7~\2\2\u0195\u0196\7~\2\2\u0196\u0198\7<\2\2\u0197\u0192\3\2\2"+
		"\2\u0197\u0194\3\2\2\2\u0198*\3\2\2\2\u0199\u019a\7<\2\2\u019a\u019f\7"+
		"~\2\2\u019b\u019c\7<\2\2\u019c\u019d\7~\2\2\u019d\u019f\7~\2\2\u019e\u0199"+
		"\3\2\2\2\u019e\u019b\3\2\2\2\u019f,\3\2\2\2\u01a0\u01a1\7]\2\2\u01a1\u01a2"+
		"\7\63\2\2\u01a2.\3\2\2\2\u01a3\u01a4\7]\2\2\u01a4\u01a5\7\64\2\2\u01a5"+
		"\60\3\2\2\2\u01a6\u01a7\7~\2\2\u01a7\u01ab\7_\2\2\u01a8\u01a9\7~\2\2\u01a9"+
		"\u01ab\7~\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\62\3\2\2\2"+
		"@\2\66BHJRX]ckqv|\u0084\u008a\u008f\u0095\u009d\u00a3\u00a9\u00ae\u00b4"+
		"\u00bc\u00c5\u00cb\u00cd\u00d2\u00d8\u00e0\u00e6\u00ec\u00f1\u00f5\u00fa"+
		"\u0100\u0105\u010b\u0113\u0119\u011e\u0124\u012c\u0131\u0134\u0139\u013f"+
		"\u0148\u014e\u0154\u015b\u0160\u0163\u0166\u016c\u0173\u0178\u017b\u017e"+
		"\u018c\u0197\u019e\u01aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}