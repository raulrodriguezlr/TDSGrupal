import java.util.ArrayList;
import java.util.List;

public class FormalParamList {
    public List<FormalParam> formalparam;

    public FormalParamList(){
        formalparam= new ArrayList<>();

    }
    public void add(FormalParam aux){
        formalparam.add(aux);
    }
    public String toString(){
        String s="";
        for(FormalParam aux: formalparam)
           s+=aux;
        return s;
    }
}
