import java.util.Scanner;
public class exercicio43{
    public static void main(String [] args){
        int [][] m1 = new int[3][4];
        int [][] m2 = new int[4][3];
        int [][] m3 = new int[3][3];
        Scanner input = new Scanner(System.in);
        
        for(int linha = 0; linha < 3; linha++){
            int y = linha + 1;
            for(int coluna = 0; coluna < 4; coluna++){
                int x = coluna + 1;
                System.out.println("digite o " + x +"º numero da linha " + y + " da primeira matriz: ");
                m1[linha][coluna] = input.nextInt();
            }
        }
        for(int linha = 0; linha < 4; linha++){
            int y = linha + 1;
            for(int coluna = 0; coluna < 3; coluna++){
                int x = coluna + 1;
                System.out.println("digite o " + x +"º numero da linha " + y + " da segunda matriz");
                m2[linha][coluna] = input.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                for(int x = 0; x < 3; x++){
                    m3 [i][j] += m1[i][x] * m2[x][j];
                }
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}