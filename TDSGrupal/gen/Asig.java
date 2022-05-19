public class Asig {
    private String id;
    private Exp exp;
    private int identacion;

    public Asig() {
        this.id = "";
        this.exp = new Exp();
        identacion=1;
    }

    public void setId(String aux) {
        this.id = aux;
    }

    public void setExp(Exp aux) {
        this.exp = aux;
    }
    public void setIdentacion(int i){
        identacion=i;
    }
    public String toString() {
        String s ="<div style=\"text-indent:"+identacion*1.5+"cm\">"+ id + ":= ";
        s+= exp+";</div>";
        return s;
    }
}
