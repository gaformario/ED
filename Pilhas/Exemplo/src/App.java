import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Stack<String> lista = new Stack<>();
        lista.push("JOAO FRANGO");
        lista.push("Selminao");
        lista.push("1berto");

        System.out.println(lista);

        lista.pop();

        System.out.println(lista);

        System.out.println(lista.peek());


    }
}
