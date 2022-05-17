import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio19{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n = 0;
        do{
        System.out.println("Digite um valor inteiro positivo: ");
            try{
               n = input.nextInt();
            }
            catch(InputMismatchException e) {
                System.out.println("Digite apenas números inteiros e positivos.");
                input.next();
                continue;
            }
        }
        while( n < 0);
        if(n%2 == 0){
            System.out.println("Seu número é par");
        } else{
            System.out.println("Seu número é ímpar");
        }
    }
}
