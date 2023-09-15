package br.espmmusic.cantor;

public class Cantor {
    
    String nome;
    String nacionalidade;

    public Cantor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Cantor(String nome) {
        this.nome = nome;
    }

    public String getDados() {
        return "Nome: " + this.nome + "\nNacionalidade: " + this.nacionalidade;
    }
}


