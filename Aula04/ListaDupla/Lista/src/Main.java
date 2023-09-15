public class Main {
    public static void main(String[] args) {
        
        Lista l1 = new Lista();

        l1.inserirInicio(15, "Selmini");
        l1.inserirInicio(30, "Sandra");
        l1.inserirFim(17, "Surjan");
        l1.inserirFim(45, "Flavio");


       // l1.imprimir();


        System.out.println(l1.pesquisar(17));
        System.out.println(l1.inicio.dir.dir);

    }
}
