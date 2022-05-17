public class Sent {
    private Asig asig;
    private Proc_call proc_call;
    private If_while_repeat cond;
    private If_while_repeat bucle_while;
    private If_while_repeat bucle_repeat;
    private For bucle_for;

    public Sent() {
        this.asig = null;
        this.proc_call = null;
        this.cond = null;
        this.bucle_while = null;
        this.bucle_repeat = null;
        this.bucle_for = null;
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

    public String toString() {
        String s = "";
        if(asig!=null) {
            s+=asig + ";";
        }
        if(proc_call!=null) {
            s += proc_call + ";";
        }
        if(cond!=null) {
            s += "IF " + cond.getExpcond() + " THEN\n";
            s += cond.getBlq1() + "\n";
            s += "ELSE\n";
            s += cond.getBlq2();
            return s;
        }
        if(bucle_while!=null) {
            s += "WHILE " + bucle_while.getExpcond() + " DO\n";
            s += bucle_while.getBlq1();
        }
        if(bucle_repeat!=null) {
            s += "REPEAT\n" + bucle_repeat.getBlq1() + "\n";
            s += "UNTIL " + bucle_repeat.getExpcond() + ";";
        }
        if(bucle_for!=null){
            s += bucle_for;
        }
        return s;
    }
}
