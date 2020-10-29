package br.com.caelum.apostilacapitulo5.modificadoresdeacesso;

public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double limite;
    private static int totalDeContas;
    private static int identificador = 1;
    private Data data;

    public Conta(){
        System.out.println("Construindo uma conta.");
        this.totalDeContas++;
        this.identificador++;
    }

    public Conta(int numero, String titular){
        this(); //Chamando um construtor dentro de outro construtor
        this.numero = numero;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public String getTitular() {
        return titular;
    }

    public static int getIdentificador() {
        return identificador;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public double getSaldo() {//Nunca criar getters e setters assim que se criar uma classe:
        return saldo + (this.limite = this.saldo * 0.5); //porque nem sempre você utiliza (como o exemplo do "limite", não necessita.
    } // Crie somente se for preciso.

    //getSaldo e pegaSaldo são exatamente iguais - é uma convenção utilizar os nomes "setNomeDoAtributo" e
    //"getNomeDoAtributo". Servem para identificar os métodos getters & setters.
    public double pegaSaldo() { return this.saldo; }

    void saca(double valor){
        if (valor > this.saldo) System.out.println("Não é possível sacar valor maior que saldo.");
        else this.saldo -= valor;
    }

    public void deposita(double valor){ this.saldo += valor;}

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                ", limite=" + limite +
                ", identificador=" + identificador +
                ", data=" + data +
                '}';
    }
}
