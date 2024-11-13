import java.util.Scanner;

public class Viagem {
    public static class Travel {
        private double dist;
        private double tempo;
        public Travel(double dist, double tempo) {
            this.dist = dist;
            this.tempo = tempo;
        }
        public double Vm() {
            double media = this.dist / this.tempo;
            return media;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância da viagem(em KM): ");
        double d = scanner.nextDouble();
        System.out.print("Digite o tempo da viagem(em horas): ");
        double t = scanner.nextDouble();
        Travel viagem1 = new Travel(d, t);
        System.out.println(String.format("A velocidade média da viagem foi de %.1f km/h", viagem1.Vm()));
        scanner.close();
    }
}
