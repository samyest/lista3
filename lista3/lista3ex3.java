package lista3;
import java.util.Scanner;

public class lista3ex3 {
        public static void main(String[] args) {
            int soma= 0, nPerfeito;
    
            System.out.print("digite um número inteiro positivo: ");

            Scanner scanner = new Scanner(System.in);
            nPerfeito = scanner.nextInt();
    
            for(int i = 1; i< nPerfeito; i++){
            if(nPerfeito % i == 0){
            soma += i;
        }
                scanner.close();
        }
    
            if(soma == nPerfeito){
            System.out.println("O número digitado é perfeito");
            } else{
            System.out.println("O número ditado não é perfeito");
         }
    }
    }