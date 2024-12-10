package aula02.ex02;

public class Main {
    public static void main(String[] args) {
        Tv minhaTv = new Tv();
        Controle meuControle = new Controle(minhaTv); // new Controle(minhaTv) = "minhaTv" significa em qual Tv estou mexendo(acessando os canais)
        meuControle.trocarCanal();
        meuControle.ligar();
        meuControle.trocarCanal();
        meuControle.getStatusTv();
        minhaTv.marca = "Sansung";
        meuControle.getStatusTv();

    }
}
