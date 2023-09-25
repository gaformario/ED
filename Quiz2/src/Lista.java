public class Lista {
    private No topo;

    public int remover() {
        if (topo == null) {
            return -1;
            
        }
        No lixo = topo;
        topo = topo.prox;
        return lixo.dado;
        
    }

    public int primeiro() {
        if (topo == null) {
            return -1;
            
        }
        return topo.dado;
    }

    public void push(int elemento) {
        No novo = new No(elemento);
        novo.prox = topo;
        topo = novo;
    }
    
    public void imprimir() {
        No aux = topo;

        while (aux != null) {
            System.out.println(aux.dado);
            aux = aux.prox;
            
        }
    }
}
