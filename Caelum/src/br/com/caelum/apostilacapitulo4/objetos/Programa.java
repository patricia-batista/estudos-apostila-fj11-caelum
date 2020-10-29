package br.com.caelum.apostilacapitulo4.objetos;

public class Programa {
    public static void main(String[] args) {
        new Conta();//construindo um objeto (como acessá-lo se não está sendo referenciado?)

        Conta conta;//criando uma variável do "tipo Conta" (objeto)

        conta = new Conta();//"conta" está referenciando o objeto "Conta" pelo construtor / construindo as informações
        //por ser do tipo "Conta", é possível acessar todos os dados atribuídas a Classe "Conta"

        //alterando os valores da "conta"
        conta.titular1 = "Duke";//alterando o atributo "titular" que estava como default null
        conta.saldo = 1000.00; //alterando o atribuito saldo que estava por default como 0
        //variáveis primitivas são iniciadas como: 0 ou false (boolean)
        //variáveis de referência são iniciadas como: null
        System.out.println(conta);

        conta.saca(200);

        conta.deposita(500);

        System.out.println(conta);

        System.out.println("Consegui sacar? " + conta.saca(2000));
        //O programa pode manter na memória mais de 1 única conta
        Conta meuSonho = new Conta();
        meuSonho.numero = 1;
        meuSonho.titular1 = "Patrícia";
        meuSonho.saldo = 15000.00;

        System.out.println(meuSonho);

        //Objetos são acessados por referência!
        //No caso, se é uma maneira de guarda o endereço de memória que estará instanciado o objeto específico
        //Por esse motivo, diferente dos tipos primitivos como int e double, é necessário colocar "new"
        //depois de declarar a variável

        Conta c1 = new Conta(); //c1 se refere a um objeto, não que ele seja um objeto
        //uma variável nunca é um objeto -> o guardar um número	que	identifica em que posição da memória aquela
        //Conta se encontra.
        Conta c2 = c1; //agora c2 e c1 contém o mesmo endereço de um mesmo objeto. O que isso significa?
        //Que alterar tanto c1 como c2, ambos irão ser modifcados.

        //Daqui alteramos o tipo "String" do "titular" para o tipo "Cliente"
        Conta minhaConta = new Conta();
//        minhaConta.titular = new Cliente();
//        minhaConta.titular.nome = "Duke";
//        minhaConta.titular.nome = "Cristiano"; //Erro de NullPointerException -> Por quê?
//        Porque está nulo esse cliente
//        Outro ponto... Por que não criar um construtor já pronto assim que cria uma conta?
//        Daqui alteramos a Classe "Conta" com um "new Cliente" na variável "titular"
        conta.titular.nome = "Duke";
        meuSonho.titular.nome = "Patrícia";
        conta.transferePara(meuSonho, 1400);
        System.out.println(conta);
        System.out.println(meuSonho);
        meuSonho.dataAbertura = new Data(28, 06, 2020);
        System.out.println(meuSonho);
    }

}
