package aula02.ex02;

public class Tv {
    public String tamanho;
    public String cor;
    public String marca;
    public final String[] CANAIS;
    public int indice_canal = 0;
    public Boolean estado;

    public Tv(){ // pensar em como utilizar tmb o "void" aqui e aparecer lá no getStatusTv
        this.tamanho = "Médio";
        this.cor = "Preta";
        this.marca = "Escolha..";
        this.CANAIS = new String[] {"Globo", "SBT", "Band", "Tatu"};
        this.estado = false;
    }
}
// tamanho
// cor
// marca
// canais
// estado(ligada, desligada)