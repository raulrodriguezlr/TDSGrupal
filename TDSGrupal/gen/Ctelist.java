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
            s+="<div style=\"text-indent: 1.5cm\"><SPAN CLASS=\"cte\">"+aux+"</SPAN>;</div>";
        }
        return s;
    }

}
