import java.util.Scanner;

public class exercicio35{
   public int fibo(int x){
       if(x <= 2)
           return 1;
        else{
            return fibo(x-1) + fibo(x-2);
        }
   }
   public static void main(String [] args){
       System.out.println("digite qual termo queira saber de fibonacci");
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       exercicio35 fi = new exercicio35();
       System.out.println(" o " + n + "º termo de fibonacci é: " + fi.fibo(n));
   }
    }

