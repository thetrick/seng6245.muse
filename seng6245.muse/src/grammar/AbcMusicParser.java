// Generated from AbcMusic.g4 by ANTLR 4.5.3

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbcMusicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, INDEX=3, TITLE=4, COMPOSER=5, LENGTH=6, METER=7, 
		TEMPO=8, VOICE=9, KEY=10, COMMENT=11, NOTE=12, REST=13, DUPLET=14, TRIPLET=15, 
		QUAD=16, PIPE=17, LBRAC=18, RBRAC=19, LREPEAT=20, RREPEAT=21, ONE_REPEAT=22, 
		TWO_REPEAT=23, END_NOTES=24;
	public static final int
		RULE_abc_composition = 0, RULE_abc_header = 1, RULE_header_index = 2, 
		RULE_header_title = 3, RULE_optional_headers = 4, RULE_header_composer = 5, 
		RULE_header_length = 6, RULE_header_meter = 7, RULE_header_tempo = 8, 
		RULE_field_voice = 9, RULE_field_key = 10, RULE_abc_music = 11, RULE_line = 12, 
		RULE_measure = 13, RULE_note_element = 14, RULE_note = 15, RULE_rest = 16, 
		RULE_chord = 17, RULE_duplet = 18, RULE_triplet = 19, RULE_quadruplet = 20;
	public static final String[] ruleNames = {
		"abc_composition", "abc_header", "header_index", "header_title", "optional_headers", 
		"header_composer", "header_length", "header_meter", "header_tempo", "field_voice", 
		"field_key", "abc_music", "line", "measure", "note_element", "note", "rest", 
		"chord", "duplet", "triplet", "quadruplet"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'['", "']'", null, null, "'[1'", 
		"'[2'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "NEWLINE", "INDEX", "TITLE", "COMPOSER", "LENGTH", 
		"METER", "TEMPO", "VOICE", "KEY", "COMMENT", "NOTE", "REST", "DUPLET", 
		"TRIPLET", "QUAD", "PIPE", "LBRAC", "RBRAC", "LREPEAT", "RREPEAT", "ONE_REPEAT", 
		"TWO_REPEAT", "END_NOTES"
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

	@Override
	public String getGrammarFileName() { return "AbcMusic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AbcMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_compositionContext extends ParserRuleContext {
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AbcMusicParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(AbcMusicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AbcMusicParser.NEWLINE, i);
		}
		public Abc_compositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_composition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterAbc_composition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitAbc_composition(this);
		}
	}

	public final Abc_compositionContext abc_composition() throws RecognitionException {
		Abc_compositionContext _localctx = new Abc_compositionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_composition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			abc_header();
			setState(43);
			abc_music();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(44);
				match(NEWLINE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_headerContext extends ParserRuleContext {
		public Header_indexContext header_index() {
			return getRuleContext(Header_indexContext.class,0);
		}
		public Header_titleContext header_title() {
			return getRuleContext(Header_titleContext.class,0);
		}
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Optional_headersContext> optional_headers() {
			return getRuleContexts(Optional_headersContext.class);
		}
		public Optional_headersContext optional_headers(int i) {
			return getRuleContext(Optional_headersContext.class,i);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			header_index();
			setState(53);
			header_title();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMPOSER) | (1L << LENGTH) | (1L << METER) | (1L << TEMPO) | (1L << VOICE) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(54);
				optional_headers();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			field_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_indexContext extends ParserRuleContext {
		public TerminalNode INDEX() { return getToken(AbcMusicParser.INDEX, 0); }
		public Header_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterHeader_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitHeader_index(this);
		}
	}

	public final Header_indexContext header_index() throws RecognitionException {
		Header_indexContext _localctx = new Header_indexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INDEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_titleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(AbcMusicParser.TITLE, 0); }
		public Header_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterHeader_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitHeader_title(this);
		}
	}

	public final Header_titleContext header_title() throws RecognitionException {
		Header_titleContext _localctx = new Header_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(TITLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Optional_headersContext extends ParserRuleContext {
		public Header_composerContext header_composer() {
			return getRuleContext(Header_composerContext.class,0);
		}
		public Header_lengthContext header_length() {
			return getRuleContext(Header_lengthContext.class,0);
		}
		public Header_meterContext header_meter() {
			return getRuleContext(Header_meterContext.class,0);
		}
		public Header_tempoContext header_tempo() {
			return getRuleContext(Header_tempoContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(AbcMusicParser.COMMENT, 0); }
		public Optional_headersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_headers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterOptional_headers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitOptional_headers(this);
		}
	}

	public final Optional_headersContext optional_headers() throws RecognitionException {
		Optional_headersContext _localctx = new Optional_headersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_optional_headers);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case COMPOSER:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				header_composer();
				}
				break;
			case LENGTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				header_length();
				}
				break;
			case METER:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				header_meter();
				}
				break;
			case TEMPO:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				header_tempo();
				}
				break;
			case VOICE:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				match(COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_composerContext extends ParserRuleContext {
		public TerminalNode COMPOSER() { return getToken(AbcMusicParser.COMPOSER, 0); }
		public Header_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterHeader_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitHeader_composer(this);
		}
	}

	public final Header_composerContext header_composer() throws RecognitionException {
		Header_composerContext _localctx = new Header_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_header_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(COMPOSER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_lengthContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(AbcMusicParser.LENGTH, 0); }
		public Header_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterHeader_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitHeader_length(this);
		}
	}

	public final Header_lengthContext header_length() throws RecognitionException {
		Header_lengthContext _localctx = new Header_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_header_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(LENGTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_meterContext extends ParserRuleContext {
		public TerminalNode METER() { return getToken(AbcMusicParser.METER, 0); }
		public Header_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterHeader_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitHeader_meter(this);
		}
	}

	public final Header_meterContext header_meter() throws RecognitionException {
		Header_meterContext _localctx = new Header_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_header_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(METER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_tempoContext extends ParserRuleContext {
		public TerminalNode TEMPO() { return getToken(AbcMusicParser.TEMPO, 0); }
		public Header_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterHeader_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitHeader_tempo(this);
		}
	}

	public final Header_tempoContext header_tempo() throws RecognitionException {
		Header_tempoContext _localctx = new Header_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_header_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TEMPO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode VOICE() { return getToken(AbcMusicParser.VOICE, 0); }
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(VOICE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_keyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(AbcMusicParser.KEY, 0); }
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_musicContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<Field_voiceContext> field_voice() {
			return getRuleContexts(Field_voiceContext.class);
		}
		public Field_voiceContext field_voice(int i) {
			return getRuleContext(Field_voiceContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(AbcMusicParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(AbcMusicParser.COMMENT, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(AbcMusicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AbcMusicParser.NEWLINE, i);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_abc_music);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(95);
					switch (_input.LA(1)) {
					case NEWLINE:
					case NOTE:
					case REST:
					case DUPLET:
					case TRIPLET:
					case QUAD:
					case PIPE:
					case LBRAC:
					case LREPEAT:
					case ONE_REPEAT:
					case TWO_REPEAT:
						{
						setState(86);
						line();
						}
						break;
					case VOICE:
						{
						setState(87);
						field_voice();
						setState(91);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(88);
								match(NEWLINE);
								}
								} 
							}
							setState(93);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						}
						}
						break;
					case COMMENT:
						{
						setState(94);
						match(COMMENT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(97); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(AbcMusicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(AbcMusicParser.NEWLINE, i);
		}
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(99);
				match(NEWLINE);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(105);
					measure();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(108); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					match(NEWLINE);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasureContext extends ParserRuleContext {
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public TerminalNode LREPEAT() { return getToken(AbcMusicParser.LREPEAT, 0); }
		public TerminalNode ONE_REPEAT() { return getToken(AbcMusicParser.ONE_REPEAT, 0); }
		public TerminalNode TWO_REPEAT() { return getToken(AbcMusicParser.TWO_REPEAT, 0); }
		public List<TerminalNode> PIPE() { return getTokens(AbcMusicParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(AbcMusicParser.PIPE, i);
		}
		public TerminalNode END_NOTES() { return getToken(AbcMusicParser.END_NOTES, 0); }
		public TerminalNode NEWLINE() { return getToken(AbcMusicParser.NEWLINE, 0); }
		public TerminalNode RREPEAT() { return getToken(AbcMusicParser.RREPEAT, 0); }
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_measure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE) | (1L << LREPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) {
				{
				setState(116);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE) | (1L << LREPEAT) | (1L << ONE_REPEAT) | (1L << TWO_REPEAT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(124);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << PIPE) | (1L << RREPEAT) | (1L << END_NOTES))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_elementContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public DupletContext duplet() {
			return getRuleContext(DupletContext.class,0);
		}
		public TripletContext triplet() {
			return getRuleContext(TripletContext.class,0);
		}
		public QuadrupletContext quadruplet() {
			return getRuleContext(QuadrupletContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_note_element);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				note();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				rest();
				}
				break;
			case LBRAC:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				chord();
				}
				break;
			case DUPLET:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				duplet();
				}
				break;
			case TRIPLET:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				triplet();
				}
				break;
			case QUAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				quadruplet();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE() { return getToken(AbcMusicParser.NOTE, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(AbcMusicParser.REST, 0); }
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(REST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChordContext extends ParserRuleContext {
		public TerminalNode LBRAC() { return getToken(AbcMusicParser.LBRAC, 0); }
		public TerminalNode RBRAC() { return getToken(AbcMusicParser.RBRAC, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<RestContext> rest() {
			return getRuleContexts(RestContext.class);
		}
		public RestContext rest(int i) {
			return getRuleContext(RestContext.class,i);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(LBRAC);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(142);
				switch (_input.LA(1)) {
				case NOTE:
					{
					setState(140);
					note();
					}
					break;
				case REST:
					{
					setState(141);
					rest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOTE || _la==REST );
			setState(146);
			match(RBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DupletContext extends ParserRuleContext {
		public TerminalNode DUPLET() { return getToken(AbcMusicParser.DUPLET, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public DupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterDuplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitDuplet(this);
		}
	}

	public final DupletContext duplet() throws RecognitionException {
		DupletContext _localctx = new DupletContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_duplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(DUPLET);
			setState(151);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(149);
				note();
				}
				break;
			case LBRAC:
				{
				setState(150);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(155);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(153);
				note();
				}
				break;
			case LBRAC:
				{
				setState(154);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripletContext extends ParserRuleContext {
		public TerminalNode TRIPLET() { return getToken(AbcMusicParser.TRIPLET, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public TripletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterTriplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitTriplet(this);
		}
	}

	public final TripletContext triplet() throws RecognitionException {
		TripletContext _localctx = new TripletContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_triplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(TRIPLET);
			setState(160);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(158);
				note();
				}
				break;
			case LBRAC:
				{
				setState(159);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(162);
				note();
				}
				break;
			case LBRAC:
				{
				setState(163);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(168);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(166);
				note();
				}
				break;
			case LBRAC:
				{
				setState(167);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuadrupletContext extends ParserRuleContext {
		public TerminalNode QUAD() { return getToken(AbcMusicParser.QUAD, 0); }
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<ChordContext> chord() {
			return getRuleContexts(ChordContext.class);
		}
		public ChordContext chord(int i) {
			return getRuleContext(ChordContext.class,i);
		}
		public QuadrupletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadruplet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).enterQuadruplet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AbcMusicListener ) ((AbcMusicListener)listener).exitQuadruplet(this);
		}
	}

	public final QuadrupletContext quadruplet() throws RecognitionException {
		QuadrupletContext _localctx = new QuadrupletContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_quadruplet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(QUAD);
			setState(173);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(171);
				note();
				}
				break;
			case LBRAC:
				{
				setState(172);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(177);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(175);
				note();
				}
				break;
			case LBRAC:
				{
				setState(176);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(181);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(179);
				note();
				}
				break;
			case LBRAC:
				{
				setState(180);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(185);
			switch (_input.LA(1)) {
			case NOTE:
				{
				setState(183);
				note();
				}
				break;
			case LBRAC:
				{
				setState(184);
				chord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\7\3:\n\3\f\3\16\3=\13\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\\\n\r\f\r\16\r_\13\r\3\r\6\rb\n"+
		"\r\r\r\16\rc\3\16\7\16g\n\16\f\16\16\16j\13\16\3\16\6\16m\n\16\r\16\16"+
		"\16n\3\16\7\16r\n\16\f\16\16\16u\13\16\3\17\5\17x\n\17\3\17\6\17{\n\17"+
		"\r\17\16\17|\3\17\5\17\u0080\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0088"+
		"\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\6\23\u0091\n\23\r\23\16\23\u0092"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u009a\n\24\3\24\3\24\5\24\u009e\n\24\3"+
		"\25\3\25\3\25\5\25\u00a3\n\25\3\25\3\25\5\25\u00a7\n\25\3\25\3\25\5\25"+
		"\u00ab\n\25\3\26\3\26\3\26\5\26\u00b0\n\26\3\26\3\26\5\26\u00b4\n\26\3"+
		"\26\3\26\5\26\u00b8\n\26\3\26\3\26\5\26\u00bc\n\26\3\26\2\2\27\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\5\2\23\23\26\26\30\31\6\2\4"+
		"\4\23\23\27\27\32\32\u00c9\2,\3\2\2\2\4\66\3\2\2\2\6@\3\2\2\2\bB\3\2\2"+
		"\2\nJ\3\2\2\2\fL\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22R\3\2\2\2\24T\3\2\2"+
		"\2\26V\3\2\2\2\30a\3\2\2\2\32h\3\2\2\2\34w\3\2\2\2\36\u0087\3\2\2\2 \u0089"+
		"\3\2\2\2\"\u008b\3\2\2\2$\u008d\3\2\2\2&\u0096\3\2\2\2(\u009f\3\2\2\2"+
		"*\u00ac\3\2\2\2,-\5\4\3\2-\61\5\30\r\2.\60\7\4\2\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2"+
		"\3\65\3\3\2\2\2\66\67\5\6\4\2\67;\5\b\5\28:\5\n\6\298\3\2\2\2:=\3\2\2"+
		"\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\5\26\f\2?\5\3\2\2\2@A\7\5"+
		"\2\2A\7\3\2\2\2BC\7\6\2\2C\t\3\2\2\2DK\5\f\7\2EK\5\16\b\2FK\5\20\t\2G"+
		"K\5\22\n\2HK\5\24\13\2IK\7\r\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2JG\3\2\2"+
		"\2JH\3\2\2\2JI\3\2\2\2K\13\3\2\2\2LM\7\7\2\2M\r\3\2\2\2NO\7\b\2\2O\17"+
		"\3\2\2\2PQ\7\t\2\2Q\21\3\2\2\2RS\7\n\2\2S\23\3\2\2\2TU\7\13\2\2U\25\3"+
		"\2\2\2VW\7\f\2\2W\27\3\2\2\2Xb\5\32\16\2Y]\5\24\13\2Z\\\7\4\2\2[Z\3\2"+
		"\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^b\3\2\2\2_]\3\2\2\2`b\7\r\2\2aX\3"+
		"\2\2\2aY\3\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\31\3\2\2\2e"+
		"g\7\4\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"km\5\34\17\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pr\7\4\2"+
		"\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\33\3\2\2\2us\3\2\2\2vx\t\2"+
		"\2\2wv\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\5\36\20\2zy\3\2\2\2{|\3\2\2\2|z\3"+
		"\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\35\3\2\2\2\u0081\u0088\5 \21\2\u0082\u0088\5\"\22\2\u0083"+
		"\u0088\5$\23\2\u0084\u0088\5&\24\2\u0085\u0088\5(\25\2\u0086\u0088\5*"+
		"\26\2\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\37\3\2\2"+
		"\2\u0089\u008a\7\16\2\2\u008a!\3\2\2\2\u008b\u008c\7\17\2\2\u008c#\3\2"+
		"\2\2\u008d\u0090\7\24\2\2\u008e\u0091\5 \21\2\u008f\u0091\5\"\22\2\u0090"+
		"\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\25\2\2\u0095"+
		"%\3\2\2\2\u0096\u0099\7\20\2\2\u0097\u009a\5 \21\2\u0098\u009a\5$\23\2"+
		"\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u009e"+
		"\5 \21\2\u009c\u009e\5$\23\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\'\3\2\2\2\u009f\u00a2\7\21\2\2\u00a0\u00a3\5 \21\2\u00a1\u00a3\5$\23"+
		"\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a7"+
		"\5 \21\2\u00a5\u00a7\5$\23\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00ab\5 \21\2\u00a9\u00ab\5$\23\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab)\3\2\2\2\u00ac\u00af\7\22\2\2\u00ad\u00b0"+
		"\5 \21\2\u00ae\u00b0\5$\23\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00b4\5 \21\2\u00b2\u00b4\5$\23\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b8\5 \21\2\u00b6"+
		"\u00b8\5$\23\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2"+
		"\2\2\u00b9\u00bc\5 \21\2\u00ba\u00bc\5$\23\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc+\3\2\2\2\32\61;J]achnsw|\177\u0087\u0090\u0092\u0099"+
		"\u009d\u00a2\u00a6\u00aa\u00af\u00b3\u00b7\u00bb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}