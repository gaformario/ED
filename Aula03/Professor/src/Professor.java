import java.util.Scanner;

class Professor {
    String nome;
    double valorHoraAula;
    int numAulaSemana;

    public Professor(String nome, double valorHoraAula, int numAulaSemana) {
        this.nome = nome;
        this.valorHoraAula = valorHoraAula; 
        this.numAulaSemana = numAulaSemana;
    }

    public double calcularSalarioBase() {
        return valorHoraAula * numAulaSemana * 4.5;
    }

    public double calcularAdicionalHoraAtividade() {
        return 0.05 * calcularSalarioBase();
    }

    public double calcularDSR() {
        return (calcularSalarioBase() + calcularAdicionalHoraAtividade()) / 6;
    }

    public double calcularSalarioBruto() {
        return calcularSalarioBase() + calcularAdicionalHoraAtividade() + calcularDSR();
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println("Nome professor " + i + ":");
            String nome = teclado.nextLine();

            System.out.println("Valor hora aula professor" + i + ":");
            double valorHoraAula = teclado.nextDouble();

            System.out.println("Numero de aulas professor" + i + ":");
            int numAulaSemana = teclado.nextInt();

            Professor professor = new Professor(nome,valorHoraAula, numAulaSemana);

            double salarioBruto = professor.calcularSalarioBruto();
            System.out.println("Salário bruto do " + nome + " é R$" + salarioBruto);

            teclado.nextLine();
        }

        teclado.close();
    }
}
