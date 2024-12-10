package aula02.ex02;

public class Tv {
    public String tamanho;
    public String cor;
    public String marca;
    protected final String[] CANAIS;
    public int indice_canal = 0;
    public Boolean estado;

    public Tv(){ // Método construtor
        this.tamanho = "Médio";
        this.cor = "Preta";
        this.marca = "Escolha..";
        this.CANAIS = new String[] {"Globo", "SBT", "Band", "Tatu"};
        this.estado = false;
    }
}
 /* "final" = Imutabilidade: Variáveis final não podem ter seus valores alterados após a inicialização.

Constantes: Usada para definir constantes, geralmente combinada com static para valores globais (por exemplo, public static final int MAX_IDADE = 100;).

Variáveis de instância: Variáveis de uma classe podem ser final, mas devem ser inicializadas apenas uma vez (no construtor ou na declaração).

Variáveis locais: Em métodos, final impede a modificação de uma variável após sua inicialização.

Parâmetros de método: Impede a alteração de parâmetros dentro do método.

Referências a objetos: Para variáveis de referência, final impede a reatribuição para outro objeto, mas não impede a modificação do conteúdo do objeto. */

// tamanho
// cor
// marca
// canais
// estado(ligada, desligada)