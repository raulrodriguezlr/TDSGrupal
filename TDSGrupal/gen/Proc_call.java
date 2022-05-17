public class Proc_call {
    private String id;
    private Subparamlist subparamlist;

    public Proc_call() {
        this.id = "";
        this.subparamlist = null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubparamlist(Subparamlist aux) {
        this.subparamlist = aux;
    }

    public String toString() {
        String s="";
        s += id + subparamlist;
        return s;
    }
}
