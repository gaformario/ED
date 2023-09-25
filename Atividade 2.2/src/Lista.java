public class Lista {
    No inicio;
    No fim;
    int tamanho;

    public Lista() {   
    }

    public void inserirPaciente(Paciente paciente) {
        if (paciente.corCartao.equalsIgnoreCase("A")) {
            inserirPrioridade(paciente);
        }
        else if (paciente.corCartao.equalsIgnoreCase("V")){
            inserirFim(paciente);
        }
    }

    private void inserirFim(Paciente paciente) {
        No aux = new No(paciente);
        if (fim == null) {
            inicio = aux;
        }
        else {
            aux.ant = fim;
            fim.prox = aux;
        }
        fim = aux;
        tamanho++;
    }

    private void inserirPrioridade(Paciente paciente) {
        No aux = new No(paciente);
        if (inicio == null) {
            fim = aux;
            inicio = aux;
        } else {
            No atual = inicio;
            No anterior = null;

            // encontra ultimo "A" da lista
            while (atual != null) {
                if (atual.paciente.corCartao.equalsIgnoreCase("A")) {
                    anterior = atual;
                }
                atual = atual.prox;
            }
    
            //insere o novo após o "A" existente
            if (anterior != null) {
                aux.prox = anterior.prox;
                if (aux.prox != null) {
                    aux.prox.ant = aux;
                } else {
                    fim = aux;
                }
                anterior.prox = aux;
                aux.ant = anterior;
            } else {
                // se nao tiver "A" insere no começo da lista
                aux.prox = inicio;
                inicio.ant = aux;
                inicio = aux;
            }
        }
        tamanho++;
    }
    

    public String pesquisar(Paciente paciente) {
        No aux = inicio;
        int posicao = 1;
        while (aux != null) {
            if (aux.paciente.equals(paciente)) {
                return "Prioridade: " + (paciente.corCartao.equalsIgnoreCase("A") ? "Sim" : "Não") +
                       ", Posição no atendimento: " + posicao;
            }
            aux = aux.prox;
            posicao++;
        }
        return "Paciente não encontrado na lista.";
    }

    public void imprimir() {
        No aux = inicio;
        while (aux != null) {
            System.out.println(aux.paciente);
            aux = aux.prox;
        }
    }
}
