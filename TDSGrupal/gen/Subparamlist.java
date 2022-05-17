public class Subparamlist {
    private Explist explist;

    public Subparamlist() {
        explist = null;
    }

    public void setExplist(Explist aux) {
        this.explist = aux;
    }

    public String toString() {
        String s = "";
        if(explist != null) {
            s += "(";
            s += explist;
            s += ")";
        }
        return s;
    }
}
