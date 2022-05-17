public class Dcl {
    public Defcte defcte;
    public Defvar defvar;

    public DefSubrutina defSubrutina;
    public String cabecera;
    public String cola;

    public Dcl(){
        defcte=null;
        defvar=null;
        defSubrutina=null;

        this.cabecera="";
        this.cola="";

    }
    public void setDefcte(Defcte aux){
        defcte=aux;
    }

    public void setDefvar(Defvar aux){
        defvar=aux;
    }
    public void setDefSubrutina(DefSubrutina aux){

        defSubrutina=aux;
    }


    public DefSubrutina getDefSubrutina() {
        return defSubrutina;
    }


    public Defvar getDefvar() {
        return defvar;
    }

    public Defcte getDefcte() {
        return defcte;
    }
    public boolean esSubRutina(){
        if(this.defSubrutina!=null)
            return true;

        else return false;
    }

    public String toString(){

        String s="\t"+cabecera;
        if(defcte!=null)
            s+=defcte;
        if(defvar!=null)
            s+=defvar;
        if(defSubrutina!=null)
            s+=defSubrutina;

        s+="\t"+cola;
        return s;
    }
}
