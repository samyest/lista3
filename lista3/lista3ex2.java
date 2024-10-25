package lista3;
import java.util.Scanner;

public class lista3ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Digite um número inteiro positivo: ");
            int num = scanner.nextInt();
            
            int tPar = 0;
            int tImpar = 0;
            int sPar = 0;
            int sImpar = 0;
            
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) { 
            tPar++;
            sPar += i;
        } else {
            tImpar++;
            sImpar += i;
        }
    }
            
        System.out.println("total números pares: " + tPar);
        System.out.println("soma números pares: " + sPar);
        System.out.println("total números ímpares: " + tImpar);
        System.out.println("soma números ímpares: " + sImpar);
            
        scanner.close();
        
    }
 }
    
    

