public class DefSubrutina {
    public String cabecera;
    public String id;
    public FormalParamList paramlist;

    public String tbas;

    public Blq blq;


    public DefSubrutina(String cabecera, String id, FormalParamList paramlist, String tbas, Blq blq){
        this.cabecera=cabecera;
        this.id=id;
        this.paramlist=paramlist;

        this.tbas=tbas;

        this.blq=blq;
    }
    public DefSubrutina (String cabecera,String id, FormalParamList paramlist,Blq blq){
        this.cabecera=cabecera;
        this.id=id;
        this.paramlist=paramlist;

        this.blq=blq;
    }

    public String subrutinaCompleta(){

        String s="\n\t<div>\n\t\t<A NAME=#"+id+">"+cabecera+" "+id;
        if(paramlist!=null) {
            s+="(" + paramlist + ")";
        }
        s+="</A>\n\t</div>\n";

        s+="\t"+blq.dcllist.varSubprogramas()+blq.sentlist;

        return s;
    }
    public String toString(){
        String s="\t"+"<LI>\n";
        s+="\t\t\t"+"<A HREF="+id+">";

        if (tbas == null) {
            s += id;
            if(paramlist!=null) {
                s += "(" + paramlist + ")";
            }
        } else {
            s += tbas + " " + id;
            if(paramlist!=null) {
                s += "(" + paramlist + ")";
            }
        }

        s+="</A>\n\t\t</LI>\n";
        return s;

    }
}
