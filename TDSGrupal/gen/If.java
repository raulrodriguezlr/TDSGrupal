public class If {
    private Expcond expcond;
    private Blq blq1;
    private Blq blq2;

    public If() {
        this.expcond = null;
        this.blq1 = null;
        this.blq2 = null;
    }

    public void setExpcond(Expcond aux) {
        this.expcond = aux;
    }

    public void setBlq1(Blq aux) {
        this.blq1 = aux;
    }

    public void setBlq2(Blq aux) {
        this.blq2 = aux;
    }

    public String toString() {
        String s="";
        s += "IF " + expcond + " THEN\n";
        s += blq1 + "\n";
        s += "ELSE\n";
        s += blq2;
        return s;
    }
}
