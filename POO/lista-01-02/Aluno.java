import java.util.Scanner;

public class Aluno {
    public static class Nota {
        private double nota1;
        private double nota2;
        public Nota(double nota1, double nota2) {
            this.nota1 = nota1;
            this.nota2 = nota2;
        }
        public double Media() {
            return (this.nota1 + this.nota2) / 2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        Nota nota_aluno = new Nota(n1, n2);
        System.out.println(String.format("Nota média final: %.1f", nota_aluno.Media()));
        scanner.close();

    }
}