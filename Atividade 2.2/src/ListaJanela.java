public class ListaJanela extends Lista {
    
    public ListaJanela() {
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

    public No pesquisar(int numCartao) {
        No aux = inicio;
    
        while (aux != null) {
            if (aux.paciente.numeroCartao == numCartao) {
                return aux; // Retorna o nó correspondente ao paciente encontrado
            }
            aux = aux.prox;
        }
    
        return null; // Retorna null se o paciente não for encontrado
    }
}
