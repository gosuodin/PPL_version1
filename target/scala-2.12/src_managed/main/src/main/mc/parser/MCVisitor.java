// Generated from src/main/mc/parser/MC.g4 by ANTLR 4.6

	package mc.parser;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(MCParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#variabledeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledeclarations(MCParser.VariabledeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#primitivetype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitivetype(MCParser.PrimitivetypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#manyvariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManyvariable(MCParser.ManyvariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#functiondeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclarations(MCParser.FunctiondeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#arraypointtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraypointtype(MCParser.ArraypointtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#inputpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputpara(MCParser.InputparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#outputpara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputpara(MCParser.OutputparaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#funtionname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntionname(MCParser.FuntionnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#parameterlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterlist(MCParser.ParameterlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterdeclaration(MCParser.ParameterdeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#blockstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockstatement(MCParser.BlockstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expressionstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionstatement(MCParser.ExpressionstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#statementpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementpart(MCParser.StatementpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#ifstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatement(MCParser.IfstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#dowhilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhilestatement(MCParser.DowhilestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForstatement(MCParser.ForstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#breakstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakstatement(MCParser.BreakstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#continuestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuestatement(MCParser.ContinuestatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#returnstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnstatement(MCParser.ReturnstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#functioncall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctioncall(MCParser.FunctioncallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#list_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expression(MCParser.List_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression1(MCParser.Expression1Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression2(MCParser.Expression2Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression3(MCParser.Expression3Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression4(MCParser.Expression4Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression5(MCParser.Expression5Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression6(MCParser.Expression6Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression7(MCParser.Expression7Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression8(MCParser.Expression8Context ctx);
	/**
	 * Visit a parse tree produced by {@link MCParser#expression9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression9(MCParser.Expression9Context ctx);
}