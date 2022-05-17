public class Blq {
    public Dcllist dcllist;
    public Sentlist sentlist;
    public String cabecera;
    public String cola;

    public Blq(String cabecera,String cola){
        this.cabecera=cabecera;
        this.cola=cola;
        dcllist=null;
    }

    public void setDcllist(Dcllist aux){
        this.dcllist=aux;
    }

    public void setSentlist(Sentlist aux) {
        this.sentlist = aux;
    }

    public String toString(){
        String s=cabecera+dcllist+sentlist+cola;
        return s;
    }


}
