import java.util.Scanner;
public class exercicio9
{
  public static void main(String[] args){
      System.out.println("Digite o primeiro número real: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.println("Digite o segundo número real: ");
        double y = input.nextDouble();
        System.out.println("Digite o terceiro número real: ");
        double z = input.nextDouble();
        if(x<y & x<z){
            System.out.println("O menor numero digitado é: " + x);
        }else if(y<z){
            System.out.println("O menor numero digitado é: " + y);            
        }else{
            System.out.println("O menor numero digitado é: " + z);
        }
  }
}
