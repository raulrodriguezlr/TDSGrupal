public class Defvar {
    public String cabecera;
    public Defvarlist defvarlist;

    public Defvar(String cabecera){
        this.cabecera=cabecera;

        defvarlist= new Defvarlist();
    }

    public void setDefvarlist(Defvarlist aux){
        this.defvarlist=aux;
    }

    public String toString(){

        if(defvarlist.getVarlist().isEmpty()){
            return "";
        }
        String s ="<div style=\"text-indent: 0cm\">"+cabecera+"</div>\n<div style=\"text-indent: 1.5cm\">"+defvarlist+"</div>";
        //s += defvarlist;

        return s;
    }
}
