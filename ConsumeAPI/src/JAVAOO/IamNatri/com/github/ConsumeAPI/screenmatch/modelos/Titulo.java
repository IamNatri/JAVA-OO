package JAVAOO.IamNatri.com.github.ConsumeAPI.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

import java.net.URISyntaxException;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb tituloOmdb) throws IllegalArgumentException {
        try {
            this.nome = tituloOmdb.title();
            this.anoDeLancamento = Integer.parseInt(tituloOmdb.year().replaceAll("[^0-9]", ""));
            this.duracaoEmMinutos = Integer.parseInt(tituloOmdb.runtime().replaceAll("[^0-9]", ""));
        }catch (NumberFormatException a){
            System.out.println("Erro: " + a);
        }catch (IllegalArgumentException b){
            System.out.printf("Erro: Argumento invalido. %S%n", b);
        }

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", incluidoNoPlano=" + incluidoNoPlano +
                ", somaDasAvaliacoes=" + somaDasAvaliacoes +
                ", totalDeAvaliacoes=" + totalDeAvaliacoes +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
