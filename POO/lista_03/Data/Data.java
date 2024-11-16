package POO.lista_03.Data;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(String data) {
        this.setData(data);
    }
    public void setData(String data) {
        if (data.length() != 10) {throw new IllegalArgumentException("INVALID DATE");}
        int dia = Integer.parseInt(data.substring(0, 2));
        int mes = Integer.parseInt(data.substring(3, 5));
        int ano = Integer.parseInt(data.substring(6));
        if (ano < 0) {throw new IllegalArgumentException("INVALID DATE");}
        if (mes < 1 || mes > 12) {throw new IllegalArgumentException("INVALID DATE");}
        if (((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) && mes == 2) {
            if (dia < 1 || dia > 29) {throw new IllegalArgumentException("INVALID DATE");}
        } else {
            if (dia < 1 || dia > 28) {throw new IllegalArgumentException("INVALID DATE");}
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30) {throw new IllegalArgumentException("INVALID DATE");}
        } else {
            if (dia < 1 || dia > 31) {throw new IllegalArgumentException("INVALID DATE");}
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return this.dia;
    }
    public int getMes() {
        return this.mes;
    }
    public int getAno() {
        return this.ano;
    }
    public String ToString() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }
}
