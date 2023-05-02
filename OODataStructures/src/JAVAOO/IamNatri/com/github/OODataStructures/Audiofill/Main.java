package JAVAOO.IamNatri.com.github.OODataStructures.Audiofill;

import JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.classificacao.Preferidas;
import JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.classificacao.insights;
import JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.modelos.Audio;
import JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.modelos.Musica;
import JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.modelos.Podcast;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Audio a = new Musica("amor",1.5,"matheus", "pop", "brega");
        Audio b = new Musica("xaea",2,"matheus", "pop", "pop");
        Audio c = new Musica("alou",2,"matheus", "pop", "cac");
        Audio g = new Podcast("Falando em voz", 30, "kaka", "a");
        a.curte();
        System.out.println(a.getTotalCurtidas());
        for (int i = 0; i < 2001; i++) {
            a.reproduzir();
        }
        insights insights = new insights();
        insights.classificacao(a);

        Preferidas preferidas = new Preferidas();
        preferidas.addingElement(a);
        preferidas.addingElement(b);
        preferidas.addingElement(c);

//        ArrayList<Audio> musicas = new ArrayList<>();
//        musicas.add(a);
//        musicas.add(b);
//        musicas.add(c);
        System.out.println(preferidas.getElement(0));

        System.out.println(preferidas.getArray());
    }
}