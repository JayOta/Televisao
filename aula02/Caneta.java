package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.printf("Modelo: %s\n", this.modelo);
        System.out.printf("Cor: %s\n", this.cor);
        System.out.printf("Tampada: %s\n", this.tampada);
        System.out.printf("Ponta: %.2f\n", this.ponta);
        System.out.printf("Carga: %d\n", this.carga);
    }
    void rabiscar(){
        if(tampada){
            System.out.print("Não pode rabiscar!\nCaneta está tamapada\n");
        } else {
            System.out.print("Rabisco!\n");
        }
    }
    void tampar(){
        if(this.tampada == true) {
        System.out.println("Caneta já está tampada!\n");
    } else {
        this.tampada = true;
        System.out.println("Caneta tampada!\n");
    }
}

    void destampar(){
        if(this.tampada == false) {
            System.out.println("Caneta já está destampada!\n");
        } else {
            this.tampada = false;
            System.out.println("Caneta destampada!\n");
        }
    }
}
