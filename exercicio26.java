import java.util.Scanner;
public class exercicio26
{
  public static void main(String []args){
      System.out.println("Digite um valor inteiro positivo: ");
      Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int p = 1;
       for(int lin = 1; lin<=n; lin++){
           for(int col = p; col<=n; col++){
               System.out.print(col + " ");
           }
           System.out.println();
           p++;
       }
    }
}
