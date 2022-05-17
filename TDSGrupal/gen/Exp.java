import java.util.ArrayList;
import java.util.List;

public class Exp {
    private List<Factor> factor;
    private List<String> op;

    public Exp() {
        factor = new ArrayList<>();
        op = new ArrayList<>();
    }

    public void addFactor(Factor aux) {
        this.factor.add(aux);
    }

    public void addOp(String aux) {
        this.op.add(aux);
    }

    public String toString() {
        String s = "";
        for(int i=0; i < factor.size(); i++) {
                s += factor.get(i).toString();
                if (i != factor.size() - 1) {
                    s += op.get(i).toString();
                }
        }
        return s;
    }

}