import java.util.ArrayList;
import java.util.List;

public class Sentlist {
    private List<Sent> sentlist;

    public Sentlist() {
        this.sentlist = new ArrayList<>();
    }

    public void add(Sent aux) {
        sentlist.add(aux);
    }

    public String toString() {
        String s = "";
        s += "\n<div> BEGIN </div>\n";
        for(Sent aux : sentlist) {
            s += "<div>" + aux + "</div>" + "\n";
        }
        s += "<div> END </div>\n";
        s += "<A HREF=#Variables>Variables</A>";
        return s;
    }
}
