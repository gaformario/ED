package br.espmmusic.playlist;

import br.espmmusic.music.Musica;

public class Playlist {
    
    Musica lista[];
    int indice;


    public Playlist(int tamanho) {

        this.lista = new Musica[tamanho];
        indice = 0;

    }

    public void inserir(Musica musica) {
        if (this.indice < this.lista.length) {
            this.lista[this.indice] = musica;
            this.indice++;
            
        }
    }

    public void tocar(String titulo) {
        int i = 0;
        while (i < indice) {
            Musica musica = lista[i];
            //verifica se o titulo da musica passada é igual ao que tem na playlist
            if (musica != null && musica.getTitulo().equals(titulo)) {
                System.out.println("Música tocada: " + titulo);
                int total = musica.getTotal(); 
                total++; 
                musica.setTotal(total); 
                return;
                
            }
            i++;
        }
        System.out.println("A música '" + titulo + "' não foi encontrada na playlist.");
    }


    public String listar() {
        String listaMusicas = "Lista de músicas na playlist:\n";
        for (int i = 0; i < indice; i++) {
            listaMusicas += "--------------------\n" + lista[i].getDados() + "\n";
        }
        return listaMusicas;
    }
    
    
}
