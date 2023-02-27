public class Operadores {
    public static void main(String[] args) throws Exception {

        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);
        
        concatenacao = "1"+(1+1+1);
        
        System.out.println(concatenacao);


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de número dois? " + simNao);

        boolean condicao1=true;
        boolean condicao2=false;

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
    }
}
