package br.com.caelum.apostilacapitulo4.objetos.exercicios;

public class Casa {
    String cor;
    Porta porta1 = new Porta();
    Porta porta2 = new Porta();
    Porta porta3;

    void pinta(String cor){
        this.cor = cor;
    }

    void quantasPortasAbertas(){
        int soma = 0;
        if (porta1.estaAberta()) soma++;
        if (porta2.estaAberta()) soma++;
        if (porta3.estaAberta()) soma++;
        System.out.println(soma);
    }

    public static void main(String[] args) {
        Casa casa = new Casa();
        //Porta já criada no momento da criação da casa
        casa.porta1.aberta = false;
        //Porta não criada no momento da criação da casa
        casa.porta3 = new Porta();
        casa.porta3.aberta = false;
        casa.quantasPortasAbertas();
    }

}
