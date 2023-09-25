public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Paciente paciente1 = new Paciente("Paciente1", "verde", 10);
        Paciente paciente2 = new Paciente("Paciente2", "verde", 11);
        Paciente paciente3 = new Paciente("Paciente3", "amarelo", 5);
        Paciente paciente4 = new Paciente("Paciente4", "verde", 12);
        Paciente paciente5 = new Paciente("Paciente5", "amarelo", 6);

        lista.inserir(paciente1);
        lista.inserir(paciente2);
        lista.inserir(paciente3);
        lista.inserir(paciente4);
        lista.inserir(paciente5);

        lista.imprimir();


        System.out.println(lista.pesquisar(paciente5));
    }
}
