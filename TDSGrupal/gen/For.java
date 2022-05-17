public class For {

        private String id;
        private Exp exp1;
        private String inc;
        private Exp exp2;
        private Blq blq;

        public For() {
            id = null;
            exp1 = null;
            inc = null;
            exp2 = null;
            blq = null;
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
            s += "FOR " + id + ":= " + exp1 + inc + exp2 + "DO \n";
            s += blq;
            return s;
        }
    

}
