package aula02.ex02;
import java.util.Scanner;

public class Controle {
    Tv minhaTv = new Tv();
    public String tamanho;
    public String cor;
    public String marca;
    public boolean fisico;
    

    public Controle(Tv tv){ // pensar em como utilizar tmb o "void" aqui e aparecer lá no getStatusControle
        this.tamanho = "Médio";
        this.cor = "Preto";
        this.marca = "Escolher";
        this.fisico = true;
        this.minhaTv = tv;
    }
    public void getStatusControle(){
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Estado(físico): " + this.fisico);
    }
    public void getStatusTv(){
        System.out.println("Mostrando status da Tv: ");
        System.out.println("Tamanho: " + minhaTv.tamanho);
        System.out.println("Cor: " + minhaTv.cor);
        System.out.println("Marca: " + minhaTv.marca);
        System.out.println("Estado(ligado): " +minhaTv.estado);
        // System.out.print(this.getCanais()); 
    }
    public void ligar(){
        if(minhaTv.estado == true){
            System.out.println("Tv já está ligada!");
        } else {
            minhaTv.estado = true;
            System.out.println("Tv ligada!");
        }
    }
    public void desligar(){
            if(minhaTv.estado == false){
            System.out.println("Tv já está desligada!");
        } else {
            minhaTv.estado = false;
            System.out.println("Tv desligada!");
        }
    }
    public void getCanais(){
        System.out.println("Canais disponíveis:");
        for(String canal : minhaTv.CANAIS){
            System.out.println("- " + canal);
        }
    }
    public void trocarCanal(){
        if(minhaTv.estado == false){
            System.out.println("Não é possível trocar de canal, a Tv está desligada!");
        } else {
            Scanner leitor = new Scanner (System.in);
            String resposta;
            do {  // enquanto a resposta for igual a "sim" o programa pergunta se deseja trocar o canal novamente
            System.out.println("Deseja trocar de canal? (sim|nao)");
            resposta = leitor.nextLine().toLowerCase();
            if(resposta.equals("nao")){
                System.out.println("Ok!");
            } else if(resposta.equals("sim")) {
                minhaTv.indice_canal++;
                if(minhaTv.indice_canal >= minhaTv.CANAIS.length){
                    minhaTv.indice_canal = 0;
                } else {
                    System.out.printf("Canal atual %s\n", minhaTv.CANAIS[minhaTv.indice_canal]);
                }
                }
            } while (!resposta.equals("nao")); // se a resposta for "nao" o programa finaliza(para de perguntar)
            leitor.close();
        }
    }
}
// "==" = Compara se as duas referências apontam para o mesmo endereço de memória.
// "equals()" = verifica conteúdo (se os valores armazenados nas strings são iguais);

// tamanho
// cor
// marca
// fisico
// ligar()
// desligar()