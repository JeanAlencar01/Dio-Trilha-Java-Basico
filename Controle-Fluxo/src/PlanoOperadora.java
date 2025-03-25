public class PlanoOperadora {
    public static void main(String[] args) {
/*Cenário 1
        String plano = "M"; //M / T

        if("B".equals(plano)) {
            System.out.println("100 minutos de ligacao");
        }
        else if("M".equals(plano)) {
            System.out.println("100 minutos de ligacao");
            System.out.println("Whats e Instagram Grátis");
        }
        else if("T".equals(plano)) {
            System.out.println("100 minutos de ligacao");
            System.out.println("Whats e Instagram Grátis");
            System.out.println("5Gb Youtube");
        }
*/
        String plano = "T"; //M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram Grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligacao");
            }
        }

    }
}
