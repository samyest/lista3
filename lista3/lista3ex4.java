package lista3;
import java.util.Scanner;

public class lista3ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite dois valores: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x == y) {
                System.out.println("Valores iguais informados:");
                break;
            } else if (x < y) {
                System.out.println("Ordem crescente");
            } else {
                System.out.println("Ordem decrescente");
            }
        }

        scanner.close();
    }
}