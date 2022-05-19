public class Sent {
    private Asig asig;
    private Proc_call proc_call;
    private If_while_repeat cond;
    private If_while_repeat bucle_while;
    private If_while_repeat bucle_repeat;
    private For bucle_for;
    private int identacion;


    public Sent() {
        this.asig = null;
        this.proc_call = null;
        this.cond = null;
        this.bucle_while = null;
        this.bucle_repeat = null;
        this.bucle_for = null;
        identacion=0;
    }
    public boolean isFor(){
        if(bucle_for!=null)
            return true;
        else
            return false;
    }
    public boolean isWhile(){
        if(bucle_while!=null)
            return true;
        else
            return false;
    }
    public boolean isRepeat(){
        if(bucle_repeat!=null)
            return true;
        else
            return false;
    }
    public boolean isIf(){
        if(cond!=null)
            return true;
        else
            return false;
    }

    public For getBucle_for(){
        return bucle_for;
    }

    public void setAsig(Asig aux) {
        this.asig = aux;
    }

    public void setProc_call(Proc_call aux) {
        this.proc_call = aux;
    }

    public void setCond(If_while_repeat aux) {
        this.cond = aux;
    }

    public void setBucle_while(If_while_repeat aux) {
        this.bucle_while = aux;
    }

    public void setBucle_repeat(If_while_repeat aux) {
        this.bucle_repeat = aux;
    }

    public void setBucle_for(For aux) {
        this.bucle_for = aux;
    }

    public boolean isAsig(){
        if(asig!=null)
            return true;
        else
            return false;
    }
    public boolean isProc_call(){
        if(proc_call!=null)
            return true;
        else
            return false;
    }
    public Proc_call getProcall(){
        return proc_call;
    }
    public Asig getAsig() {
        return asig;
    }

    public If_while_repeat getBucle_repeat() {
        return bucle_repeat;
    }

    public If_while_repeat getBucle_while() {
        return bucle_while;
    }

    public If_while_repeat getCond() {
        return cond;
    }

    public Proc_call getProc_call(){
        return proc_call;
    }

    public String toString() {
        String s = "";
        if(asig!=null) {
            s+=asig ;
        }
        if(proc_call!=null) {
            s += proc_call ;
        }
        if(cond!=null) {

            s += "<div style=\"text-indent:"+ 1.5*identacion+"cm\"><SPAN CLASS=\"palres\"> IF </SPAN>" + cond.getExpcond() + "<SPAN CLASS=\"palres\"> THEN </SPAN></DIV>\n";
            s += "<div style=\"text-indent:"+ 3*(identacion)+"cm\">" + cond.getBlq1() + "</div>" + "\n";
            s += "<div style=\"text-indent:"+ 1.5*identacion+"cm\"><SPAN CLASS=\"palres\"> ELSE </SPAN>\n" ;
            s += cond.getBlq2();
            return s;
        }
        if(bucle_while!=null) {
            s += "<div style=\"text-indent:"+ 1.5*identacion+"cm\"><SPAN CLASS=\"palres\"> WHILE </SPAN></div>\n"  + bucle_while.getExpcond() + "<div style=\"text-indent: 1.5cm\"><SPAN CLASS=\"palres\"> DO </SPAN></div>\n" ;
            s += "<div style=\"text-indent:"+ 3*identacion+"cm\">" + bucle_while.getBlq1() + "</div>" + "\n";
        }
        if(bucle_repeat!=null) {
            s += "<div style=\"text-indent:"+ 1.5*identacion+"cm\"><SPAN CLASS=\"palres\"> REPEAT </SPAN></div>\n" ;
            s += "<div style=\"text-indent:"+ 1.5*identacion+"cm\">" + bucle_repeat.getBlq1() + "</div>" + "\n";
            s += "<div style=\"text-indent: "+ 1.5*identacion+"cm\"><SPAN CLASS=\"palres\"> UNTIL </SPAN>"  + bucle_repeat.getExpcond() + "</div>";
        }
        if(bucle_for!=null){
            s += bucle_for;
        }
        return s;
    }
}
