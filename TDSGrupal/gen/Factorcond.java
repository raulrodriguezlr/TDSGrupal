import java.util.ArrayList;
import java.util.List;

public class Factorcond {
    private Exp exp1;
    private String opcomp;
    private Exp exp2;
    private Expcond expcond;
    private List<String> string;

    public Factorcond() {
        exp1 = null;
        opcomp = null;
        exp2 = null;
        expcond = null;
        string = new ArrayList<>();
    }

    public void setExp1(Exp aux) {
        exp1 = aux;
    }

    public void setExp2(Exp aux) {
        exp2 = aux;
    }

    public void setOpcomp(String aux) {
        opcomp = aux;
    }

    public void setExpcond(Expcond aux) {
        expcond = aux;
    }

    public void addString(String aux) {
        string.add(aux);
    }

    public String toString() {
        String s = "";
        if(exp1!=null) {
            s += exp1 + opcomp + exp2;
        }
        if(expcond!=null) {
            s += "(" + expcond + ")";
        }
        if(!string.isEmpty()) {
            s += string;
        }
        return s;
    }
}
