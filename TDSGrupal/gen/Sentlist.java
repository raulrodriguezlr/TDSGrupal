import java.util.ArrayList;
import java.util.List;

public class Sentlist {
    private List<Sent> sentlist;
    private int identacion;
    public Sentlist() {
        identacion=1;
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
        aux.getBucle_for().getBlq().getSentlist().setIdentacion(3);
        for (int j = 0; j < aux.getBucle_for().getBlq().getSentlist().getSentlist1().size(); j++) {
            if (aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).isAsig())
                aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).getAsig().setIdentacion(3);

            if (aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).isProc_call())
                aux.getBucle_for().getBlq().getSentlist().getSentlist1().get(j).getProcall().setIdentacion(3);
        }
    }

    public int getIdentacion() {
        return identacion;
    }

    public void indentacionRepeat(Sent aux, int i){
        int ident=i;
        aux.getBucle_repeat().setIdentacion(1*ident+1);
        aux.getBucle_repeat().getBlq1().getSentlist().setIdentacion(2*ident);
        for (int j = 0; j < aux.getBucle_repeat().getBlq1().getSentlist().getSentlist1().size(); j++) {
            if (aux.getBucle_repeat().getBlq1().getSentlist().getSentlist1().get(j).isAsig())
                aux.getBucle_repeat().getBlq1().getSentlist().getSentlist1().get(j).getAsig().setIdentacion(1 + ident);

            if (aux.getBucle_repeat().getBlq1().getSentlist().getSentlist1().get(j).isProc_call())
                aux.getBucle_repeat().getBlq1().getSentlist().getSentlist1().get(j).getProcall().setIdentacion(1 + ident);
        }
        }

    public void indentacionIF(Sent aux,int i){
                int ident=i;
                aux.getCond().setIdentacion(1*ident+1);
                aux.getCond().getBlq1().getSentlist().setIdentacion(2+ident);
                aux.getCond().getBlq2().getSentlist().setIdentacion(2+ident);
                Sentlist listsent=aux.getCond().getBlq1().getSentlist();
                for (int j = 0; j < listsent.getSentlist1().size(); j++) {
                    if (listsent.getSentlist1().get(j).isAsig())
                        listsent.getSentlist1().get(j).getAsig().setIdentacion(1+ident);
                    if (listsent.getSentlist1().get(j).isProc_call())
                        listsent.getSentlist1().get(j).getProcall().setIdentacion(1+ident);
                    if (listsent.getSentlist1().get(j).isIf()) {
                        aux.getCond().getBlq1().getSentlist().getSentlist1().get(j).setIdentacion(1+ident);
                        aux.getCond().getBlq1().setIdentacionSentlist(1+ident);
                        aux.getCond().getBlq2().setIdentacionSentlist(1+ident);
                        aux.getCond().setIdentacionBlq1(1+ident);
                    }

                }
                Sentlist listsent1=aux.getCond().getBlq2().getSentlist();
                for (int j = 0; j < listsent1.getSentlist1().size(); j++) {
                    if (listsent1.getSentlist1().get(j).isAsig())
                        listsent1.getSentlist1().get(j).getAsig().setIdentacion(1+ident);
                    if (listsent1.getSentlist1().get(j).isProc_call())
                        listsent1.getSentlist1().get(j).getProcall().setIdentacion(1+ident);


                }

    }
    public void indentacionWhile(Sent aux,int i){
        int ident=i;
        aux.getBucle_while().setIdentacion(1*ident+1);
        aux.getBucle_while().getBlq1().getSentlist().setIdentacion(2*ident+1);
        for (int j = 0; j < aux.getBucle_while().getBlq1().getSentlist().getSentlist1().size(); j++) {
            if (aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).isAsig())
                aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).getAsig().setIdentacion(3*ident);
            if (aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).isProc_call())
                aux.getBucle_while().getBlq1().getSentlist().getSentlist1().get(j).getProcall().setIdentacion(3*ident);
        }
    }

    public String toString() {
        String s = "";
        s += "\n<div style=\"text-indent:"+ (identacion-1)*1.5+"cm\"><SPAN CLASS=\"palres\"> BEGIN </SPAN></div>" ;

        for(Sent aux : sentlist) {
            if(aux.isFor()) {
                indentacionFor(aux);
            }
            if(aux.isWhile()){
                indentacionWhile(aux,identacion);
            }
            if(aux.isRepeat()){
                indentacionRepeat(aux,identacion);
            }
            if(aux.isIf()){

                indentacionIF(aux,identacion);
            }
            s +=  aux + "\n";
        }

        s += "\n<div style=\"text-indent:" + (identacion-1)*1.5+"cm\"><SPAN CLASS=\"palres\"> END </SPAN></div>" ;

        return s;
    }
}
