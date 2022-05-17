// Generated from /Users/raulrodriguezlopez-rey/Desktop/Procesadores del Lenguaje/TDSGrupal/src/TDSGrupal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TDSGrupalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TDSGrupalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#axioma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxioma(TDSGrupalParser.AxiomaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(TDSGrupalParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#blq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlq(TDSGrupalParser.BlqContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(TDSGrupalParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(TDSGrupalParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#sentlistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlistAux(TDSGrupalParser.SentlistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(TDSGrupalParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#defcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcte(TDSGrupalParser.DefcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(TDSGrupalParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#ctelistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelistAux(TDSGrupalParser.CtelistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(TDSGrupalParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#defvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvar(TDSGrupalParser.DefvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#defvarlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlist(TDSGrupalParser.DefvarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#defvarlistAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefvarlistAux(TDSGrupalParser.DefvarlistAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(TDSGrupalParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#defproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefproc(TDSGrupalParser.DefprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#deffun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeffun(TDSGrupalParser.DeffunContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(TDSGrupalParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_param(TDSGrupalParser.Formal_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#tbas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTbas(TDSGrupalParser.TbasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(TDSGrupalParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(TDSGrupalParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(TDSGrupalParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#expcondAux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcondAux(TDSGrupalParser.ExpcondAuxContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(TDSGrupalParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(TDSGrupalParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(TDSGrupalParser.OpcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#asig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsig(TDSGrupalParser.AsigContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TDSGrupalParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(TDSGrupalParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TDSGrupalParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(TDSGrupalParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(TDSGrupalParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDSGrupalParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(TDSGrupalParser.Proc_callContext ctx);
}