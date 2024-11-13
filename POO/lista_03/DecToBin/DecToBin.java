package POO.lista_03.DecToBin;

class DecToBin {
    private int n;
    public DecToBin(int n) {
        this.setNum(n);
    }
    public void setNum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("NEGATIVE VALUE NOT ALLOWED");
        } else {
            this.n = n;
        }
    }
    public int getNum() {
        return this.n;
    }
    public String ToString() {
        return String.format("Número decimal = %d", this.n);
    }
    public String Binario() {
        String binInv = "";
        String bin = "";
        int valor = this.n;
        if (valor == 0) {
            bin = "0";
        } else {
            while (valor > 0) {
                binInv = binInv + (valor % 2);
                valor = valor / 2;
            }
            for (int i = (binInv.length())-1; i >= 0; i--) {
                bin = bin + binInv.charAt(i);
            }
        }
        return bin;
    }
}
