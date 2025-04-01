public class ExemploForArray {
    public static void main(String[] args) {
        //em arrays o indice Inicia em ZERO

        /* Modelo 1
        String alunos [] = {"FELIPE", "JONAS ", "JULIA", "MARCOS"}; {

        for (int x=0; x < alunos.length; x++) {
            System.out.println ("O Aluno no indice x=" + x + " é " + alunos[x]);
        }*/

        /*Modelo 2 */
        String alunos [] = {"FELIPE", "JONAS ", "JULIA", "MARCOS"}; {

        for(String aluno: alunos){
            System.out.println("Nome do Aluno é: " + aluno);
        }
        }
    }
}