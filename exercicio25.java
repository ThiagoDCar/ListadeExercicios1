
public class exercicio25
{
   public static void main(String []args){
       int n = 1;
       for(int lin = 5; lin>=1; lin--){
           for(int col = n; col<=5; col++){
               System.out.print(col + " ");
           }
           System.out.println();
           n++;
       }
    }
   
}
