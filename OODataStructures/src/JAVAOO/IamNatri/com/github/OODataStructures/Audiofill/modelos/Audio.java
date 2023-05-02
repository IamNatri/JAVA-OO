package JAVAOO.IamNatri.com.github.OODataStructures.Audiofill.modelos;

public abstract class Audio<A> implements Comparable<Audio<A>> {
    private String titulo;
    private double duracao;

    private int totalReproducoes;
    private int totalCurtidas;
    private double classificacao;


    public Audio (String titulo, double duracao){
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
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
    @Override
    public int compareTo(Audio outroAudio){
        return this.getTitulo().compareTo(outroAudio.getTitulo());

    }

 }
