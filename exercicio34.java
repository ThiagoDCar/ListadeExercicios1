import java.util.Scanner;
public class exercicio34{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int n;
        int fibo = 1;
        int x1 = 1;
        int x2 = 1;
        do{
            System.out.println("Digite um número inteiro positivo");
            n = input.nextInt();
        }while(n<0);
            if(n == 1 || n == 2){
            System.out.println("1");
        } else{
            for(int y = 3; y <= n; y++){
                fibo = x1+x2;
                x1 = x2;  
                x2 = fibo;  
            }
            System.out.println(fibo);
        }
        
    }
}
