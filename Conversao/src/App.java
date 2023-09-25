import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<Integer>();
        int numero = 0;

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        while(numero > 0){
            pilha.push(numero % 2);
            numero = numero / 2;
        }

        while(!pilha.isEmpty()){
            System.out.print(pilha.pop());
        }
        sc.close();
    }
}
