import java.util.Scanner;

import javax.management.ValueExp;

class Travel {
    private double d;
    private double t;
    public Travel(double d, double t) {
        this.setDist(d);
        this.setTempo(t);
    }
    public void setDist(double d) {
        if (d >= 0) {
            this.d = d;
        } else {
            throw new IllegalArgumentException("distância negativa");
        }
    }
    public double getDist() {
        return this.d;
    }
    public void setTempo(double t) {
        if (t >= 0) {
            this.t = t;
        } else {
            throw new IllegalArgumentException("tempo negativo");
        }
    }
    public double getTempo() {
        return this.t;
    }
    public double velocidadeMedia() {
        return this.d / this.t;
    }
}

public class Viagem2 {
    public static void printGet(Travel viagem) {
        System.out.println(String.format("Distância = %.1f\nTempo = %.1f", viagem.getDist(), viagem.getTempo()));
    }
    public static void set(Travel viagem, Scanner scanner) {
        System.out.println("1-Alterar distância\n2-Alterar tempo");
        System.out.print("Digite a opção desejada: ");
        int op = scanner.nextInt();
        if (op == 1) {
            System.out.print("Digite a nova distância: ");
            double d = scanner.nextDouble();
            viagem.setDist(d);
        } else {
            System.out.print("Digite o novo tempo: ");
            double t = scanner.nextDouble();
            viagem.setTempo(t);
        }
    }
    public static void vm(Travel viagem) {
        System.out.println(String.format("Velocidade média = %.1f km/h", viagem.velocidadeMedia()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância da viagem: ");
        double d = scanner.nextDouble();
        System.out.print("Digite o tempo da viagem: ");
        double t = scanner.nextDouble();
        Travel viagem1 = new Travel(d, t);
        boolean run = true;
        while (run) {
            System.out.println("1-Ver valores\n2-Alterar valores\n3-Calcular velocidade média\n4-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op == 1 || op == 2 || op == 3 || op == 4) {
                    break;
                } else {
                    System.out.print("Opção inválida. Digite a opção desejada: ");
                    op = scanner.nextInt();
                }
            }
            if (op == 1) {
                Viagem2.printGet(viagem1);
            } else if (op == 2) {
                Viagem2.set(viagem1, scanner);
            } else if (op == 3) {
                Viagem2.vm(viagem1);
            } else {
                run = false;
            }
        }
        scanner.close();
    }
}