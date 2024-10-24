import java.util.Scanner;

class T {
    private double b, h;
    public T() {
    }
    public void set_b(double b) {
        this.b = b; 
    }

    public void set_h(double h) {
        this.h = h; 
    }
    public double Area() {
        return (this.b * this.h) / 2;
    }
}

public class Triangulo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo2 programa = new Triangulo2();
        int cont = 1;
        while (cont == 1) {
            programa.User(scanner);
            cont = programa.Menu(scanner);
        }
        scanner.close();
        
    }

    public void User(Scanner scanner) {
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        T triangulo1 = new T();
        triangulo1.set_b(base);
        triangulo1.set_h(altura);
        System.out.println(String.format("A área do triângulo é %.1f", triangulo1.Area()));
        }
    
    public int Menu(Scanner scanner) {
        System.out.print("Digite 1 para continuar e 0 para encerrar: ");
        int op = scanner.nextInt();
        return op;
        }

    }
