import java.util.ArrayList;
import java.util.List;

public class Ctelist {
    public List<String> ctelist;

    public Ctelist(){
        ctelist= new ArrayList<>();
    }

    public void add(String aux){
        ctelist.add(aux);
    }

    public String toString(){
        String s="";
        for(String aux:ctelist){
            s+=aux;
        }
        return s;
    }

}
