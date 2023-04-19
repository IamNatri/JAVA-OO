package JAVAOO.IamNatri.com.github.OOHerancaPolimorfismo.Audiofill;

public class Musica extends Audio{
    private String cantor;
    private String album;
    private String genero;

    public Musica(String titulo, double duracao, String cantor,String album,String genero){
        super(titulo, duracao);
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    public String getCantor() {
        return cantor;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public double getClassificacao() {
        if(getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 5;
        }
    }
}
