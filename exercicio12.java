import java.util.Scanner;
public class exercicio12{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o primeiro número real: ");
        double x = input.nextDouble();
        System.out.println("Insira o segundo número real: ");
        double y = input.nextDouble();
        System.out.println("Insira o terceiro número real: ");
        double z = input.nextDouble();
        double produto = x*y*z;
        System.out.println("O produto é: " + produto);
    }
}
