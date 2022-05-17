import java.util.ArrayList;
import java.util.List;

public class Explist {
    private List<Exp> explist;

    public Explist() {
        this.explist = new ArrayList<>();
    }

    public void add(Exp aux) {
        this.explist.add(aux);
    }

    public List<Exp> insertarPrincipio(Exp aux) {
        this.explist.add(0, aux);
        return explist;
    }

    public String toString() {
        String s = "";
        for(Exp e : explist) {
            s += e;
        }
        return s;
    }
}
