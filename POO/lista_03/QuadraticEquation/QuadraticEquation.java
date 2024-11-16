package POO.lista_03.QuadraticEquation;

class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    public QuadraticEquation(double a, double b, double c) {
        this.setNumA(a);
        this.setNumB(b);
        this.setNumC(c);
    }
    public void setNumA(double a) {
        this.a = a;
    }
    public void setNumB(double b) {
        this.b = b;
    }
    public void setNumC(double c) {
        this.c = c;
    }
    public double getNumA() {
        return this.a;
    }
    public double getNumB() {
        return this.b;
    }
    public double getNumC() {
        return this.c;
    }
    public String ToString() {
        return String.format("Coeficiente A = %.2f\nCoeficiente B = %.2f\nCoeficiente C = %.2f", this.a, this.b, this.c);
    }
    public double Delta() {
        double d = this.b * this.b - 4.0 * this.a * this.c;
        return d;
    }
    public boolean RaizesReais() {
        boolean rr;
        double delta = this.Delta();
        if (delta < 0) {
            rr = false;
        } else {
            rr = true;
        }
        return rr; 
    }
    public double Raiz1() {
        double r1;
        if (this.Delta() < 0) {
            throw new IllegalArgumentException("NEGATIVE DELTA, NO REAL ROOTS");
        } else {
            r1 = (-this.b + Math.sqrt(this.Delta())) / (2.0 * this.a);
        }
        return r1;
    }
    public double Raiz2() {
        double r2;
        if (this.Delta() < 0) {
            throw new IllegalArgumentException("NEGATIVE DELTA, NO REAL ROOTS");
        } else {
            r2 = (-this.b - Math.sqrt(this.Delta())) / (2.0 * this.a);
        }
        return r2;
    }
}
