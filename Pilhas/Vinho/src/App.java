import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        
        Stack<Vinho> pilha = new Stack<>();

        //inserir
        pilha.push(new Vinho("Vinho tinto seco", 300));
        pilha.push(new Vinho("Catuaba", 30));
        pilha.push(new Vinho("Romanee Conti", 1500));
        pilha.push(new Vinho("Petrus", 89));
        pilha.push(new Vinho("Mouton", 50000));

        System.out.println(pilha.size());

        // objetos a serem retirados da pilha
        Stack<Vinho> tirados = new Stack<>();

        //tirados.push(pilha.pop());
        //tirados.push(pilha.pop());

        //impressao dos 3 mais antigos da pilha e os retirados
        //System.out.println(pilha);
        for (int i = 1; i <= pilha.size() - 3 ; i++) {
            tirados.push(pilha.pop());
        }

        System.out.println(tirados);

        //listar vinhos da adega
        for (Vinho v : pilha) {
            System.out.println(v);
            
        }

        //retorna os vinhos pra adega
        while(!tirados.isEmpty()) {
            pilha.push(tirados.pop());
        }

    }
}
