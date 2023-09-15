public class Lista<T> {
    No<T> inicio;
    No<T> fim;
    int tamanho;

    //metodo para inserir no inicio da lista
    public void inserirInicio(T dado) {
        No<T>  aux = new No<>(dado);
        if (inicio == null) {
            fim = aux;
        }
        else {
            aux.prox = inicio;
            inicio.ant = aux;
        }
        inicio = aux;
        tamanho++;
    }

    //metodo para inserir no final da lista
    public void inserirFinal(T dado) {
        No<T> aux = new No<>(dado);
        if(fim == null) {
            inicio = aux;
        }
        else {
            aux.ant = fim;
            fim.prox = aux;
        }
        fim = aux;
        tamanho++;
    }

    //metodo para impressao
    public void imprimir (){
        No<T> aux = inicio;
        while(aux != null) {
            System.out.println(aux.dado);
            aux = aux.prox;
        }
    }

    //metodo para pesquisa dentro da lista e retornar endereço do objeto
    public No<T> pesquisar(T dado) {
        No<T> aux = inicio;
        while(aux != null) {
            if(aux.dado == dado) {
                return aux;
            }
            aux = aux.prox;
        }
        return null;
    }

    //metodo para remoção de elementos da lista
    public void remover(T dado) {
        No<T> aux = pesquisar(dado);

        if(aux == null) {
            return;

        }
        // se a lista tem 1 elemento
        if(tamanho == 1) {
            inicio = null;
            fim = null;
            aux = null;
        }

        // remove o primeiro
        else if(aux ==   inicio) {
            inicio = aux.prox;
            inicio.ant = null;
            aux.prox = null;
            aux = null;

        }

        //remove o ultimo
        else if(aux == fim) {
            fim = aux.ant;
            fim.prox = null;
            aux.ant = null;
            aux = null;

        }

        //outra posição qualquer removida
        else {
            aux.ant.prox = aux.prox;
            aux.prox.ant = aux.ant;
            aux.prox = null;
            aux.ant = null;
            aux = null;

        }
        tamanho--;
    }
}
