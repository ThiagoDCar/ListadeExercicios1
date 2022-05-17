import java.util.Scanner;
public class exercicio4{
    public static void main(String[] args){
        System.out.println("Digite o primeiro número real: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        System.out.println("Digite o segundo número real: ");
        double y = input.nextDouble();
        double soma = x+y;
        System.out.println("A soma dos números é: " + soma);
        
    }
}