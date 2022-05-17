public class Defcte {
    public Ctelist ctelist;

    public Defcte(){

    }

    public void setCtelist(Ctelist aux){
        this.ctelist=aux;
    }

    public String toString(){
        String s= "CONST \n"+ctelist;
        return s;
    }
}
