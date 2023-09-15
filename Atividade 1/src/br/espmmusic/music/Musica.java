package br.espmmusic.music;

import br.espmmusic.cantor.Cantor;

public class Musica {

    String titulo;
    String genero;
    Cantor cantor;
    int total;

    public Musica(String titulo, String genero, Cantor cantor) {
        this.titulo = titulo;
        this.genero = genero;
        this.cantor = cantor;
    }

    public String getDados() {

        return 
        "      MÚSICA" + 
        "\nTítulo: " + 
        this.titulo + "\nGenero: " +
        this.genero + "\nStreams: " + 
        this.total + "\n      CANTOR" + 
        "\n" + 
        cantor.getDados();

    }

    //retorna titulo
    public String getTitulo() {

        return titulo;

    }

    //retorna total
    public int getTotal() {

        return total;

    }
    //atualiza o total
    public void setTotal(int total) {

        this.total = total;
        
    }

}
