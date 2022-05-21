import java.util.ArrayList;
import java.util.List;

public class Expcond {
    private List<Factorcond> factorcond;
    private List<String> oplog;

    public Expcond() {
        this.factorcond = new ArrayList<>();
        this.oplog = new ArrayList<>();
    }

    public void addFactorcond(Factorcond aux) {
        factorcond.add(aux);
    }

    public void addOplog(String aux) {
        oplog.add(aux);
    }

    public String toString() {
        String s = "";
        if(!factorcond.isEmpty()) {
            int factorlenght = factorcond.size();
            int oploglenght = oplog.size();
            if(factorlenght >= oploglenght) {
                int i = 0;
                while(i < factorlenght) {
                    if(i < oploglenght) {
                        s += factorcond.get(i);
                        s +=" " + "<SPAN CLASS=\"palres\">" + oplog.get(i) + "</SPAN>"+" ";
                    }
                    else {
                        s += factorcond.get(i);
                    }
                    i++;
                }
            }
            else {
                int i = 0;
                while(i < oploglenght) {
                    if(i < factorlenght) {
                        s += factorcond.get(i);
                        s += "<SPAN CLASS=\"palres\">" + oplog.get(i) + "</SPAN>";
                    }
                    else {
                        s += "<SPAN CLASS=\"palres\">" + oplog.get(i) + "</SPAN>";
                    }
                    i++;
                }
            }
        }
        return s;
    }
}
