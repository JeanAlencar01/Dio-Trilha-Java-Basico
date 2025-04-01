# Processo Seletivo - Simulação de Recrutamento

Este projeto em Java simula um processo seletivo automatizado, onde candidatos são avaliados com base no salário pretendido e um contato é realizado com os selecionados.

## Funcionalidades
- **Seleção de Candidatos**: Apenas candidatos que solicitam um salário menor ou igual ao definido são aprovados.
- **Contato com Candidatos**: O sistema tenta ligar até 3 vezes para cada candidato selecionado.
- **Geração Aleatória de Salário**: Cada candidato recebe um salário pretendido entre R$1800,00 e R$2200,00.

## Como Funciona
1. O sistema gera uma lista de candidatos.
2. Para cada candidato, é definido um salário pretendido aleatório.
3. Candidatos com um salário pretendido dentro do orçamento são selecionados.
4. O sistema tenta entrar em contato com os candidatos selecionados até 3 vezes.
5. Exibe no console o resultado das tentativas de contato.

## Estrutura do Código
- `main()`: Inicia o processo de seleção e contato com candidatos.
- `selecaoCandidatos()`: Seleciona até 5 candidatos com base no salário pretendido.
- `entrandoEmContato()`: Tenta ligar para os candidatos aprovados.
- `atender()`: Simula se um candidato atende ou não a ligação.
- `valorPretendido()`: Gera um salário pretendido aleatório.
- `analisarCandidato()`: Define a ação a ser tomada com base no salário pretendido.

## Tecnologias Utilizadas
- **Linguagem**: Java
- **Bibliotecas**: `java.util.Random`, `java.util.concurrent.ThreadLocalRandom`, `java.text.DecimalFormat`

## Como Executar
1. Clone este repositório:
   ```bash
   git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/JeanAlencar01/Dio-Trilha-Java-Basico/blob/main/Controle-Candidatos/Processo-Seletivo/src/Candidatura/ProcessoSeletivo.java)
   ```
2. Compile o código:
   ```bash
   javac ProcessoSeletivo.java
   ```
3. Execute o programa:
   ```bash
   java Candidatura.ProcessoSeletivo
   ```

## Melhorias Futuras
- Implementação de interface gráfica.
- Salvamento de candidatos selecionados em um banco de dados.
- Possibilidade de definir o número de tentativas de contato dinamicamente.

---
Desenvolvido por [Jean Alencar]

