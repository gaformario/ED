public class Lista {
    
    No inicio, fim;
    int tamanho;

    // método de inserção de elemento no final de uma lista simples

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

    // método de ordenação de elementos de uma lista
    public void ordenar() {

        No aux = inicio;
        int temp;

        for (int j = 0; j <= tamanho; j++) {
            aux = inicio;
            for (int i = 1; i < tamanho; i++) {
                if (aux.idade > aux.prox.idade) {
                    temp = aux.idade;
                    aux.idade = aux.prox.idade;
                    aux.prox.idade = temp;
                    
                }
                aux = aux.prox;         
            }
        }

    }

    //metodo de remoção do primeiro elemento da lista
    public void removerPrimeiro() {
        if (inicio != null) {
            No aux = inicio;
            inicio = inicio.prox;
            aux.prox= null;
            aux = null;
            tamanho--;
        }

    }

    //método para remover n elementos de uma lista
	public boolean removerElementos(int n) {
		System.out.println("n = " + n + "\ntamanho = " + tamanho);
		if(n > tamanho) {
			return false;
			}
		for(int i = 1; i <= n; i++) {
			removerPrimeiro();
			}
		return true;
	}

    //método que copie uma lista
	public Lista copiar() {
		Lista aux = this;
		return aux;
	}

    //método que inverta uma lista
    
}
