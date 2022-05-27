import java.util.Scanner;
public class exercicio39{
    public static void main(String [] args){
        int lin = 3;
        int col = 4;
        Scanner input = new Scanner(System.in);
        int []lin1 = new int[5];
        int []lin2 = new int[5];
        int []lin3 = new int[5];
        for(int i = 0; i < col; i++){
            int x = i + 1;
            System.out.println("digite a " +x +"º coluna da matriz: ");
            lin1[i] = input.nextInt();
            lin2[i] = input.nextInt();
            lin3[i] = input.nextInt();
        }
            for(int count = 0; count < lin1.length - 1; count++){
                System.out.print(lin1[count] + " ");
            }
            System.out.println();
            for(int count = 0; count < lin2.length -1; count++){
                System.out.print(lin2[count] + " ");
            }
            System.out.println();
            for(int count = 0; count < lin3.length -1; count++){
                System.out.print(lin3[count] + " ");
            }
        }
    }
