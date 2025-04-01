package Candidatura;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    // Definindo o salário base como uma constante
    private static final double SALARIO_BASE = 2000.0;

    // Array para armazenar os candidatos selecionados
    private static String[] candidatosSelecionadosLista = new String[5];

    public static void main(String[] args) {
        // Iniciando o processo de seleção de candidatos
        selecaoCandidatos();

        // Verificando se há candidatos selecionados antes de tentar contato
        if (candidatosSelecionadosLista[0] != null) {
            for (String candidato : candidatosSelecionadosLista) {
                if (candidato != null) { // Verifica se o índice contém um candidato válido
                    entrandoEmContato(candidato);
                }
            }
        } else {
            System.out.println("Nenhum candidato foi selecionado.");
        }
    }

    /**
     * Método responsável por tentar entrar em contato com um candidato até 3 vezes.
     * Se ele atender, exibe uma mensagem de sucesso; caso contrário, informa que o limite foi atingido.
     */
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender(); // Simula a tentativa de contato
            continuarTentando = !atendeu;

            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + "ª TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS REALIZADO: " + tentativasRealizadas);
        }
    }

    /**
     * Método auxiliar que simula se um candidato atende ou não o telefone.
     * Retorna `true` se atendeu, e `false` caso contrário.
     */
    static boolean atender() {
        return new Random().nextInt(3) == 1; // 33% de chance de atender
    }

    /**
     * Método responsável por selecionar os candidatos que pedem um salário dentro do orçamento.
     */
    static void selecaoCandidatos() {
        // Lista de candidatos disponíveis para o processo seletivo
        String[] candidatos = {
            "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO",
            "MONICA", "FABRICIO", "MIRÉLA", "DANIELA", "JONATHAN",
            "LUCAS", "ANDERSON", "JUNIOR", "JEFERSON", "RAFAEL",
            "JUAN", "TIAGO"
        };

        int candidatosSelecionados = 0; // Contador de candidatos selecionados
        int candidatosAtual = 0; // Índice do candidato atual na lista
        DecimalFormat df = new DecimalFormat("#,##0.00"); // Formatação de salário

        // Seleciona até 5 candidatos
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual]; // Nome do candidato atual
            double salarioPretendido = valorPretendido(); // Gera um salário aleatório

            System.out.println("O candidato " + candidato + " solicitou este valor de salário R$ " + df.format(salarioPretendido));

            if (SALARIO_BASE >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionadosLista[candidatosSelecionados] = candidato;
                candidatosSelecionados++;
            }

            candidatosAtual++; // Passa para o próximo candidato na lista
        }

        // Exibe a lista de candidatos selecionados
        System.out.println("\nLista de candidatos selecionados:");
        for (int i = 0; i < candidatosSelecionados; i++) {
            System.out.println("O candidato de nº " + (i + 1) + " é o " + candidatosSelecionadosLista[i]);
        }
    }

    /**
     * Método responsável por gerar um salário pretendido aleatório entre 1800 e 2200.
     *
     * @return o salário pretendido gerado aleatoriamente
     */
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    /**
     * Método que analisa se um candidato deve ser chamado com base no salário pretendido.
     *
     * @param salarioPretendido Salário que o candidato deseja receber.
     */
    static void analisarCandidato(double salarioPretendido) {
        if (SALARIO_BASE > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (SALARIO_BASE == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
