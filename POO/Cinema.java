import java.util.Scanner;

public class Cinema {
    public static class Entrada {
        private int dia;
        private double hora;
        public Entrada(int dia, double hora) {
            this.dia = dia;
            this.hora = hora;
        }
        public double Inteira() {
            double inteira;
            if (this.dia == 2 || this.dia == 3 || this.dia == 5) {
                if (this.hora >= 17 || this.hora == 0) {
                    inteira = 16 + 16 * 0.5;
                } else {
                    inteira = 16;
                }
            } else if (this.dia == 4) {
                inteira = 8;
            } else {
                if (this.hora >= 17 || this.hora == 0) {
                    inteira = 20 + 20 * 0.5;
                } else {
                    inteira = 20;
                }
            }
            return inteira;
        }
        public double Meia() {
            double meia;
            if (this.dia == 2 || this.dia == 3 || this.dia == 5) {
                if (this.hora >= 17 || this.hora == 0) {
                    meia = (16 + 16 * 0.5) / 2;
                } else {
                    meia = 16 / 2;
                }
            } else if (this.dia == 4) {
                meia = 8;
            } else {
                if (this.hora >= 17 || this.hora == 0) {
                    meia = (20 + 20 * 0.5) / 2;
                } else {
                    meia = 20 / 2;
                }
            }
            return meia;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Domingo\n2-Segunda-feira\n3-Terça-feira\n4-Quarta-feira\n5-Quinta-feira\n6-Sexta-feira\n7-Sábado");
        System.out.print("Digite o dia da sessão desejada: ");
        int d = scanner.nextInt();
        boolean verificador = false;
        while (verificador == false) {
            if (d >= 1 && d <= 7) {
                verificador = true;
            } else {
                System.out.print("Dia inválido. Digite o dia da sessão desejada: ");
                d = scanner.nextInt();
            }
        }
        System.out.print("Digite o horário da sessão: ");
        double h = scanner.nextDouble();
        Entrada entrada1 = new Entrada(d, h);
        System.out.println("1-Entrada Inteira\n2-Meia Entrada");
        System.out.print("Digite o número da informação desejada: ");
        int op = scanner.nextInt();
        if (op == 1) {
            System.out.println(String.format("Valor da Inteira: R$ %.2f", entrada1.Inteira()));
        } else if (op == 2) {
            System.out.println(String.format("Valor da Meia: R$ %.2f", entrada1.Meia()));
        } else {
            System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
