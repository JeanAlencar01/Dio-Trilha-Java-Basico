public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            if (numero == 3) 
                break;  //tente trocar break por continue para ver o que acontece
                System.out.println(numero);        
        }
    }
}
