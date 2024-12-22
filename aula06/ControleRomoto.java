package aula06;

public class ControleRomoto implements Controlador {
    
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    private int indiceCanal;
    private final String[] CANAIS;
    
    // Métodos Especiais
    public ControleRomoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
        this.CANAIS = new String[] {"Globo", "SBT", "Nickelodeon", "Cartoon"};
        this.indiceCanal = 0;
    }
    
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }
    private String getCanal(){
        return this.CANAIS[this.indiceCanal];
    }

    // Métodos Abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.print("TV ligando..\nLigada.\n\n");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.print("TV desligando..\nDesligada.\n\n");

    }

    @Override
    public void abrirMenu() {
        System.out.println("---- MENU ----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: (" + this.getVolume() + "%) ");
        for(int i = 0; i < getVolume(); i += 10){
            System.out.print("|");
        }
        System.out.println("\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...\nMenu fechado.\n");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 5);
            System.out.println("+5");
            System.out.println("Volume: " + getVolume() + "%\n");
        } else {
            System.out.println("Não é possível aumentar volume, TV está desligada\n");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
            System.out.println("-5");
            System.out.println("Volume: " + getVolume() + "%\n");
        } else {
            System.out.println("Não é possível diminuir volume, TV está desligada\n");
        }
    }
 
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            setVolume(0);
            System.out.println("Volume: Mudo");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Volume: " + getVolume() + "%");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(getTocando())){
            if (this.getVolume() == 0){
                System.out.println("Aumente o volume para uma melhor experiência!");
                this.setTocando(true);
            } else {
                this.setTocando(true);
                System.out.println("Reproduzindo..\n");
            }
        } else {
            System.out.println("Ligue a TV para reproduzir!\n");
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && getTocando()){
            this.setTocando(false);
            System.out.println("Reprodução pausada.\n");
        } else {
            System.out.println("Ligue a TV para pausar!\n");
        }
    }

    @Override
    public void trocarCanal() {
        if(getLigado()){
            System.out.println("'" + getCanal() + "' - Trocando canal..");
            this.indiceCanal++;
            if(this.indiceCanal >= this.CANAIS.length){
                this.indiceCanal = 0;
            } else {
            System.out.println(" Canal atual: " + this.getCanal() + "\n");
            }
        } else {
            System.out.println("Ligue a TV para trocar de canal!");
        }
    }

    @Override
    public void verCanal() {
        System.out.println("Canal atual: " + getCanal());
    }

    @Override
    public void menuCanais() {
        System.out.println("Canais:");
        for(String canal: this.CANAIS){
            System.out.printf(" - %s", canal + "\n");
        }
    }
}
