package JAVAOO.IamNatri.com.github.OOHerancaPolimorfismo.Audiofill;
import JAVAOO.IamNatri.com.github.OOHerancaPolimorfismo.Audiofill.Audio;
import JAVAOO.IamNatri.com.github.OOHerancaPolimorfismo.Audiofill.Musica;
import JAVAOO.IamNatri.com.github.OOHerancaPolimorfismo.Audiofill.Preferidas;

public class main {

    public static void main(String[] args) {
        Audio M = new Musica("amor",1.5,"matheus", "pop", "brega");
        M.curte();
        System.out.println(M.getTotalCurtidas());
        for (int i = 0; i < 2001; i++) {
            M.reproduzir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(M);
    }


}
