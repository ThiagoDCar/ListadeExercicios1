import java.util.Scanner;
import java.util.InputMismatchException;

public class exercicio22{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double p1 = 0;
        double p2 = 0;
        double pr = 0;
        boolean con = true;
        
        do{
              try{
                System.out.println("Digite a P1 ");
                p1 = input.nextDouble();
                System.out.println("Digite a P2: ");
                p2 = input.nextDouble();
                System.out.println("Digite a Pr: ");
                pr = input.nextDouble();
                if(p1>=0 && p1<=10){
                    if(p2>=0 && p2<=10){
                        if(pr>=0 && pr<=10){
                            con = false;
                        }
                    }
                }if(con){
                    System.out.println("Digite apenas números inteiros de 0 a 10.");
                    
                }
            }
            catch(InputMismatchException e) {
                System.out.println("Digite apenas números inteiros e positivos de 0 a 10.");
                input.next();
                continue;
            }
        }
        while(con );
        double ms = ((p1+p2)/2)*0.6 + pr*0.4;
        System.out.println("A média é: " + ms);
    }
   
}
