public class ProfessorSELMINI {
    String nome;
    int totalDeAuala;
    double valorAula;

    // método construtor 
    public ProfessorSELMINI( String nome, int totalDeAuala, double valorAula) {
        this.nome = nome;
        this.totalDeAuala = totalDeAuala;
        this.valorAula = valorAula;
    }

    public double calcularSalario() {
        double salarioBase;
        double horaAtividade;
        double descanso;

        salarioBase = valorAula * totalDeAuala * 4.5;
        horaAtividade = salarioBase * 5 / 100;
        descanso = (salarioBase + horaAtividade);

        return (salarioBase + horaAtividade + descanso);

    }
    
}
