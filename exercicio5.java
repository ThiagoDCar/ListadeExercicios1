import java.util.Scanner;
public class exercicio5{
    public static void main(String[] args){
        System.out.println("Digite o primeiro número real: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.println("Digite o segundo número real: ");
        double y = input.nextDouble();
        double media = (x+y)/2;
        System.out.println("A média aritmética dos números é: " + media);
        
    }
}