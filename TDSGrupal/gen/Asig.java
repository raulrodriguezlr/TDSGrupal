public class Asig {
    private String id;
    private Exp exp;

    public Asig() {
        this.id = "";
        this.exp = new Exp();
    }

    public void setId(String aux) {
        this.id = aux;
    }

    public void setExp(Exp aux) {
        this.exp = aux;
    }

    public String toString() {
        String s = id + ":= ";
        s+= exp;
        return s;
    }
}
