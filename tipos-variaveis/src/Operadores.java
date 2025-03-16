public class Operadores {
    public static void main(String[] args) {
        //String nomeCompleto = "LINGUAGEM" + "JAVA";

        //System.out.println(nomeCompleto);

        //CONCATENAÇÃO//
        /*
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
        */

        //X REPETIÇÃO

        /*
        int numero = 5;

        //numero = numero +2; //incrementando o valor de numero que é 5 + 2

        numero++;

        //numero = numero + 1;
        
        System.out.println(numero++);

        System.out.println(numero); 
        */

        /*
        OPERADOR BOLEANO 

        boolean variavel = true;
    
        System.out.println(!variavel); //! inverte o valor (resultado será FALSE)
    
        System.out.println(variavel);   //(resultado sera TRUE)
        */


        //OPERADOR TERNÁRIO

        /*int a, b;

        a = 6;
        b = 6;
        
        
        String resultado = a==b ?"verdadeiro" : "falso";

        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        

        System.out.println(resultado);
        */
        
        /*OPERADORES RELACIONAIS
        == variavel IGUAL a outra
        != variavel DIFERENTE da outra
        > variavel MAIOR que a outra
        >= variavel MAIOR OU IGUAL a outra
        < variavel MENOR que a outra
        <= variavel MENOR OU IGUAL a outra-

        PARA OBJETOS É UTILIZADO *EQUALS*
        */
        /*
        String nomeUm = "Jean";
        String nomeDois = "Jean";

        System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condiçao é verdadeira");
        }
        else 
            System.out.print("a nossa condição é falsa\n");

        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor que numeroDois?" + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior que numeroDois?" + simNao);
        */

        //OPERADORES LÓGICOS

        /*
        && operador lógico "E"
        || operador lógico "OU" 
         */
    

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
        
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            
            System.out.println("uma das condições é verdadeira");
        }
        else
            System.out.println("uma das condições é falsa");

            System.out.println("FIM!");
    }
}