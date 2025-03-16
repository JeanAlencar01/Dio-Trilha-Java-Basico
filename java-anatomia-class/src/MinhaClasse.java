public class MinhaClasse {
    
/**
 * @param args
 */
public static void main (String [] args) {
    //System.out.print ("Olá, Mundo!");

    //EXEMPLOS DE VARIAVEIS FINAL//
    
    //final String BR = "Brasil";     //aqui estou declarando que a variavel não pode variar, 
                                    //ela sempre tera o valor de "Brasil" com S
    //BR = "Brazil";           //essa variavel não funciona pois já declarei uma variavel Final de BR 

    //double PI = "3.14";          //PI é um número fixo, ele nao muda
    //int ESTADOS_BRASILEIROS = "27";  //a quantidade de estados não muda
    //int ANO_2000 = "2000";       //aqui estou especificando que é ano2000 então nao pode variar


    //int ano = "2025";       //nesse caso a variavel pode variar
        //ano = "2026";       //pois nao declarei como Final


    //DECLARAÇÕES ERRADAS DE VARIAVEIS//

    //int numero&1 = "1";       // únicos caracteres permitidos são _ e $
    //int 1numero = "1";        // uma variavel não pode começar com um número
    //int numero um = "1";      //não pode haver ESPAÇO nas variaveis
    //int long = "1";           // long faz parte das palavras reservadas da linguagem

    //DECLARAÇÕES VALIDAS PARA VARIAVEIS//

    //int numero$um = "1";
    //int numero1 = "1";
    //int numeroum = "1";
    //int longo = "1"

    //ESTRUTURA//

    //String meuNome = "Jean";

    //int anoFabricacao = 2025;

    //boolean Verdadeira = False;
    
    //TipoRetorno nomeObetivoNoInfinitivo parametro(S)

    //Exemplos

    //int somar (int numeroUm, int numero2)

    //spring formatarCep = long cep


            String primeiroNome = "Jean";
            String segundoNome = "Alencar";
    
            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
            System.out.println(nomeCompleto);
        }
    
        public static String nomeCompleto(String primeiroNome, String segundoNome) {
            return primeiroNome.concat(" ").concat(segundoNome);
        }

}
