// Generated from Xana.g4 by ANTLR 4.3

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XanaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, ID=2, REAL_CONSTANT=3, SIMPLE_COMMENT=4, MULTILINE_COMMENT=5, 
		WS=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'"
	};
	public static final String[] ruleNames = {
		"NUM", "DECIMAL", "INT_CONSTANT", "ID", "REAL_CONSTANT", "SIMPLE_COMMENT", 
		"MULTILINE_COMMENT", "WS"
	};


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bi\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\6\3\30\n\3\r\3\16\3\31\3\3\6\3\35\n\3\r\3\16\3\36\3\3\3\3\7\3#\n\3\f"+
		"\3\16\3&\13\3\5\3(\n\3\3\4\6\4+\n\4\r\4\16\4,\3\5\3\5\7\5\61\n\5\f\5\16"+
		"\5\64\13\5\3\6\3\6\3\6\6\69\n\6\r\6\16\6:\5\6=\n\6\3\6\3\6\5\6A\n\6\3"+
		"\6\6\6D\n\6\r\6\16\6E\5\6H\n\6\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\5\7"+
		"R\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\4M\\\2\n\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21"+
		"\b\3\2\t\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2GGgg\4\2--//\4\3\f\f\17"+
		"\17\5\2\13\f\17\17\"\"s\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\'\3\2\2\2\7*\3\2\2\2\t.\3"+
		"\2\2\2\13G\3\2\2\2\rI\3\2\2\2\17U\3\2\2\2\21e\3\2\2\2\23\24\t\2\2\2\24"+
		"\4\3\2\2\2\25\27\7\60\2\2\26\30\5\3\2\2\27\26\3\2\2\2\30\31\3\2\2\2\31"+
		"\27\3\2\2\2\31\32\3\2\2\2\32(\3\2\2\2\33\35\5\3\2\2\34\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 $\7\60\2\2!#\5\3\2\2"+
		"\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%(\3\2\2\2&$\3\2\2\2\'\25\3"+
		"\2\2\2\'\34\3\2\2\2(\6\3\2\2\2)+\5\3\2\2*)\3\2\2\2+,\3\2\2\2,*\3\2\2\2"+
		",-\3\2\2\2-\b\3\2\2\2.\62\t\3\2\2/\61\t\4\2\2\60/\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\n\3\2\2\2\64\62\3\2\2\2\65H\5\5\3\2"+
		"\66=\5\5\3\2\679\5\3\2\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3"+
		"\2\2\2<\66\3\2\2\2<8\3\2\2\2=>\3\2\2\2>@\t\5\2\2?A\t\6\2\2@?\3\2\2\2@"+
		"A\3\2\2\2AC\3\2\2\2BD\5\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2"+
		"FH\3\2\2\2G\65\3\2\2\2G<\3\2\2\2H\f\3\2\2\2IM\7%\2\2JL\13\2\2\2KJ\3\2"+
		"\2\2LO\3\2\2\2MN\3\2\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\t\7\2\2QP\3\2"+
		"\2\2RS\3\2\2\2ST\b\7\2\2T\16\3\2\2\2UV\7$\2\2VW\7$\2\2WX\7$\2\2X\\\3\2"+
		"\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z\3\2\2\2]_\3\2\2\2^\\"+
		"\3\2\2\2_`\7$\2\2`a\7$\2\2ab\7$\2\2bc\3\2\2\2cd\b\b\2\2d\20\3\2\2\2ef"+
		"\t\b\2\2fg\3\2\2\2gh\b\t\2\2h\22\3\2\2\2\21\2\31\36$\',\62:<@EGMQ\\\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}