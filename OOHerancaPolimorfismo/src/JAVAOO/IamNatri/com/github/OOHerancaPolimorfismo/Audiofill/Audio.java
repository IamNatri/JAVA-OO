package JAVAOO.IamNatri.com.github.OOHerancaPolimorfismo.Audiofill;

public abstract class Audio {
    private String titulo;
    private double duracao;

    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;


    public Audio (String titulo, double duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public double getClassificacao(){
        return classificacao;
    }
 }