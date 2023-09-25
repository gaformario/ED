public class Paciente {
    String nome;
    String corCartao;
    int numeroCartao;

    public Paciente(String nome, String corCartao, int numeroCartao) {
        this.nome = nome;
        this.corCartao = corCartao;
        this.numeroCartao = numeroCartao;
    }

    public Paciente(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String toString() {
        return "Número do Cartão: " + numeroCartao + " | Cor do Cartão: " + corCartao + " | Nome: " + nome;
    }
   
}
