package POO.lista_03.Retangulo;

class Retangulo {
    private double base;
    private double altura;
    public Retangulo(double base, double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }
    public void setBase(double base) {
        if (base < 0) {
            throw new IllegalArgumentException("NEGATIVE VALUE NOT ALLOWED");
        } else if (base == 0) {
            throw new IllegalArgumentException("NULL VALUE NOT ALLOWED");
        } else {
            this.base = base;
        }
    }
    public double getBase() {
        return this.base;
    }
    public void setAltura(double altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("NEGATIVE VALUE NOT ALLOWED");
        } else if (altura == 0) {
            throw new IllegalArgumentException("NULL VALUE NOT ALLOWED");
        } else {
            this.altura = altura;
        }
    }
    public double getAltura() {
        return this.altura;
    }
    public String ToString() {
        return String.format("Base = %.2f\nAltura = %.2f", this.base, this.altura);
    }
    public double CalcArea() {
        return this.base * this.altura;
    }
    public double CalcDiagonal() {
        double hipo = this.base * this.base + this.altura * this.altura;
        return Math.sqrt(hipo);
    }
}