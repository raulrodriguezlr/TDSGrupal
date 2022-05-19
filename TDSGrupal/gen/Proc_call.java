public class Proc_call {
    private String id;
    private Subparamlist subparamlist;
    private int identacion;

    public Proc_call() {
        this.id = "";
        this.subparamlist = null;
        identacion=1;
    }

    public void setIdentacion(int identacion) {
        this.identacion = identacion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSubparamlist(Subparamlist aux) {
        this.subparamlist = aux;
    }

    public String toString() {
        String s="";
        s += "<div style=\"text-indent:"+ identacion*1.5+"cm\">"+id + subparamlist+";</div>";
        return s;
    }
}
