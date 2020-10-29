package br.com.caelum.apostilacapitulo5.modificadoresdeacesso;

class Teste	{
    //5.9 - Desafios:

    //1.	 Porque	esse	código	não	compila?
    //int x = 37; Porque a variável não estática não pode ser utilizada em um método estático.
    static int	x	=	37;

    public static void main(String[] args) {
        System.out.println(x);
    }

    //2. design patterns chamado Singleton - final: classe objeto que seja instanciada uma única vez
    //e com visibilidade e acesso global
}