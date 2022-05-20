import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio21{
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
        for(int linha = 1; linha<= n; linha ++){
            for(int col = 1; col <= n; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
   
}
