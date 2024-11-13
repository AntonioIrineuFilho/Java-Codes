import java.util.Scanner;

class C {
    private double raio;
    public C () {
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return this.raio;
    }
    public double Area() {
        return Math.pow(this.raio, 2) * Math.PI;
    }
    public double Circunferencia() {
        return 2 * this.raio * Math.PI;
    }
}

public class Circulo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circulo2 programa = new Circulo2();
        int cont = 1;
        while (cont == 1) {
            programa.User(scanner);
            cont = programa.Menu(scanner);
        }
        scanner.close();
    }

    public void User(Scanner scanner) {
        System.out.print("Digite o raio do círculo: ");
        double r = scanner.nextDouble();
        C circulo1 = new C();
        circulo1.setRaio(r);
        System.out.println(String.format("A área do círculo é %.1f", circulo1.Area()));
        System.out.println(String.format("A circunferência do círculo é %.1f", circulo1.Circunferencia()));
    }

    public int Menu(Scanner scanner) {
        System.out.print("Digite 1 para continuar e 0 para encerrar: ");
        int op = scanner.nextInt();
        return op;
    }
}
