public class Lista {
    No inicio;
    No fim;
    int tamanho;

    public Lista() {
    }

    public void inserir(Paciente paciente) {
        if (paciente.corTriagem.equalsIgnoreCase("verde")) {
            inserirFim(paciente);

        } else if (paciente.corTriagem.equalsIgnoreCase("amarelo")) {
            inserirPrioridade(paciente);

        }
    }

    private void inserirFim(Paciente paciente) {
        No aux = new No(paciente);
        if (fim == null) {
            inicio = aux;

        } else {
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

        } else {
            No temp = fim;
            while (temp != null && !temp.paciente.corTriagem.equalsIgnoreCase("amarelo")) {
                temp = temp.ant;
            }

            if (temp != null) {
                // Encontrou um paciente "amarelo" portanto é inserido logo após 
                aux.ant = temp;
                aux.prox = temp.prox;
                if (temp.prox != null) {
                    temp.prox.ant = aux;
                } else {
                    fim = aux;
                }
                temp.prox = aux;

            } else {
                // Não encontrou nenhum paciente "amarelo" portanto é inserido no começo da lista
                aux.prox = inicio;
                inicio.ant = aux;
                inicio = aux;
            }
        }
        tamanho++;;
    }

    public void imprimir() {
        No aux = inicio;
        while(aux != null) {
            System.out.println(aux.paciente);
            aux = aux.prox;
        }
    }

    public String imprimirJanela() {
        No aux = inicio;
        String temp = "";
        while(aux != null) {
            temp += aux.paciente;
            aux = aux.prox;
        }
        return temp;
    }

    public String pesquisar(Paciente paciente) {
        No aux = inicio;
        int posicao = 1;
    
        while (aux != null) {
            if (aux.paciente.equals(paciente)) {
                if (paciente.corTriagem.equalsIgnoreCase("verde")) {
                    return "O paciente é classificado como verde e está na posição " + posicao + " na fila de atendimento.";
                } else if (paciente.corTriagem.equalsIgnoreCase("amarelo")) {
                    return "O paciente é classificado como amarelo e está na posição " + posicao + " na fila de atendimento.";
                } else {
                    return "O paciente não é classificado como prioridade e está na posição " + posicao + " na fila de atendimento.";
                }
            }
            aux = aux.prox;
            posicao++;
        }
    
        return "Paciente não encontrado na lista.";
    }

    public No pesquisaCerta(int numCartao) {
        No aux = inicio;
    
        while (aux != null) {
            if (aux.paciente.getNumeroCartao() == numCartao) {
                return aux; // Retorna o nó correspondente ao paciente encontrado
            }
            aux = aux.prox;
        }
    
        return null; // Retorna null se o paciente não for encontrado
    }
    

}
