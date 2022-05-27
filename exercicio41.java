import java.util.Scanner;
public class exercicio41{
    public static void main(String [] args){
         int lin = 3;
        int col = 4;
        Scanner input = new Scanner(System.in);
        int []lin1 = new int[5];
        int []lin2 = new int[5];
        int []lin3 = new int[5];
        int []lin4 = new int[5];
        for(int i = 0; i < col; i++){
            int x = i + 1;
            System.out.println("digite a " +x +"º coluna da matriz: ");
            lin1[i] = input.nextInt();
            lin2[i] = input.nextInt();
            lin3[i] = input.nextInt();
            lin4[i] = input.nextInt();
        }
        System.out.println("   " + lin1[3]);
        System.out.println("  " + lin2[2]);
        System.out.println(" " + lin3[1]);
        System.out.println(lin4[0]);
    }
}