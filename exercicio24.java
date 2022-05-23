import java.util.Scanner;
public class exercicio24
{
    public static void main(String []args){
        boolean num = true;
        int n = 0;
        do{
        System.out.println("Digite um número inteiro positivo: ");
       Scanner input = new Scanner(System.in);
        n = input.nextInt();
       num = n<=0;
        }while(num);
       for(int lin = n; lin>=1; lin--){
           for(int col = 1; col<=lin; col++){
               System.out.print(col + " ");
           }
           System.out.println();
       }
    }
    }

