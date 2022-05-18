public class Factor {
    private String simpvalue;
    private Exp exp;
    private String id;
    private Subparamlist subparamlist;

    public Factor() {
        simpvalue="";
        exp=null;
        id="";
        subparamlist=null;
    }

    public void setSimpvalue(String aux) {
        this.simpvalue = aux;
    }

    public void setExp(Exp aux) {
        this.exp = aux;
    }

    public void setId(String aux) {
        this.id = aux;
    }

    public void setSubparamlist(Subparamlist aux) {
        this.subparamlist = aux;
    }

    public String toString() {
        String s="";

        if(!simpvalue.equals("")) {
            s += simpvalue;
        }
        if(exp != null) {
            s += "(" + exp + ")";
        }
        if(!id.equals("")) {
            if(subparamlist!=null) {
                s += id +" "+subparamlist;
            }
            else{
                s += id;
            }
        }

        return s;
    }
}
