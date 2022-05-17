import java.util.ArrayList;
import java.util.List;

public class Dcllist {
    public List<Dcl> dcl;
    public String cabecera;
    public String cola;

    public Dcllist(){
        cabecera="<UL>";
        cola="</UL>";
        dcl=new ArrayList<>();
    }

    public void setCabecera(String cabecera){
        this.cabecera=cabecera;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public void add(Dcl aux){
        dcl.add(aux);
    }
    public String varSubprogramas(){
        String s="";
        if(dcl==null)
            return s;
        else {
            for (Dcl aux : dcl) {
                s += aux;
            }
        }
        return s;
    }
    public String toString() {
        String s = "";
        if (dcl.get(0).esSubRutina() == true) {
            s += "\t" + "<H2> Funciones y procedimientos </H2>\n" + "\t" + cabecera + "\n";
            int i = 0;
            while (dcl.get(i).esSubRutina() == true) {
                s += dcl.get(i);
                i++;
                if (dcl.get(i).esSubRutina() == false)
                    s += cola + "\n";
            }
            s += "<HR/>\n";
            i = 0;
            while (dcl.get(i).esSubRutina() == true) {
                s += dcl.get(i).getDefSubrutina().subrutinaCompleta();
                i++;
            }
            while (i < dcl.size()) {
                s += dcl.get(i);
                i++;
            }
            s += "<H2>Programa principal</H2> \n";
            return s;
        }
        else{
            int i=0;
            while (i < dcl.size()&&dcl.get(i).esSubRutina() == false) {
                s += dcl.get(i);
                i++;
            }
            int aux =i;
            s += "\t" + "<H2> Funciones y procedimientos </H2>\n" + "\t" + cabecera + "\n";
            while (i < dcl.size()) {
                s += dcl.get(i);
                i++;
            }
            s += cola + "\n";
            s += "<HR/>\n";
            i = aux;
            while (i < dcl.size()) {
                s += dcl.get(i).getDefSubrutina().subrutinaCompleta();
                i++;
            }
            return s;
        }
    }
}
