import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int x, y, z;
        double nota;

        System.out.print("Informe um valor: ");
        x = teclado.nextInt();

        if(x % 2 == 0) {
            System.out.print("par");
        }
        else {
            System.out.println("ímpar");
        }

        
    }
}
