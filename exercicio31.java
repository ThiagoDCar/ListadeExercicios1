import java.util.Random;
import java.util.Scanner;
public class exercicio31{
   public static void main(String [] ags){
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       System.out.println("Digite quantas posições terá o vetor: ");
       int n = input.nextInt();
       int[] v = new int[n]; 
       for(int i = 0; i < v.length; i++){
           v[i] = rand.nextInt(1000);
           System.out.print(v[i] + " ");
       }
       for(int i = 0; i < v.length; i++){
           for(int j = 0; j < v.length; j++){
               if(v[i] < v[j]){
                   int x = v[i];
                   v[i] = v[j];
                   v[j] = x;
               }
           }
       }
       System.out.println();
       for(int i = 0; i < v.length; i++){
           System.out.print(v[i] + " ");
       }
   }
}
