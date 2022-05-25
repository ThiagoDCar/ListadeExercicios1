import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio32{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 0;
        int fatorial = 1;
        do{
            try{
                System.out.println("Digite apenas um valor inteiro positivo: ");
                 n = input.nextInt(); 
        }
            catch(InputMismatchException e){
                System.out.println("Letras não são permetidas, digite apenas número");
                input.next();
                continue;
            }
    }while(n<0);
    while(n>=1){
        fatorial = fatorial * n;
        n--;
    }
    System.out.println("O fatorial é: " + fatorial);
}
}