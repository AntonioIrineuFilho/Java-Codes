package POO.lista_03.Frete;

class Frete {
    private double peso;
    private double distancia;
    public Frete(double peso, double distancia) {
        this.setPeso(peso);
        this.setDistancia(distancia);
    }
    public void setPeso(double peso) {
        if (peso < 0) {
            throw new IllegalArgumentException("NEGATIVE VALUE NOT ALLOWED");
        } else if (peso == 0) {
            throw new IllegalArgumentException("NULL VALUE NOT ALLOWED");
        } else {
            this.peso = peso;
        }
    }
    public double getPeso() {
        return this.peso;
    }
    public void setDistancia(double distancia) {
        if (distancia < 0) {
            throw new IllegalArgumentException("NEGATIVE VALUE NOT ALLOWED");
        } else if (distancia == 0) {
            throw new IllegalArgumentException("NULL VALUE NOT ALLOWED");
        } else {
            this.distancia = distancia;
        }
    }
    public double getDistancia() {
        return this.distancia;
    }
    public String ToString() {
        return String.format("Peso = %.2f KG\nDistância = %.2f KM", this.peso, this.distancia);
    }
    public double CalcFrete() {
        return this.peso * this.distancia * 0.01;
    }
}
