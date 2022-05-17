// Generated from /Users/raulrodriguezlopez-rey/Desktop/Procesadores del Lenguaje/TDSGrupal/src/TDSGrupal.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TDSGrupalParser}.
 */
public interface TDSGrupalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#axioma}.
	 * @param ctx the parse tree
	 */
	void enterAxioma(TDSGrupalParser.AxiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#axioma}.
	 * @param ctx the parse tree
	 */
	void exitAxioma(TDSGrupalParser.AxiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(TDSGrupalParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(TDSGrupalParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#blq}.
	 * @param ctx the parse tree
	 */
	void enterBlq(TDSGrupalParser.BlqContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#blq}.
	 * @param ctx the parse tree
	 */
	void exitBlq(TDSGrupalParser.BlqContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(TDSGrupalParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(TDSGrupalParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(TDSGrupalParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(TDSGrupalParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#sentlistAux}.
	 * @param ctx the parse tree
	 */
	void enterSentlistAux(TDSGrupalParser.SentlistAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#sentlistAux}.
	 * @param ctx the parse tree
	 */
	void exitSentlistAux(TDSGrupalParser.SentlistAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(TDSGrupalParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(TDSGrupalParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#defcte}.
	 * @param ctx the parse tree
	 */
	void enterDefcte(TDSGrupalParser.DefcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#defcte}.
	 * @param ctx the parse tree
	 */
	void exitDefcte(TDSGrupalParser.DefcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(TDSGrupalParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(TDSGrupalParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#ctelistAux}.
	 * @param ctx the parse tree
	 */
	void enterCtelistAux(TDSGrupalParser.CtelistAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#ctelistAux}.
	 * @param ctx the parse tree
	 */
	void exitCtelistAux(TDSGrupalParser.CtelistAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(TDSGrupalParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(TDSGrupalParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#defvar}.
	 * @param ctx the parse tree
	 */
	void enterDefvar(TDSGrupalParser.DefvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#defvar}.
	 * @param ctx the parse tree
	 */
	void exitDefvar(TDSGrupalParser.DefvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlist(TDSGrupalParser.DefvarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#defvarlist}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlist(TDSGrupalParser.DefvarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#defvarlistAux}.
	 * @param ctx the parse tree
	 */
	void enterDefvarlistAux(TDSGrupalParser.DefvarlistAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#defvarlistAux}.
	 * @param ctx the parse tree
	 */
	void exitDefvarlistAux(TDSGrupalParser.DefvarlistAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(TDSGrupalParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(TDSGrupalParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#defproc}.
	 * @param ctx the parse tree
	 */
	void enterDefproc(TDSGrupalParser.DefprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#defproc}.
	 * @param ctx the parse tree
	 */
	void exitDefproc(TDSGrupalParser.DefprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#deffun}.
	 * @param ctx the parse tree
	 */
	void enterDeffun(TDSGrupalParser.DeffunContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#deffun}.
	 * @param ctx the parse tree
	 */
	void exitDeffun(TDSGrupalParser.DeffunContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(TDSGrupalParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(TDSGrupalParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void enterFormal_param(TDSGrupalParser.Formal_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#formal_param}.
	 * @param ctx the parse tree
	 */
	void exitFormal_param(TDSGrupalParser.Formal_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(TDSGrupalParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(TDSGrupalParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(TDSGrupalParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(TDSGrupalParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(TDSGrupalParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(TDSGrupalParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(TDSGrupalParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(TDSGrupalParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#expcondAux}.
	 * @param ctx the parse tree
	 */
	void enterExpcondAux(TDSGrupalParser.ExpcondAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#expcondAux}.
	 * @param ctx the parse tree
	 */
	void exitExpcondAux(TDSGrupalParser.ExpcondAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(TDSGrupalParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(TDSGrupalParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(TDSGrupalParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(TDSGrupalParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(TDSGrupalParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(TDSGrupalParser.OpcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(TDSGrupalParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(TDSGrupalParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TDSGrupalParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TDSGrupalParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(TDSGrupalParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(TDSGrupalParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TDSGrupalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TDSGrupalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(TDSGrupalParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(TDSGrupalParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(TDSGrupalParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(TDSGrupalParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDSGrupalParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(TDSGrupalParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDSGrupalParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(TDSGrupalParser.Proc_callContext ctx);
}