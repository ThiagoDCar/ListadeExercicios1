import java.util.Scanner;
import java.util.InputMismatchException;
public class exercicio33{
    public int fatorial(int x){
            if(x== 0 || x == 1){
                return 1;
            }else{
                return x * fatorial(x-1);
        }
    }
    public static void main(Scanner []args){
        Scanner input = new Scanner(System.in);
        exercicio33 resposta = new exercicio33();
        System.out.println("Digite o valor que queira descobrir o fatorial");
        int n = input.nextInt();
        if(n<0){
            System.out.println("o numero digitado não é positivo");
        }else{
            System.out.println(" o fatorial de " + n + " é: " + resposta.fatorial(n));
        }
        }
}


