public class For {

        private String id;
        private Exp exp1;
        private String inc;
        private Exp exp2;
        private Blq blq;
        private int identacion;

        public For() {
            id = null;
            exp1 = null;
            inc = null;
            exp2 = null;
            blq = null;
            identacion=0;
        }

        public Blq getBlq() {
            return blq;
        }

    public void setIdentacion(int i){
            identacion=i;
        }
        public void setId(String aux) {
            this.id = aux;
        }

        public void setExp1(Exp aux) {
            this.exp1 = aux;
        }

        public void setExp2(Exp aux) {
            this.exp2 = aux;
        }

        public void setInc(String aux) {
            this.inc = aux;
        }

        public void setBlq(Blq aux) {
            this.blq = aux;
        }

        public String toString() {
            String s = "";
            s += "\n<div style=\"text-indent:"+ 1.5*identacion+"cm\"><SPAN CLASS=\"palres\"> FOR </SPAN>" + id + ":= " + exp1 + " " + inc + " " + exp2 +
                    "<SPAN CLASS=\"palres\"> DO </SPAN>"+" </div>\n";
            s +=  blq + "\n";
            return s;
        }
    

}
