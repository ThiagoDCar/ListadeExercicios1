import java.util.Scanner;
public class exercicio42{
    public static void main(String [] args){
        int [][] matriz1 = new int[4][3];
        int [][] matriz2 = new int[4][3];
        int [][] matriz3 = new int[4][3];
        Scanner input = new Scanner(System.in);
        
        for(int linha = 0; linha < 4; linha++){
            int y = linha + 1;
            for(int coluna = 0; coluna < 3; coluna++){
                int x = coluna + 1;
                System.out.println("digite o " + x +"º numero da linha " + y + " da primeira matriz: ");
                matriz1[linha][coluna] = input.nextInt();
            }
        }
        for(int linha = 0; linha < 4; linha++){
            int y = linha + 1;
            for(int coluna = 0; coluna < 3; coluna++){
                int x = coluna + 1;
                System.out.println("digite o " + x +"º numero da linha " + y + " da segunda matriz");
                matriz2[linha][coluna] = input.nextInt();
            }
        }
        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                matriz3[linha][coluna] = matriz1[linha][coluna] + matriz2[linha][coluna];
            }
        }
        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.print(" " + matriz3[linha][coluna]);
            }
            System.out.println();
        }
    }
}