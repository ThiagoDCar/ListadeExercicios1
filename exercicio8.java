import java.util.Scanner;

public class exercicio8
{
    public static void main(String[] args){
        System.out.println("Digite o numero inteiro: ");
        Scanner input = new Scanner(System.in);
        int x =input.nextInt();
        if(x%2 == 0){
            System.out.println("O numero digitado é par ");
        } else{
            System.out.println("O numero digitado é impar ");
        }
            
        }
    }

