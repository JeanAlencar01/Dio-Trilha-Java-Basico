public class Comentarios {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // Olá, eu sou um Comentário em uma única Linha

        /* Olá, 
         * Eu sou um Comentário 
         * que posso ser mais Detalhado 
         * quando Necessário */
        
        /** 
         * Essas duas estrelinhas acima é para indentificar que você pretende elaborar um comentário a nível de documentação. Que Incrivel!!! 
         */

        Comentarios comentarios = new Comentarios();
        int resultado = comentarios.somaMultiplicacao(10, 5, "M");
        System.out.println("Resultado: " + resultado);
    }

    /**
     * Método que realiza soma ou multiplicação de dois números.
     * 
     * @param n Primeiro número
     * @param x Segundo número
     * @param m Operação a ser realizada ("M" para multiplicação, "S" para soma)
     * @return Resultado da operação
     */
    public int somaMultiplicacao(int n, int x, String m) {
        int r = 0; // r é igual ao resultado

        if (m.equalsIgnoreCase("M")) { // M= multiplicação
            r = n * x;
        } else if (m.equalsIgnoreCase("S")) { // se não soma mesmo
            r = n + x;
        }

        return r;
    }
}
