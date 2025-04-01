import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                 valorDoce = mesada;

            System.out.println("Valor do Doce" + valorDoce + "Adicionando no carrinho");
            mesada = mesada - valorDoce;
        }
    System.out.println("Mesada: " + mesada);
    System.out.println("Joaozinho gastou toda a sua mesada em Doces");


    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
