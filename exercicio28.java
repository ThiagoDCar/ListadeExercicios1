import java.util.Scanner;

public class exercicio28
{
   public static void main(String []args){
       Scanner input = new Scanner(System.in);
       System.out.println("Digite um valo inteiro positivo: ");
       int n = input.nextInt();
       int i = 1;
        for(int lin = 1; lin<=n; lin++){
            for(int col = i; col<=n; col++){
                System.out.print(col + " ");
            }
            i++;
            System.out.println();
            for(int col = n; col>=i; col--){
                System.out.print(col + " ");
            }
            System.out.println();
            i++;
        }
        
    }
   
}