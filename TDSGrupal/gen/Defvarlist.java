import java.util.ArrayList;
import java.util.List;

public class Defvarlist {
    public List<Varlist> varlist;
    public List<String> tbas;

    public Defvarlist(){
        this.varlist=new ArrayList<>();
        this.tbas=new ArrayList<>();

    }
    public void addTbas(String tbas){

        this.tbas.add(tbas);
    }
    public void add(Varlist varlist){
        this.varlist.add(varlist);

    }

    public List<Varlist> getVarlist() {
        return varlist;
    }

    public String toString(){
        String s="";
        int i=0;
        if(varlist.isEmpty()){
            return s;
        }
        else {
            for (Varlist aux : varlist) {
                s += "<div>";
                s += aux + ": ";
                s += tbas.get(i);
                s += ";\n";
                s += "</div>";
                i++;
            }
        }

        return s;

    }
}
