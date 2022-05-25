import java.io.*;

public class Bagagem {
    private int quantidade;
    private int peso;
    private int tamanho;
    private int taxa;
    private String detalhe;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTaxa() {
        return taxa;
    }

    public void setTaxa(int taxa) {
        this.taxa = taxa;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    /* Testador */
    public static void main(String[] args) {
        int quantidade = 0;
        int peso = 0;
        int tamanho = 0;
        int taxa = 0;
        String detalhe = "";

        System.out.println(quantidade);
        System.out.println(peso);
        System.out.println(tamanho);
        System.out.println(taxa);
        System.out.println(detalhe);
    }
}