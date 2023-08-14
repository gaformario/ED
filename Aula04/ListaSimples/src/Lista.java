public class Lista {
    
    No inicio, fim;
    int tamanho;

    // método de inserção de elemento numa lista simples

    public void inserir(int idade) { 
        No aux = new No();
        aux.idade = idade;

        if (inicio == null) { // verificaçã se a lista está vazia

            inicio = aux; 
            
        } else {

            fim.prox = aux;

        }

        fim = aux;
        tamanho++;

    }

    // método de impressão de elementos de uma lista
    public void imprimir() {
        No aux = inicio;

        while (aux != null) {
            
            System.out.println(aux.idade);
            aux = aux.prox;
        }

    }
}
