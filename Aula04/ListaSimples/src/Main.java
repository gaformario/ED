public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.inserir(45);
        lista.inserir(1);
        lista.inserir(47);
        lista.inserir(12);
        lista.inserir(15);

        lista.ordenar();

        lista.removerPrimeiro();

        lista.imprimir();
    }
}
