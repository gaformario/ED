public class Lista {
    
    No inicio, fim;
    int tamanho;

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
}
