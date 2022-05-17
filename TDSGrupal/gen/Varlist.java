import java.util.ArrayList;
import java.util.List;

public class Varlist {
    public List<String> identificador;

    public Varlist(){
        identificador=new ArrayList<>();
    }


    public void add(String identificador) {
        this.identificador.add(identificador);
    }


    public String toString(){
        String s= "";
        for (String aux :identificador){
            s+=aux;
        }

        return s;
    }
}
