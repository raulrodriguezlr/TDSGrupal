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

        String s="\n\t<div style=\"text-indent: 0cm\">\n\t\t<A NAME=" +id+">"+"<SPAN CLASS=\"palres\">" + cabecera + "</SPAN>" + " " + "<SPAN CLASS=\"ident\">" + id + "</SPAN>";
        if(paramlist!=null) {
            s+="(" + paramlist + ")";
        }
        if(tbas!=null){
            s+=" :"+"<SPAN CLASS=\"palres\">" + tbas + "</SPAN>";
        }
        s+="</A>\n\t</div>\n";

        s+="\t"+blq.dcllist.varSubprogramas()+blq.sentlist;
        s+="\t\t\t"+"<div style=\"text-indent: 1.5cm\"><A HREF=\"#"+ id +"\">Inicio Subprograma</A></div>\n";
        s+="\t\t\t"+"<div style=\"text-indent: 1.5cm\"><A HREF=\"#InicioPrograma\">Inicio Programa</A></div>\n";
        s+="<HR/>";
        return s;
    }
    public String toString(){
        String s="\t"+"<LI>\n";
        s+="\t\t\t"+"<A HREF=\"#"+ id +"\">";

        if (tbas == null) {
            s += "<SPAN CLASS=\"ident\">" + id + "</SPAN>";
            if(paramlist!=null) {
                s += "(" + paramlist + ")";
            }
        } else {
            s += "<SPAN CLASS=\"palres\">" + tbas + "</SPAN>" + " " + "<SPAN CLASS=\"ident\">" + id + "</SPAN>";
            if(paramlist!=null) {
                s += "(" + paramlist + ")";
            }
        }

        s+="</A>\n\t\t</LI>\n";
        return s;

    }
}
