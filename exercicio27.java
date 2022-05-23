
import java.util.Scanner;
public class exercicio27{
      public static void main(String []args){
       int n = 1;
        for(int lin = 1; lin<=5; lin++){
            for(int col = n; col<=5; col++){
                System.out.print(col + " ");
            }
            n++;
            System.out.println();
            for(int col = 5; col>=n; col--){
                System.out.print(col + " ");
            }
            System.out.println();
            n++;
        }
        
    }
   
}
