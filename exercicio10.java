import java.util.Scanner;
public class exercicio10{  
    public static void main(String[] args){
        System.out.println("Digite o numero inteiro: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x%3 == 0){
           System.out.println("é divisivel por 3"); 
        }else{
            System.out.println("Não é divisivel por 3");
        }
    }
}
