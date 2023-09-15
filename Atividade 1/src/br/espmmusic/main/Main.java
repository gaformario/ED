package br.espmmusic.main;
import br.espmmusic.cantor.Cantor;
import br.espmmusic.music.Musica;
import br.espmmusic.playlist.Playlist;

public class Main {
    public static void main(String[] args) throws Exception {
        Cantor c = new Cantor("Kendrick Lamar", "EUA");
        //System.out.println(c.getDados());

        Musica m = new Musica("Mr Morale", "Rap", c);

        Musica m2 = new Musica("LOVE", "Rap", c);

        Musica m3 = new Musica("HUMBLE.", "Rap", c);

        Musica m4 = new Musica("Money Trees", "Rap", c);

        //System.out.println(m.getDados());

        
        Playlist p = new Playlist(5);
        p.inserir(m);
        p.inserir(m2);
        p.inserir(m3);
        p.inserir(m4);
        
        p.tocar("Mr Morale");
        System.out.println();

        p.tocar("LOVE");
        System.out.println();

        p.tocar("LOVE");
        System.out.println();

        
        System.out.println(p.listar());
    }
}
