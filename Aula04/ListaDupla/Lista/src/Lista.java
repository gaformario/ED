public class Lista {
    No inicio, fim;
    int tamanho;

    // método para inserir no inicio da lista
    public void inserirInicio(int ra, String nome) {
        No aux = new No();
        aux.ra = ra;
        aux.nome = nome;

        aux.esq = null;
        if (tamanho == 0) {
            aux.dir = null;
            fim = aux;
        } else {
            aux. dir = inicio;
            inicio.esq = aux;
        }
        tamanho++;
        inicio = aux;
    }

    // método para inserir no fim da lista
    public void inserirFim(int ra, String nome) {
        No aux = new No();
        aux.ra = ra;
        aux.nome = nome;

        aux.dir = null;
        if (tamanho == 0) {
            aux.esq = null;
            inicio = aux;
        } else {
            aux.esq = fim;
            fim.dir = aux;

        }
        tamanho++;
        fim = aux;
    }

    // método para imprimir elementos da lista
    public void imprimir() {
        No aux = inicio;

        while(aux != null) {
            System.out.println(aux.ra);
            System.out.println(aux.nome);
            aux = aux.dir;
        }
    }

    // métod para pesquisar elementos da lista (no caso pesquisar Aluno pelo RA)
    public No pesquisar(int ra) {
        No aux = inicio;
        while(aux != null) {
            if(aux.ra == ra) {
                return aux;
            }
            aux = aux.dir;
        }
        return null;
    }
	
	
	//metodo para remoção de elementos da lista

}

