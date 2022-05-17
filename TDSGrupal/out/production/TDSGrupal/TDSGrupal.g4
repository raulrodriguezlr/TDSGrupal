grammar TDSGrupal;
@parser::members{
    private sintesis myinfo;//se declara el objeto

    //recibir como un parametro del constructor el objeto real
    public TDSGrupalParser (TokenStream input, sintesis theinfo){
        this(input);
        myinfo = theinfo;
    }
}

//**********************************************************
// SINTÁCTICO
//**********************************************************

axioma : prg <EOF> {System.out.println($prg.s); } ;

prg returns [Prg s] :
    'PROGRAM' IDENTIFIER {$s = new Prg("Programa: ", $IDENTIFIER.text)  ;} ';' blq {$s.add($blq.s);} '.' ;


blq returns [Blq s] :
    {$s=new Blq("","");}
    dcllist[new Dcllist()] {$s.setDcllist($dcllist.s);}
    'BEGIN' sentlist[new Sentlist()] {$s.setSentlist($sentlist.s);}
    'END' ;

dcllist [Dcllist h] returns [Dcllist s]:  dcl{
                                $h.add($dcl.s);
                                }
                                dcllist[$h]{$s=$h;}
                                | {$s=$h; };

sentlist [Sentlist h] returns [Sentlist s] :
    sent {$h.add($sent.s);} sentlistAux[$h]{$s=$h;} ;

sentlistAux [Sentlist h] returns [Sentlist s]:
    {$s=$h;}
    | sent {$h.add($sent.s);} sentlistAux[$h]{$s=$h;} ;

//---------------------------------------

dcl returns [Dcl s]:
    defcte {$s = new Dcl();$s.setDefcte($defcte.s);}
    |  defvar{$s = new Dcl();$s.setDefvar($defvar.s);}
    |   defproc{$s = new Dcl();$s.setDefSubrutina($defproc.s);}
    |   deffun{$s = new Dcl();$s.setDefSubrutina($deffun.s);}
    ;

defcte returns[Defcte s]: 'CONST'{$s = new Defcte();} ctelist {$s.setCtelist($ctelist.s);} ;

ctelist returns[Ctelist s]: {$s=new Ctelist();} IDENTIFIER '=' simpvalue ';'
    {$s.add($IDENTIFIER.text+" = "+$simpvalue.s+";\n");} ctelistAux[$s]
 ;

ctelistAux [Ctelist h] returns[Ctelist s]:
      {$s=$h; }
    | IDENTIFIER '=' simpvalue ';'
    {$h.add($IDENTIFIER.text+" = "+$simpvalue.s+";\n");}
    ctelistAux[$h]{$s=$h;} ;

simpvalue returns [String s]: NUMERIC_INTEGER_CONST {$s=$NUMERIC_INTEGER_CONST.text;}
    | NUMERIC_REAL_CONST {$s=(String)$NUMERIC_REAL_CONST.text;}
    | STRING_CONST {$s=$STRING_CONST.text;}
    ;

defvar returns [Defvar s] : 'VAR' defvarlist[new Defvarlist()] ';'{$s = new Defvar("VAR");
                    $s.setDefvarlist($defvarlist.s);} ;

defvarlist [Defvarlist h] returns [Defvarlist s]:
            varlist[new Varlist()]{$h.add($varlist.s);} ':'
            tbas{$h.addTbas($tbas.s);} defvarlistAux[$h]{$s=$h;} ;

defvarlistAux[Defvarlist h] returns[Defvarlist s]:
     {$s=$h; }
    | ';' varlist[new Varlist()]{$h.add($varlist.s);} ':' tbas {$h.addTbas($tbas.s);} defvarlistAux[h] ;

varlist [Varlist h] returns [Varlist s]: IDENTIFIER {$h.add($IDENTIFIER.text);$s=$h;}
    | IDENTIFIER {$h.add($IDENTIFIER.text+",");} ',' varlist[$h] {$s=$h;};

defproc returns [DefSubrutina s]: 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';'
         {$s= new DefSubrutina("PROCEDURE",$IDENTIFIER.text,$formal_paramlist.s,$blq.s);};

deffun returns [DefSubrutina s]: 'FUNCTION' IDENTIFIER  formal_paramlist ':' tbas ';' blq ';'
        {$s= new DefSubrutina("FUNCTION",$IDENTIFIER.text,$formal_paramlist.s,$tbas.s,$blq.s);} ;

formal_paramlist returns [FormalParamList s]:
    | '('  formal_param ')' {$s= new FormalParamList(); $s.add($formal_param.s);};

formal_param returns [FormalParam s]: varlist[new Varlist()] ':' tbas {$s = new FormalParam($varlist.s,$tbas.s);}
    | varlist[new Varlist()] ':' tbas ';' formal_param ;

tbas returns [String s]: 'integer'{$s="integer";}
    |'real'{$s="real";}
    ;

sent returns [Sent s] :
    asig ';' {$s = new Sent(); $s.setAsig($asig.s);}
    | proc_call ';' {$s = new Sent(); $s.setProc_call($proc_call.s);}
    | 'IF' expcond[new Expcond()] 'THEN' blq {Blq blq1 = new Blq("",""); blq1 = $blq.s;} 'ELSE' blq {Blq blq2 = new Blq("",""); blq2 = $blq.s;}
                                            {$s = new Sent();
                                            If cond = new If(); cond.setExpcond($expcond.s);
                                            cond.setBlq1(blq1); cond.setBlq2(blq2); $s.setCond(cond);}
    | 'WHILE' expcond[new Expcond()] 'DO' blq
    | 'REPEAT' blq 'UNTIL' expcond[new Expcond()] ';'
    | 'FOR' IDENTIFIER ':=' exp[new Exp()] inc exp[new Exp()] 'DO' blq ;

inc: 'TO'
    | 'DOWNTO' ;

expcond [Expcond h] returns [Expcond s] :
    {$s = new Expcond();} factorcond[new Factorcond()] {$s.addFactorcond($factorcond.s);} expcondAux[$s]
    ;

expcondAux [Expcond h] returns [Expcond s] :
    oplog {$h.addOplog($oplog.s);} expcond[$h] expcondAux[$expcond.s] {$s=$expcondAux.s;}
    | {$s=$h;}
    ;

oplog returns [String s]:
    'OR' {$s = "OR";}
    | 'AND' {$s = "AND";}
    ;

factorcond [Factorcond h] returns [Factorcond s] :
    exp[new Exp()]{$h.setExp1($exp.s);} opcomp {$h.setOpcomp($opcomp.s);} exp[new Exp()] {$h.setExp1($exp.s); $s=$h;}
    | '(' expcond[new Expcond()] {$h.setExpcond($expcond.s);} ')' {$s=$h;}
    | 'NOT' {$h.addString("NOT");} factorcond[$h] {$s = $factorcond.s;}
    | 'TRUE' {$h.addString("TRUE"); $s=$h;}
    | 'FALSE' {$h.addString("FALSE"); $s=$h;}
    ;

opcomp returns [String s]:
    '<' {$s = "<";}
    | '>' {$s = ">";}
    | '<=' {$s = "<=";}
    | '>=' {$s = ">=";}
    | '=' {$s = "=";}
    ;

asig returns [Asig s] :
    IDENTIFIER ':=' exp[new Exp()] {$s = new Asig(); $s.setId($IDENTIFIER.text); $s.setExp($exp.s);}
    ;

exp [Exp h] returns [Exp s] :
    factor {$h.addFactor($factor.s);} op {$h.addOp($op.s);} exp[$h] {$s=$h;}
    | factor {$h.addFactor($factor.s); $s=$h;}
    ;

op returns [String s] :
    '+' {$s = "+";}
    | '-' {$s = "-";}
    | '*' {$s = "*";}
    | 'DIV' {$s = "DIV";}
    | 'MOD' {$s = "MOD";}
    ;

factor returns [Factor s] :
    simpvalue {$s = new Factor(); $s.setSimpvalue($simpvalue.s);}
    | '(' exp[new Exp()] ')' {$s = new Factor(); $s.setExp($exp.s); }
    | IDENTIFIER subpparamlist {$s = new Factor(); $s.setId($IDENTIFIER.text); $s.setSubparamlist($subpparamlist.s);}
    ;

subpparamlist returns [Subparamlist s]:
    {$s = new Subparamlist();}
    | '(' explist[new Explist()] ')' {$s = new Subparamlist(); $s.setExplist($explist.s);}
    ;

explist [Explist h] returns [Explist s] :
    exp[new Exp()] {$h.add($exp.s); $s=$h;}
    | exp[new Exp()] ',' explist[new Explist()] {$explist.s.insertarPrincipio($exp.s); $s = $explist.s;}
    ;

proc_call returns [Proc_call s]:
    IDENTIFIER subpparamlist {$s=new Proc_call(); $s.setId($IDENTIFIER.text); $s.setSubparamlist($subpparamlist.s);}
    ;


//**********************************************************
// LÉXICO
//**********************************************************


IDENTIFIER: ([a-zA-Z] | '_')+ [0-9]* ([a-zA-Z] | '_')* ;
NUMERIC_INTEGER_CONST: ('+' | '-')? [0-9]+ ;
NUMERIC_REAL_CONST: (FIJO | EXPONENCIAL | MIXTO) ;
FIJO: ('+' | '-')? [0-9]+ '.' [0-9]+ ;

EXPONENCIAL: ('+' | '-')? [0-9]+ ('e' | 'E') ('+' | '-')? [0-9]+ ;
MIXTO: ('+' | '-')? [0-9]+ '.' [0-9]+ ('e' | 'E') ('+' | '-')? [0-9]+ ;

STRING_CONST: (SIMPLE | DOBLE) ;
SIMPLE:'\'' ~('\'' | '\n')* ('\'\'')? ~('\'' | '\n')* '\'' ;
DOBLE:'"' ~('"' | '\n')* ('""')? ~('"' | '\n')* '"' ;
COMENTARIO: (CORCHETE | PARENTESIS_ASTERISCO) ;
CORCHETE : '{' ~('}' | '\n')* '}' ;
PARENTESIS_ASTERISCO:'(*' ~('*')* ('*' ~(')'))*? ~('*')* '*)' ;
WHITESPACE : [ \n\t\r]+ -> skip;


/*
//IDENTIFIER : (LETRAS|'_')(NUMEROS|LETRAS|'_')*;
IDENTIFIER:(LETRAS|'_')+NUMEROS*(LETRAS|'_')*;

NUMERIC_INTEGER_CONST: ('+'|'-')? NUMEROS+ ;

NUMERIC_REAL_CONST: (PUNTOFIJO|EXPONENCIAL|MIXTO);

//CONSTANTES LITERALES
STRING_CONST : (('\'' ~('\'')+('\'''\'')*~('\'')+'\'') | ('"'(~('"')+('"''"')*~('"')+)'"'));

//COMENTARIOS
COMENTARIOS_1L : '{'~('\n')*'}';
COMENTARIOS_2L : '(''*'~(')')*'*'')';

fragment
LETRAS: [a-zA-Z];
fragment
NUMEROS:[0-9];
//DISTINTOS REALES
fragment
PUNTOFIJO: ('+'|'-')?NUMEROS+'.'('+'|'-')?NUMEROS+;
fragment
EXPONENCIAL: ('+'|'-')?NUMEROS+('e'|'E')('+'|'-')?NUMEROS+;
fragment
MIXTO: ('+'|'-')?NUMEROS+'.'NUMEROS+('e'|'E')('+'|'-')?NUMEROS+;



WHITESPACE : [ \n\t\r]+ -> skip ;

