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
            s += "<SPAN CLASS=\"cte\">"+simpvalue+"</SPAN>";
        }
        if(exp != null) {
            s += "(" + "<SPAN CLASS=\"cte\">"+exp+"</SPAN>" + ")";
        }
        if(!id.equals("")) {
            if(subparamlist!=null) {
                s += "<SPAN CLASS=\"ident\">" + id + "</SPAN>" +" "+subparamlist;
            }
            else{
                s += "<SPAN CLASS=\"ident\">" + id + "</SPAN>";
            }
        }

        return s;
    }
}
