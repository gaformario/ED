public class Aluno {
    int ra;
    String nome;


    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Aluno(int ra) {
        this.ra = ra;
    }


    @Override
    public String toString() {
        return "\nAluno | RA: " + ra + " | Nome: " + nome;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (ra != other.ra)
            return false;
        return true;
    }

    


    
    
    
}
