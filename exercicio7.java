import java.util.Scanner;
public class exercicio7{
    public static void main(String[] args){
    System.out.println("Digite o primeiro número real: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.println("Digite o segundo número real: ");
        double y = input.nextDouble();
        if(x>y){
            System.out.println("o numero " + x + " é maior");
        } else if(x<y){
            System.out.println("o numero " + y + " é maior");
        }else{
            System.out.println("os numeros são iguais");
        }
            
        }
        
}


