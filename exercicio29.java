import java.util.Scanner;
public class exercicio29{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra para ser invertida: ");
        String entrada = input.next();
        String saida = "";
        for(int i = entrada.length() - 1; i>=0; i--){
            saida = saida + entrada.charAt(i);
        }
        System.out.println(saida);
    }  
}
