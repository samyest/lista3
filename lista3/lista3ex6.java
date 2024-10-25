package lista3;
import java.util.Scanner;

public class lista3ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        while (true) {
            System.out.print("Digite um número: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Número negativo inserido");
                break;
            }

            System.out.println("Tabuada do " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
            System.out.println(); 
        }

        scanner.close();
    }
}
