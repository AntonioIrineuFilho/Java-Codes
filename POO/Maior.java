import java.util.Scanner;

public class Maior {
    public static class Maior_Numero {
        private int n1;
        private int n2;
        private int n3;
        public Maior_Numero(int n1, int n2, int n3) {
            this.n1 = n1;
            this.n2 = n2;
            this.n3 = n3;
        }
        public int Maior() {
            int n;
            if (this.n1 >= this.n2 && this.n1 >= this.n3) {
                n = n1;
            } else if (this.n2 >= this.n3) {
                n = n2;
            } else {
                n = n3;
            }
            return n;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite 3 números inteiros separados por espaço: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        Maior_Numero maior = new Maior_Numero(num1, num2, num3);
        System.out.println(String.format("O maior número digitado foi %d", maior.Maior()));
        scanner.close();
    }
}
