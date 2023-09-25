class Paciente {
    String nome;
    String corTriagem;
    int numeroCartao;

    public Paciente(String nome, String corTriagem, int numeroCartao) {
        this.nome = nome;
        this.corTriagem = corTriagem;
        this.numeroCartao = numeroCartao;
    }

    public Paciente(int numeroCartao) {
        this.numeroCartao = numeroCartao;
    }


    public String getCorTriagem() {
        return corTriagem;
    }
    
    public int getNumeroCartao() {
        return numeroCartao;
    }

    @Override
    public String toString() {
        return "Paciente [nome=" + nome + ", corTriagem=" + corTriagem + ", numeroCartao=" + numeroCartao + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paciente other = (Paciente) obj;
        if (corTriagem == null) {
            if (other.corTriagem != null)
                return false;
        } else if (!corTriagem.equals(other.corTriagem))
            return false;
        return true;
    }

    

    
}