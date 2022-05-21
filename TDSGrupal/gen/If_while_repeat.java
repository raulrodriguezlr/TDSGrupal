public class If_while_repeat {
    private Expcond expcond;
    private Blq blq1;
    private Blq blq2;
    private int identacion;

    public If_while_repeat() {
        this.expcond = null;
        this.blq1 = null;
        this.blq2 = null;
        identacion=0;
    }


    public void setIdentacion(int i){
        identacion=i;
    }
    public Expcond getExpcond() {
        return this.expcond;
    }

    public Blq getBlq1() {
        return this.blq1;
    }
    public void setIdentacionBlq1(int i){
        blq1.setIdentacionSentlist(i);
    }
    public void setIdentacionBlq2(int i){
        blq1.setIdentacionSentlist(i);
    }

    public Blq getBlq2() {
        return this.blq2;
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

    public int getIdentacionBlq1() {
        return blq1.getIdentacionSentlist();
    }
    public int getIdentacionBlq2() {
        return blq2.getIdentacionSentlist();
    }
}

