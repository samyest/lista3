package lista3;

import java.util.Scanner;

public class lista3ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        do {
            System.out.print("digite um número inteiro positivo ou 0 para sair: ");
            n = scanner.nextInt();
            
            if (n > 0) {
                int resultado = 1;
                System.out.print("Multiplicação: ");
                
                for (int i = 1; i <= n; i++) {
                    resultado *= i;
                    System.out.print(i + (i == n ? " = " : " * "));
                }
                
                System.out.println(resultado);
            } else if (n < 0) {
                System.out.println("Insira um número positivo.");
            }
            
        } while (n != 0);
        
        System.out.println("Algoritmo encerrado");
        scanner.close();
    }
}
