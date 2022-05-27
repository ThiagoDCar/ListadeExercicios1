import java.util.Scanner;
public class exercicio36{
    public static void main(String [] args){
        System.out.println("digite um numero impar de linhas: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 1;
        if(n % 2 != 0){
            for(int lin = 1; lin <= n; lin++){
                if(lin % 2 != 0){
                    for(int col = 1; col <= lin; col++){
                        System.out.print("*");
                    }
                    System.out.println();
                    lin++;
                }
            }
            for(int lin = n-2; lin >= 1; lin--){
                if(lin % 2 != 0){
                    for(int col = 1; col <= lin; col++){
                        System.out.print("*");
                    }
                    System.out.println();
                    lin--;
                }
            }
        }else{
            System.out.println("O número digiado não é impar");
        }
    }
}