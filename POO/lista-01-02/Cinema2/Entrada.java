public class Entrada {
    private int dia;
    private double hora;
    public Entrada(int dia, double hora) {
        this.setDia(dia);
        this.setHora(hora);
    }
    public void setDia(int dia) {
        if (!(dia <= 0 && dia > 7)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("DIA INVÁLIDO");
        }
    }
    public int getDia() {
        return this.dia;
    }
    public void setHora(double hora) {
        if (!(hora < 0 && hora >= 24)) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("HORA INVÁLIDA");
        }
    }
    public double getHora() {
        return this.hora;
    }
    public String ToString() {
        return String.format("Dia: %d\nHora: %.2f", this.dia, this.hora);
    }
    public double Inteira(int dia, double hora) {
        double valor;
        if (dia == 2 || dia == 3 || dia == 5) {
            if (hora >= 17 || hora == 0) {
                valor = 16 + 16 * 0.5;
            } else {
                valor = 16;
            } 
        } else if (dia == 3) {
            valor = 8;
        } else {
            if (hora >= 17 || hora == 0) {
                valor = 20 + 20 * 0.5;
            } else {
                valor = 20;
            }
        }
        return valor;
    }
    public double Meia(int dia, double hora) {
        double valor;
        if (dia == 2 || dia == 3 || dia == 5) {
            if (hora >= 17 || hora == 0) {
                valor = (16 + 16 * 0.5)/2;
            } else {
                valor = 16/2;
            } 
        } else if (dia == 3) {
            valor = 8;
        } else {
            if (hora >= 17 || hora == 0) {
                valor = (20 + 20 * 0.5)/2;
            } else {
                valor = 20/2;
            }
        }
        return valor; 
    }
}