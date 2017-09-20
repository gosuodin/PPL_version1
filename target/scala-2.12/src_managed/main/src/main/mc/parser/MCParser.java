// Generated from src/main/mc/parser/MC.g4 by ANTLR 4.6

	package mc.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, ADDOP=2, SUBOP=3, MULOP=4, DIVOP=5, NOTOP=6, MODULOP=7, OROP=8, 
		ANDOP=9, NEQ=10, EQ=11, LT=12, GT=13, LTQ=14, GTQ=15, ASSIGN=16, BOOLIT=17, 
		BOOLTYPE=18, BREAKTYPE=19, CONTINUETYPE=20, ELSETYPE=21, FORTYPE=22, FLOATTYPE=23, 
		IFTYPE=24, INTTYPE=25, RETURNTYPE=26, VOIDTYPE=27, DOTYPE=28, WHILETYPE=29, 
		TRUETYPE=30, FALSETYPE=31, STRINGTYPE=32, LB=33, RB=34, LP=35, RP=36, 
		LSB=37, RSB=38, SEMI=39, COMMA=40, INTLIT=41, ID=42, WS=43, FLOATLIT=44, 
		ILLEGAL_ESCAPE=45, UNCLOSE_STRING=46, ERROR_CHAR=47, STRINGLIT=48;
	public static final int
		RULE_program = 0, RULE_declarations = 1, RULE_variabledeclarations = 2, 
		RULE_primitivetype = 3, RULE_variable = 4, RULE_manyvariable = 5, RULE_functiondeclarations = 6, 
		RULE_type = 7, RULE_arraypointtype = 8, RULE_inputpara = 9, RULE_outputpara = 10, 
		RULE_funtionname = 11, RULE_parameterlist = 12, RULE_parameterdeclaration = 13, 
		RULE_blockstatement = 14, RULE_expressionstatement = 15, RULE_statementpart = 16, 
		RULE_ifstatement = 17, RULE_dowhilestatement = 18, RULE_forstatement = 19, 
		RULE_breakstatement = 20, RULE_continuestatement = 21, RULE_returnstatement = 22, 
		RULE_functioncall = 23, RULE_list_expression = 24, RULE_expression = 25, 
		RULE_expression1 = 26, RULE_expression2 = 27, RULE_expression3 = 28, RULE_expression4 = 29, 
		RULE_expression5 = 30, RULE_expression6 = 31, RULE_expression7 = 32, RULE_expression8 = 33, 
		RULE_expression9 = 34;
	public static final String[] ruleNames = {
		"program", "declarations", "variabledeclarations", "primitivetype", "variable", 
		"manyvariable", "functiondeclarations", "type", "arraypointtype", "inputpara", 
		"outputpara", "funtionname", "parameterlist", "parameterdeclaration", 
		"blockstatement", "expressionstatement", "statementpart", "ifstatement", 
		"dowhilestatement", "forstatement", "breakstatement", "continuestatement", 
		"returnstatement", "functioncall", "list_expression", "expression", "expression1", 
		"expression2", "expression3", "expression4", "expression5", "expression6", 
		"expression7", "expression8", "expression9"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'+'", "'-'", "'*'", "'/'", "'!'", "'%'", "'||'", "'&&'", 
		"'!='", "'=='", "'<'", "'>'", "'<='", "'>='", "'='", null, "'boolean'", 
		"'break'", "'continue'", "'else'", "'for'", "'float'", "'if'", "'int'", 
		"'return'", "'void'", "'do'", "'while'", "'true'", "'false'", "'string'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "ADDOP", "SUBOP", "MULOP", "DIVOP", "NOTOP", "MODULOP", 
		"OROP", "ANDOP", "NEQ", "EQ", "LT", "GT", "LTQ", "GTQ", "ASSIGN", "BOOLIT", 
		"BOOLTYPE", "BREAKTYPE", "CONTINUETYPE", "ELSETYPE", "FORTYPE", "FLOATTYPE", 
		"IFTYPE", "INTTYPE", "RETURNTYPE", "VOIDTYPE", "DOTYPE", "WHILETYPE", 
		"TRUETYPE", "FALSETYPE", "STRINGTYPE", "LB", "RB", "LP", "RP", "LSB", 
		"RSB", "SEMI", "COMMA", "INTLIT", "ID", "WS", "FLOATLIT", "ILLEGAL_ESCAPE", 
		"UNCLOSE_STRING", "ERROR_CHAR", "STRINGLIT"
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
	public String getGrammarFileName() { return "MC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MCParser.EOF, 0); }
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				declarations();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLTYPE) | (1L << FLOATTYPE) | (1L << INTTYPE) | (1L << VOIDTYPE) | (1L << STRINGTYPE))) != 0) );
			setState(75);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public VariabledeclarationsContext variabledeclarations() {
			return getRuleContext(VariabledeclarationsContext.class,0);
		}
		public FunctiondeclarationsContext functiondeclarations() {
			return getRuleContext(FunctiondeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(77);
				variabledeclarations();
				}
				break;
			case 2:
				{
				setState(78);
				functiondeclarations();
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

	public static class VariabledeclarationsContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ManyvariableContext manyvariable() {
			return getRuleContext(ManyvariableContext.class,0);
		}
		public VariabledeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variabledeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVariabledeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariabledeclarationsContext variabledeclarations() throws RecognitionException {
		VariabledeclarationsContext _localctx = new VariabledeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variabledeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			primitivetype();
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82);
				variable();
				}
				break;
			case 2:
				{
				setState(83);
				manyvariable();
				}
				break;
			}
			setState(86);
			match(SEMI);
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

	public static class PrimitivetypeContext extends ParserRuleContext {
		public TerminalNode INTTYPE() { return getToken(MCParser.INTTYPE, 0); }
		public TerminalNode FLOATTYPE() { return getToken(MCParser.FLOATTYPE, 0); }
		public TerminalNode STRINGTYPE() { return getToken(MCParser.STRINGTYPE, 0); }
		public TerminalNode BOOLTYPE() { return getToken(MCParser.BOOLTYPE, 0); }
		public PrimitivetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivetype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitPrimitivetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivetypeContext primitivetype() throws RecognitionException {
		PrimitivetypeContext _localctx = new PrimitivetypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitivetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLTYPE) | (1L << FLOATTYPE) | (1L << INTTYPE) | (1L << STRINGTYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode INTLIT() { return getToken(MCParser.INTLIT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(91);
				match(LSB);
				setState(92);
				match(INTLIT);
				setState(93);
				match(RSB);
				}
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

	public static class ManyvariableContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MCParser.COMMA, i);
		}
		public ManyvariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manyvariable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitManyvariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManyvariableContext manyvariable() throws RecognitionException {
		ManyvariableContext _localctx = new ManyvariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_manyvariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			variable();
			setState(99); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				match(COMMA);
				setState(98);
				variable();
				}
				}
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
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

	public static class FunctiondeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuntionnameContext funtionname() {
			return getRuleContext(FuntionnameContext.class,0);
		}
		public TerminalNode LB() { return getToken(MCParser.LB, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public TerminalNode RB() { return getToken(MCParser.RB, 0); }
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public FunctiondeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFunctiondeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationsContext functiondeclarations() throws RecognitionException {
		FunctiondeclarationsContext _localctx = new FunctiondeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functiondeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			funtionname();
			setState(105);
			match(LB);
			setState(106);
			parameterlist();
			setState(107);
			match(RB);
			setState(108);
			blockstatement();
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TerminalNode VOIDTYPE() { return getToken(MCParser.VOIDTYPE, 0); }
		public OutputparaContext outputpara() {
			return getRuleContext(OutputparaContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(110);
				primitivetype();
				}
				break;
			case 2:
				{
				setState(111);
				match(VOIDTYPE);
				}
				break;
			case 3:
				{
				setState(112);
				outputpara();
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

	public static class ArraypointtypeContext extends ParserRuleContext {
		public InputparaContext inputpara() {
			return getRuleContext(InputparaContext.class,0);
		}
		public OutputparaContext outputpara() {
			return getRuleContext(OutputparaContext.class,0);
		}
		public ArraypointtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraypointtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitArraypointtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraypointtypeContext arraypointtype() throws RecognitionException {
		ArraypointtypeContext _localctx = new ArraypointtypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arraypointtype);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				inputpara();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				outputpara();
				}
				break;
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

	public static class InputparaContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public InputparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputpara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitInputpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputparaContext inputpara() throws RecognitionException {
		InputparaContext _localctx = new InputparaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			primitivetype();
			setState(120);
			match(ID);
			setState(121);
			match(LSB);
			setState(122);
			match(RSB);
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

	public static class OutputparaContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public OutputparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputpara; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitOutputpara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputparaContext outputpara() throws RecognitionException {
		OutputparaContext _localctx = new OutputparaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_outputpara);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			primitivetype();
			setState(125);
			match(LSB);
			setState(126);
			match(RSB);
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

	public static class FuntionnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public FuntionnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtionname; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFuntionname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionnameContext funtionname() throws RecognitionException {
		FuntionnameContext _localctx = new FuntionnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funtionname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(ID);
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

	public static class ParameterlistContext extends ParserRuleContext {
		public List<ParameterdeclarationContext> parameterdeclaration() {
			return getRuleContexts(ParameterdeclarationContext.class);
		}
		public ParameterdeclarationContext parameterdeclaration(int i) {
			return getRuleContext(ParameterdeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MCParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MCParser.COMMA, i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameterlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLTYPE) | (1L << FLOATTYPE) | (1L << INTTYPE) | (1L << STRINGTYPE))) != 0)) {
				{
				setState(130);
				parameterdeclaration();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					parameterdeclaration();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public PrimitivetypeContext primitivetype() {
			return getRuleContext(PrimitivetypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LSB() { return getToken(MCParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(MCParser.RSB, 0); }
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitParameterdeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			primitivetype();
			setState(141);
			match(ID);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSB) {
				{
				setState(142);
				match(LSB);
				setState(143);
				match(RSB);
				}
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

	public static class BlockstatementContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(MCParser.LP, 0); }
		public TerminalNode RP() { return getToken(MCParser.RP, 0); }
		public List<VariabledeclarationsContext> variabledeclarations() {
			return getRuleContexts(VariabledeclarationsContext.class);
		}
		public VariabledeclarationsContext variabledeclarations(int i) {
			return getRuleContext(VariabledeclarationsContext.class,i);
		}
		public List<StatementpartContext> statementpart() {
			return getRuleContexts(StatementpartContext.class);
		}
		public StatementpartContext statementpart(int i) {
			return getRuleContext(StatementpartContext.class,i);
		}
		public BlockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitBlockstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockstatementContext blockstatement() throws RecognitionException {
		BlockstatementContext _localctx = new BlockstatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(LP);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLTYPE) | (1L << FLOATTYPE) | (1L << INTTYPE) | (1L << STRINGTYPE))) != 0)) {
				{
				{
				setState(147);
				variabledeclarations();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBOP) | (1L << NOTOP) | (1L << BOOLIT) | (1L << BREAKTYPE) | (1L << CONTINUETYPE) | (1L << FORTYPE) | (1L << IFTYPE) | (1L << RETURNTYPE) | (1L << DOTYPE) | (1L << LB) | (1L << LP) | (1L << INTLIT) | (1L << ID) | (1L << FLOATLIT) | (1L << STRINGLIT))) != 0)) {
				{
				{
				setState(153);
				statementpart();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RP);
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

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpressionstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			expression();
			setState(162);
			match(SEMI);
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

	public static class StatementpartContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public DowhilestatementContext dowhilestatement() {
			return getRuleContext(DowhilestatementContext.class,0);
		}
		public ForstatementContext forstatement() {
			return getRuleContext(ForstatementContext.class,0);
		}
		public BreakstatementContext breakstatement() {
			return getRuleContext(BreakstatementContext.class,0);
		}
		public ContinuestatementContext continuestatement() {
			return getRuleContext(ContinuestatementContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public BlockstatementContext blockstatement() {
			return getRuleContext(BlockstatementContext.class,0);
		}
		public StatementpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementpart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitStatementpart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementpartContext statementpart() throws RecognitionException {
		StatementpartContext _localctx = new StatementpartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementpart);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFTYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				ifstatement();
				}
				break;
			case DOTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				dowhilestatement();
				}
				break;
			case FORTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				forstatement();
				}
				break;
			case BREAKTYPE:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				breakstatement();
				}
				break;
			case CONTINUETYPE:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				continuestatement();
				}
				break;
			case RETURNTYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				returnstatement();
				}
				break;
			case SUBOP:
			case NOTOP:
			case BOOLIT:
			case LB:
			case INTLIT:
			case ID:
			case FLOATLIT:
			case STRINGLIT:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				expressionstatement();
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				blockstatement();
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

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode IFTYPE() { return getToken(MCParser.IFTYPE, 0); }
		public TerminalNode LB() { return getToken(MCParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(MCParser.RB, 0); }
		public List<StatementpartContext> statementpart() {
			return getRuleContexts(StatementpartContext.class);
		}
		public StatementpartContext statementpart(int i) {
			return getRuleContext(StatementpartContext.class,i);
		}
		public TerminalNode ELSETYPE() { return getToken(MCParser.ELSETYPE, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitIfstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(IFTYPE);
			setState(175);
			match(LB);
			setState(176);
			expression();
			setState(177);
			match(RB);
			setState(178);
			statementpart();
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(179);
				match(ELSETYPE);
				setState(180);
				statementpart();
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

	public static class DowhilestatementContext extends ParserRuleContext {
		public TerminalNode DOTYPE() { return getToken(MCParser.DOTYPE, 0); }
		public TerminalNode WHILETYPE() { return getToken(MCParser.WHILETYPE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public List<StatementpartContext> statementpart() {
			return getRuleContexts(StatementpartContext.class);
		}
		public StatementpartContext statementpart(int i) {
			return getRuleContext(StatementpartContext.class,i);
		}
		public DowhilestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhilestatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitDowhilestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DowhilestatementContext dowhilestatement() throws RecognitionException {
		DowhilestatementContext _localctx = new DowhilestatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dowhilestatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(DOTYPE);
			setState(185); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(184);
				statementpart();
				}
				}
				setState(187); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBOP) | (1L << NOTOP) | (1L << BOOLIT) | (1L << BREAKTYPE) | (1L << CONTINUETYPE) | (1L << FORTYPE) | (1L << IFTYPE) | (1L << RETURNTYPE) | (1L << DOTYPE) | (1L << LB) | (1L << LP) | (1L << INTLIT) | (1L << ID) | (1L << FLOATLIT) | (1L << STRINGLIT))) != 0) );
			setState(189);
			match(WHILETYPE);
			setState(190);
			expression();
			setState(191);
			match(SEMI);
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

	public static class ForstatementContext extends ParserRuleContext {
		public TerminalNode FORTYPE() { return getToken(MCParser.FORTYPE, 0); }
		public TerminalNode LB() { return getToken(MCParser.LB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(MCParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(MCParser.SEMI, i);
		}
		public TerminalNode RB() { return getToken(MCParser.RB, 0); }
		public StatementpartContext statementpart() {
			return getRuleContext(StatementpartContext.class,0);
		}
		public ForstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitForstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForstatementContext forstatement() throws RecognitionException {
		ForstatementContext _localctx = new ForstatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(FORTYPE);
			setState(194);
			match(LB);
			setState(195);
			expression();
			setState(196);
			match(SEMI);
			setState(197);
			expression();
			setState(198);
			match(SEMI);
			setState(199);
			expression();
			setState(200);
			match(RB);
			setState(201);
			statementpart();
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

	public static class BreakstatementContext extends ParserRuleContext {
		public TerminalNode BREAKTYPE() { return getToken(MCParser.BREAKTYPE, 0); }
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public BreakstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitBreakstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakstatementContext breakstatement() throws RecognitionException {
		BreakstatementContext _localctx = new BreakstatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_breakstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(BREAKTYPE);
			setState(204);
			match(SEMI);
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

	public static class ContinuestatementContext extends ParserRuleContext {
		public TerminalNode CONTINUETYPE() { return getToken(MCParser.CONTINUETYPE, 0); }
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public ContinuestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuestatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitContinuestatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinuestatementContext continuestatement() throws RecognitionException {
		ContinuestatementContext _localctx = new ContinuestatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_continuestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CONTINUETYPE);
			setState(207);
			match(SEMI);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode RETURNTYPE() { return getToken(MCParser.RETURNTYPE, 0); }
		public TerminalNode SEMI() { return getToken(MCParser.SEMI, 0); }
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(RETURNTYPE);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBOP) | (1L << NOTOP) | (1L << BOOLIT) | (1L << LB) | (1L << INTLIT) | (1L << ID) | (1L << FLOATLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(210);
				list_expression();
				}
			}

			setState(213);
			match(SEMI);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode LB() { return getToken(MCParser.LB, 0); }
		public TerminalNode RB() { return getToken(MCParser.RB, 0); }
		public List_expressionContext list_expression() {
			return getRuleContext(List_expressionContext.class,0);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ID);
			setState(216);
			match(LB);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBOP) | (1L << NOTOP) | (1L << BOOLIT) | (1L << LB) | (1L << INTLIT) | (1L << ID) | (1L << FLOATLIT) | (1L << STRINGLIT))) != 0)) {
				{
				setState(217);
				list_expression();
				}
			}

			setState(220);
			match(RB);
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

	public static class List_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitList_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_expressionContext list_expression() throws RecognitionException {
		List_expressionContext _localctx = new List_expressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_list_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			expression();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(223);
				match(COMMA);
				setState(224);
				expression();
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				expression1(0);
				setState(231);
				match(ASSIGN);
				setState(232);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				expression1(0);
				}
				break;
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

	public static class Expression1Context extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		return expression1(0);
	}

	private Expression1Context expression1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression1Context _localctx = new Expression1Context(_ctx, _parentState);
		Expression1Context _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(238);
			expression2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression1);
					setState(240);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(241);
					match(OROP);
					setState(242);
					expression2(0);
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression2Context extends ParserRuleContext {
		public Expression3Context expression3() {
			return getRuleContext(Expression3Context.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression2Context expression2() throws RecognitionException {
		return expression2(0);
	}

	private Expression2Context expression2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression2Context _localctx = new Expression2Context(_ctx, _parentState);
		Expression2Context _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expression2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(249);
			expression3();
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression2);
					setState(251);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(252);
					match(ANDOP);
					setState(253);
					expression3();
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression3Context extends ParserRuleContext {
		public List<Expression4Context> expression4() {
			return getRuleContexts(Expression4Context.class);
		}
		public Expression4Context expression4(int i) {
			return getRuleContext(Expression4Context.class,i);
		}
		public Expression3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression3Context expression3() throws RecognitionException {
		Expression3Context _localctx = new Expression3Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression3);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				expression4();
				setState(260);
				_la = _input.LA(1);
				if ( !(_la==NEQ || _la==EQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				expression4();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				expression4();
				}
				break;
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

	public static class Expression4Context extends ParserRuleContext {
		public List<Expression5Context> expression5() {
			return getRuleContexts(Expression5Context.class);
		}
		public Expression5Context expression5(int i) {
			return getRuleContext(Expression5Context.class,i);
		}
		public Expression4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression4Context expression4() throws RecognitionException {
		Expression4Context _localctx = new Expression4Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression4);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				expression5(0);
				setState(267);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LTQ) | (1L << GTQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				expression5(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				expression5(0);
				}
				break;
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

	public static class Expression5Context extends ParserRuleContext {
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression5Context expression5() throws RecognitionException {
		return expression5(0);
	}

	private Expression5Context expression5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression5Context _localctx = new Expression5Context(_ctx, _parentState);
		Expression5Context _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_expression5, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(274);
			expression6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression5);
					setState(276);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(277);
					_la = _input.LA(1);
					if ( !(_la==ADDOP || _la==SUBOP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(278);
					expression6(0);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression6Context extends ParserRuleContext {
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public Expression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression6Context expression6() throws RecognitionException {
		return expression6(0);
	}

	private Expression6Context expression6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression6Context _localctx = new Expression6Context(_ctx, _parentState);
		Expression6Context _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression6, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(285);
			expression7();
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expression6Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression6);
					setState(287);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(288);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULOP) | (1L << DIVOP) | (1L << MODULOP))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(289);
					expression7();
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expression7Context extends ParserRuleContext {
		public Expression7Context expression7() {
			return getRuleContext(Expression7Context.class,0);
		}
		public Expression8Context expression8() {
			return getRuleContext(Expression8Context.class,0);
		}
		public Expression7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression7; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression7(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression7Context expression7() throws RecognitionException {
		Expression7Context _localctx = new Expression7Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_expression7);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBOP:
			case NOTOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==SUBOP || _la==NOTOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(296);
				expression7();
				}
				break;
			case BOOLIT:
			case LB:
			case INTLIT:
			case ID:
			case FLOATLIT:
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				expression8();
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

	public static class Expression8Context extends ParserRuleContext {
		public Expression9Context expression9() {
			return getRuleContext(Expression9Context.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression8; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression8(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression8Context expression8() throws RecognitionException {
		Expression8Context _localctx = new Expression8Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_expression8);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				expression9();
				setState(301);
				match(LSB);
				setState(302);
				expression();
				setState(303);
				match(RSB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				expression9();
				}
				break;
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

	public static class Expression9Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode FLOATLIT() { return getToken(MCParser.FLOATLIT, 0); }
		public TerminalNode INTLIT() { return getToken(MCParser.INTLIT, 0); }
		public TerminalNode ID() { return getToken(MCParser.ID, 0); }
		public TerminalNode BOOLIT() { return getToken(MCParser.BOOLIT, 0); }
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public TerminalNode STRINGLIT() { return getToken(MCParser.STRINGLIT, 0); }
		public Expression9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression9; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MCVisitor ) return ((MCVisitor<? extends T>)visitor).visitExpression9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression9Context expression9() throws RecognitionException {
		Expression9Context _localctx = new Expression9Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_expression9);
		try {
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LB:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(LB);
				setState(309);
				expression();
				setState(310);
				match(RB);
				}
				break;
			case BOOLIT:
			case INTLIT:
			case ID:
			case FLOATLIT:
			case STRINGLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(312);
					match(FLOATLIT);
					}
					break;
				case 2:
					{
					setState(313);
					match(INTLIT);
					}
					break;
				case 3:
					{
					setState(314);
					match(ID);
					}
					break;
				case 4:
					{
					setState(315);
					match(BOOLIT);
					}
					break;
				case 5:
					{
					setState(316);
					functioncall();
					}
					break;
				case 6:
					{
					setState(317);
					match(STRINGLIT);
					}
					break;
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expression1_sempred((Expression1Context)_localctx, predIndex);
		case 27:
			return expression2_sempred((Expression2Context)_localctx, predIndex);
		case 30:
			return expression5_sempred((Expression5Context)_localctx, predIndex);
		case 31:
			return expression6_sempred((Expression6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression1_sempred(Expression1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression2_sempred(Expression2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression5_sempred(Expression5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression6_sempred(Expression6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0145\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\6\2J\n\2\r\2\16\2K\3\2\3\2\3\3\3\3\5\3R\n"+
		"\3\3\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3"+
		"\7\3\7\6\7f\n\7\r\7\16\7g\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t"+
		"t\n\t\3\n\3\n\5\nx\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13\16\5\16\u008d\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u0093\n\17\3\20\3\20\7\20\u0097\n\20\f\20"+
		"\16\20\u009a\13\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00af"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b8\n\23\3\24\3\24\6\24"+
		"\u00bc\n\24\r\24\16\24\u00bd\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\5"+
		"\30\u00d6\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u00dd\n\31\3\31\3\31\3\32"+
		"\3\32\3\32\7\32\u00e4\n\32\f\32\16\32\u00e7\13\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u00ee\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00f6\n\34\f"+
		"\34\16\34\u00f9\13\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0101\n\35\f"+
		"\35\16\35\u0104\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u010b\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\5\37\u0112\n\37\3 \3 \3 \3 \3 \3 \7 \u011a\n \f \16"+
		" \u011d\13 \3!\3!\3!\3!\3!\3!\7!\u0125\n!\f!\16!\u0128\13!\3\"\3\"\3\""+
		"\5\"\u012d\n\"\3#\3#\3#\3#\3#\3#\5#\u0135\n#\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u0141\n$\5$\u0143\n$\3$\2\6\668>@%\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\b\6\2\24\24\31\31\33\33\""+
		"\"\3\2\f\r\3\2\16\21\3\2\4\5\4\2\6\7\t\t\4\2\5\5\b\b\u0149\2I\3\2\2\2"+
		"\4Q\3\2\2\2\6S\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fb\3\2\2\2\16i\3\2\2\2\20"+
		"s\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26~\3\2\2\2\30\u0082\3\2\2\2\32\u008c"+
		"\3\2\2\2\34\u008e\3\2\2\2\36\u0094\3\2\2\2 \u00a3\3\2\2\2\"\u00ae\3\2"+
		"\2\2$\u00b0\3\2\2\2&\u00b9\3\2\2\2(\u00c3\3\2\2\2*\u00cd\3\2\2\2,\u00d0"+
		"\3\2\2\2.\u00d3\3\2\2\2\60\u00d9\3\2\2\2\62\u00e0\3\2\2\2\64\u00ed\3\2"+
		"\2\2\66\u00ef\3\2\2\28\u00fa\3\2\2\2:\u010a\3\2\2\2<\u0111\3\2\2\2>\u0113"+
		"\3\2\2\2@\u011e\3\2\2\2B\u012c\3\2\2\2D\u0134\3\2\2\2F\u0142\3\2\2\2H"+
		"J\5\4\3\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\2\2\3"+
		"N\3\3\2\2\2OR\5\6\4\2PR\5\16\b\2QO\3\2\2\2QP\3\2\2\2R\5\3\2\2\2SV\5\b"+
		"\5\2TW\5\n\6\2UW\5\f\7\2VT\3\2\2\2VU\3\2\2\2WX\3\2\2\2XY\7)\2\2Y\7\3\2"+
		"\2\2Z[\t\2\2\2[\t\3\2\2\2\\`\7,\2\2]^\7\'\2\2^_\7+\2\2_a\7(\2\2`]\3\2"+
		"\2\2`a\3\2\2\2a\13\3\2\2\2be\5\n\6\2cd\7*\2\2df\5\n\6\2ec\3\2\2\2fg\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3\2\2\2ij\5\20\t\2jk\5\30\r\2kl\7#\2\2l"+
		"m\5\32\16\2mn\7$\2\2no\5\36\20\2o\17\3\2\2\2pt\5\b\5\2qt\7\35\2\2rt\5"+
		"\26\f\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\21\3\2\2\2ux\5\24\13\2vx\5\26\f"+
		"\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2yz\5\b\5\2z{\7,\2\2{|\7\'\2\2|}\7(\2"+
		"\2}\25\3\2\2\2~\177\5\b\5\2\177\u0080\7\'\2\2\u0080\u0081\7(\2\2\u0081"+
		"\27\3\2\2\2\u0082\u0083\7,\2\2\u0083\31\3\2\2\2\u0084\u0089\5\34\17\2"+
		"\u0085\u0086\7*\2\2\u0086\u0088\5\34\17\2\u0087\u0085\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33\3\2\2"+
		"\2\u008e\u008f\5\b\5\2\u008f\u0092\7,\2\2\u0090\u0091\7\'\2\2\u0091\u0093"+
		"\7(\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\35\3\2\2\2\u0094"+
		"\u0098\7%\2\2\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\5\"\22\2\u009c\u009b\3\2\2\2\u009d\u00a0\3"+
		"\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\7&\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\5\64\33"+
		"\2\u00a4\u00a5\7)\2\2\u00a5!\3\2\2\2\u00a6\u00af\5$\23\2\u00a7\u00af\5"+
		"&\24\2\u00a8\u00af\5(\25\2\u00a9\u00af\5*\26\2\u00aa\u00af\5,\27\2\u00ab"+
		"\u00af\5.\30\2\u00ac\u00af\5 \21\2\u00ad\u00af\5\36\20\2\u00ae\u00a6\3"+
		"\2\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af#\3\2\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2\7#\2\2\u00b2\u00b3"+
		"\5\64\33\2\u00b3\u00b4\7$\2\2\u00b4\u00b7\5\"\22\2\u00b5\u00b6\7\27\2"+
		"\2\u00b6\u00b8\5\"\22\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"%\3\2\2\2\u00b9\u00bb\7\36\2\2\u00ba\u00bc\5\"\22\2\u00bb\u00ba\3\2\2"+
		"\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\u00c0\7\37\2\2\u00c0\u00c1\5\64\33\2\u00c1\u00c2\7)\2\2"+
		"\u00c2\'\3\2\2\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\7#\2\2\u00c5\u00c6\5"+
		"\64\33\2\u00c6\u00c7\7)\2\2\u00c7\u00c8\5\64\33\2\u00c8\u00c9\7)\2\2\u00c9"+
		"\u00ca\5\64\33\2\u00ca\u00cb\7$\2\2\u00cb\u00cc\5\"\22\2\u00cc)\3\2\2"+
		"\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\7)\2\2\u00cf+\3\2\2\2\u00d0\u00d1"+
		"\7\26\2\2\u00d1\u00d2\7)\2\2\u00d2-\3\2\2\2\u00d3\u00d5\7\34\2\2\u00d4"+
		"\u00d6\5\62\32\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3"+
		"\2\2\2\u00d7\u00d8\7)\2\2\u00d8/\3\2\2\2\u00d9\u00da\7,\2\2\u00da\u00dc"+
		"\7#\2\2\u00db\u00dd\5\62\32\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00df\7$\2\2\u00df\61\3\2\2\2\u00e0\u00e5\5"+
		"\64\33\2\u00e1\u00e2\7*\2\2\u00e2\u00e4\5\64\33\2\u00e3\u00e1\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\63"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea\7\22\2"+
		"\2\u00ea\u00eb\5\64\33\2\u00eb\u00ee\3\2\2\2\u00ec\u00ee\5\66\34\2\u00ed"+
		"\u00e8\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\65\3\2\2\2\u00ef\u00f0\b\34\1"+
		"\2\u00f0\u00f1\58\35\2\u00f1\u00f7\3\2\2\2\u00f2\u00f3\f\4\2\2\u00f3\u00f4"+
		"\7\n\2\2\u00f4\u00f6\58\35\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\67\3\2\2\2\u00f9\u00f7\3\2\2"+
		"\2\u00fa\u00fb\b\35\1\2\u00fb\u00fc\5:\36\2\u00fc\u0102\3\2\2\2\u00fd"+
		"\u00fe\f\4\2\2\u00fe\u00ff\7\13\2\2\u00ff\u0101\5:\36\2\u0100\u00fd\3"+
		"\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"9\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\5<\37\2\u0106\u0107\t\3\2\2"+
		"\u0107\u0108\5<\37\2\u0108\u010b\3\2\2\2\u0109\u010b\5<\37\2\u010a\u0105"+
		"\3\2\2\2\u010a\u0109\3\2\2\2\u010b;\3\2\2\2\u010c\u010d\5> \2\u010d\u010e"+
		"\t\4\2\2\u010e\u010f\5> \2\u010f\u0112\3\2\2\2\u0110\u0112\5> \2\u0111"+
		"\u010c\3\2\2\2\u0111\u0110\3\2\2\2\u0112=\3\2\2\2\u0113\u0114\b \1\2\u0114"+
		"\u0115\5@!\2\u0115\u011b\3\2\2\2\u0116\u0117\f\4\2\2\u0117\u0118\t\5\2"+
		"\2\u0118\u011a\5@!\2\u0119\u0116\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c?\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\b!\1\2\u011f\u0120\5B\"\2\u0120\u0126\3\2\2\2\u0121\u0122\f\4\2"+
		"\2\u0122\u0123\t\6\2\2\u0123\u0125\5B\"\2\u0124\u0121\3\2\2\2\u0125\u0128"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127A\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0129\u012a\t\7\2\2\u012a\u012d\5B\"\2\u012b\u012d\5D#"+
		"\2\u012c\u0129\3\2\2\2\u012c\u012b\3\2\2\2\u012dC\3\2\2\2\u012e\u012f"+
		"\5F$\2\u012f\u0130\7\'\2\2\u0130\u0131\5\64\33\2\u0131\u0132\7(\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0135\5F$\2\u0134\u012e\3\2\2\2\u0134\u0133\3\2\2"+
		"\2\u0135E\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\5\64\33\2\u0138\u0139"+
		"\7$\2\2\u0139\u0143\3\2\2\2\u013a\u0141\7.\2\2\u013b\u0141\7+\2\2\u013c"+
		"\u0141\7,\2\2\u013d\u0141\7\23\2\2\u013e\u0141\5\60\31\2\u013f\u0141\7"+
		"\62\2\2\u0140\u013a\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013c\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0136\3\2\2\2\u0142\u0140\3\2\2\2\u0143G\3\2\2\2\37KQV`gsw"+
		"\u0089\u008c\u0092\u0098\u009e\u00ae\u00b7\u00bd\u00d5\u00dc\u00e5\u00ed"+
		"\u00f7\u0102\u010a\u0111\u011b\u0126\u012c\u0134\u0140\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}