public class Main {
    public static void main(String[] args) {

        Lista<Aluno> lista = new Lista<>();

        Aluno a1 = new Aluno(2, "Caçarola");
        Aluno a2 = new Aluno(15, "BBBBBBBBBBBBBBB");

        lista.inserirInicio(new Aluno(15, "Jax"));
        lista.inserirFinal(a2);
        lista.inserirInicio(a1);

        lista.imprimir();

        lista.remover(a1);

        System.out.println("-------------");
        lista.imprimir();
    }
}
