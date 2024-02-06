package src.MayorMenor;

public class Numero {

        private int a;
        private int b;
        private int c;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }

        public int getC() {
            return c;
        }

        public void setC(int c) {
            this.c = c;
        }

        public int encontrarMayor() {
            int mayor = a;
            if (b > mayor) {
                mayor = b;
            }
            if (c > mayor) {
                mayor = c;
            }
            return mayor;
        }
    }
