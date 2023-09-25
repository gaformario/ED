public class Main {
    public static void main(String[] args) throws Exception {

        // 10-V, 11-V, 5-A, 12-V e 6-A
        Lista lista = new Lista();

        Paciente p1 = new Paciente("Selmini", "V", 10);
        Paciente p2 = new Paciente("Jorge","V",11);
        Paciente p3 = new Paciente("Gabriel","A",5);
        Paciente p4 = new Paciente("Luiz","V",12);
        Paciente p5 = new Paciente("Bruno","A",6);

        lista.inserirPaciente(p1);
        lista.inserirPaciente(p2);
        lista.inserirPaciente(p3);
        lista.inserirPaciente(p4);
        lista.inserirPaciente(p5);

        //lista.imprimir();
        
        //System.out.println(lista.pesquisar(p5));
    
        
    }
}
