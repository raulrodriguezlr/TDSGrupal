import java.util.ArrayList;
import java.util.List;

public class Sentlist {
    private List<Sent> sentlist;
    private int identacion;
    public Sentlist() {
        this.sentlist = new ArrayList<>();
    }

    public void add(Sent aux) {
        sentlist.add(aux);
    }
    public void setIdentacion(int i){
        identacion=i;
    }

    public List<Sent> getSentlist1() {
        return sentlist;
    }
    public void indentacionFor(Sent aux){
        aux.getBucle_for().setIdentacion(1);
        aux.getBucle_for().getBlq().getSentlist().setIdentacion(2);
        for (int j = 0; j < aux.getBucle_for().getBlq().getSentlist().getSentlist1().size(); j++) {
            if (aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).isAsig())
                aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).getAsig().setIdentacion(3);

            if (aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).isProc_call())
                aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).getProcall().setIdentacion(3);
        }
    }
    public void indentacionWhile(Sent aux){
        aux.getBucle_while().setIdentacion(1);
        aux.getBucle_while().getBlq1().getSentlist().setIdentacion(2);
        for (int j = 0; j < aux.getBucle_while().getBlq1().getSentlist().getSentlist1().size(); j++) {
            if (aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).isAsig())
                aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).getAsig().setIdentacion(3);

            if (aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).isProc_call())
                aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).getProcall().setIdentacion(3);
        }
    }
    public String toString() {
        String s = "";
        s += "\n<div style=\"text-indent:"+ identacion*1.5+"cm\"><SPAN CLASS=\"palres\"> BEGIN </SPAN></div>" ;

        for(Sent aux : sentlist) {
            if(aux.isFor()) {
                indentacionFor(aux);
            }
            if(aux.isWhile()){
                indentacionWhile(aux);
            }
            s +=  aux + "\n";
        }

        s += "\n<div style=\"text-indent:" + identacion*1.5+"cm\"><SPAN CLASS=\"palres\"> END </SPAN></div>" ;

        return s;
    }
}
