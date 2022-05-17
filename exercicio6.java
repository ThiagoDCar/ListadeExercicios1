import java.util.Scanner;
import java.lang.Math;
public class exercicio6{
    public static void main(String[] args){
        System.out.println("Digite o primeiro número real: ");
        Scanner input = new Scanner(System.in);
        double x = input.nextFloat();
        System.out.println("Digite o segundo número real: ");
        double y = input.nextFloat();
        double media = Math.sqrt(x*y);
        System.out.println("A média geométrica dos números é: " + media);
        
    }
}