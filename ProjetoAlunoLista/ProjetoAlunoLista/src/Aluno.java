public class Aluno {
    int ra;
    String nome;


    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Aluno -> RA: " + ra + " | Nome: " + nome;
    }

    
    
    
}
