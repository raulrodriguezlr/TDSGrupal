public class Sent {
    private Asig asig;
    private Proc_call proc_call;
    private If cond;

    public Sent() {
        this.asig = null;
        this.proc_call = null;
        this.cond = null;
    }

    public void setAsig(Asig aux) {
        this.asig = aux;
    }

    public void setProc_call(Proc_call aux) {
        this.proc_call = aux;
    }

    public void setCond(If aux) {
        this.cond = aux;
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
            s += cond + ";";
        }
        return s;
    }
}
