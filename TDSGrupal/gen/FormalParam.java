import java.text.Normalizer;

public class FormalParam {
    public Varlist varlist;
    public String tbas;

    public FormalParam(){
        varlist=null;
        tbas="";
    }
    public FormalParam(Varlist aux, String s){
        varlist=aux;
        tbas=s;
    }

    public String toString(){
        String s="";
        s+=varlist+ ": "+"<SPAN CLASS=\"palres\">" + tbas + "</SPAN>";
        return s;
    }
}

