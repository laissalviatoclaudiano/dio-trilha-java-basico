public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha

        /* Olá,
         * Eu sou um comentário
         * que pode ser mais detalhado
         * quando necessário
         */

    }
    
    /** 
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */

     public void metodo(){

     }

     // As linhas de código abaixo não representam boas práticas da programação


     /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou  multiplicar
    * dois números
    */

     public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
    }

}
