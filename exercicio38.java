import java.util.Scanner;
public class exercicio38{
    public static void main(String [] args){
        int []v = new int[10];
        int meio,
            inicio,
            fim;
            boolean x = true;
        Scanner input = new Scanner(System.in);
        for(int i=0; i< v.length - 1; i++){
            int y = i+1;
            System.out.println("Digite o número da posição " + y + " do vetor");
            v[i] = input.nextInt();
        }
        inicio = 0;
        fim = v.length - 1;
        System.out.println("Qual número deseja saber o índice?");
        int n = input.nextInt();
        
        while(x){
            meio = (inicio + fim) / 2;
            if(v[meio] == n){
                System.out.println("o valor do índice é: " + meio + " o elemento é: " + n);
                x = false;                
        }
            else if(v[meio] < n){
                inicio = meio + 1;
            }
            else if(v[meio] > n){
                fim = meio - 1;
            }
            if(fim == meio){
                System.out.println("O número digiado não está no vetor");
                x = false;
            }
        }
    
    }
}