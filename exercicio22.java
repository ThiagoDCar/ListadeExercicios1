import java.util.Scanner;
import java.util.InputMismatchException;

public class exercicio22{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double p1 = 0;
        double p2 = 0;
        double pr = 0;
        
        do{
              try{
                System.out.println("Digite a P1 ");
                p1 = input.nextDouble();
                System.out.println("Digite a P2: ");
                p2 = input.nextDouble();
                System.out.println("Digite a Pr: ");
                pr = input.nextDouble();
            }
            catch(InputMismatchException e) {
                System.out.println("Digite apenas números inteiros e positivos.");
                input.next();
                continue;
            }
        }
        while(p1 < 0 || p2 < 0 || pr < 0 || p1 > 10 || p2 > 10 || pr > 10 );
        double ms = ((p1+p2)/2)*0.6 + pr*0.4;
        System.out.println("A média é: " + ms);
    }
   
}
