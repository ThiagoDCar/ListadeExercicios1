
import java.util.Scanner;
public class exercicio37{
    public static void main(String[] args) {
        int n,
            espacos,
            asteriscos;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um número ímpar: ");
        n = input.nextInt();
        
        if(n%2 != 0){
            asteriscos = 1;
            espacos = (n-1)/2;
            for(int linha = 1 ; espacos > 0 ; linha++){
                for(int i = 1 ; i <= espacos ; i++){
                    System.out.print(" ");
                }
                for(int i = 1 ; i <= asteriscos ; i++){
                    System.out.print("*");
                }
                espacos--;
                asteriscos += 2;
                System.out.println();
            }
            for(int linha=1 ; asteriscos > 0 ; linha++){
                for(int i = 1 ; i <= espacos ; i++){
                    System.out.print(" ");
                }
                for(int i = 1 ; i <= asteriscos ; i++){
                    System.out.print("*");
                }
                
                espacos++;
                asteriscos -= 2;
                System.out.println();
            }
            
        }else{
            System.out.println("Não é ímpar!");
        }
        
        
    }
}