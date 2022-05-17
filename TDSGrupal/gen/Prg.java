import java.util.ArrayList;
import java.util.List;

public class Prg {
    public String cabecera;
    public String cola;
    public List<Blq> blq;
    public Prg(String cabecera, String cola, List<Blq> blq){
        this.cabecera=cabecera;
        this.cola=cola;
        this.blq=blq;

    }
    public Prg(String cabecera, String cola){
        this.cabecera=cabecera;
        this.blq= new ArrayList<>();
        this.cola=cola;
    }
    public void add(Blq aux){
        blq.add(aux);
    }
    public String toString(){

        String s ="<H1>"+cabecera  +cola +"</H1>\n";
        for(Blq aux:blq){
            s+=aux;
        }
        return s;
    }

}
