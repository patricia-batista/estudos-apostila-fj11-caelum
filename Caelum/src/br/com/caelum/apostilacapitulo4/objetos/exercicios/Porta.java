package br.com.caelum.apostilacapitulo4.objetos.exercicios;

public class Porta {
    boolean aberta = true;
    String cor = "Branca";
    double dimensaoX = 20.0;
    double dimensaoY = 50.0;
    double dimensaoZ = 100.5;

    void abre(){
        this.aberta = true;
    }

    void fecha(){
        this.aberta = false;
    }

    void pinta(String s){
        this.cor = s;
    }

    boolean estaAberta(){
        return this.aberta;
    }

    @Override
    public String toString() {
        return "Porta{" +
                "aberta=" + aberta +
                ", cor='" + cor + '\'' +
                ", dimensaoX=" + dimensaoX +
                ", dimensaoY=" + dimensaoY +
                ", dimensaoZ=" + dimensaoZ +
                '}';
    }

    public static void main(String[] args) {
        Porta porta = new Porta();
        System.out.println(porta);
        porta.cor = "Rosa";
        porta.fecha();
        porta.dimensaoX = 50.5;
        porta.dimensaoY = 100;
        porta.dimensaoZ = 200;
        System.out.println(porta);
        System.out.println("A porta está aberta? " +porta.estaAberta());
    }

}
