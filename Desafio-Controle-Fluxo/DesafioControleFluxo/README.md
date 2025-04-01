# Desafio de Controle de Fluxo

Este repositório contém a solução para o desafio de Controle de Fluxo, onde implementamos um contador que recebe dois números inteiros como entrada e imprime uma contagem entre eles. Caso o primeiro número seja maior que o segundo, uma exceção personalizada é lançada.

## 📌 Funcionalidades
- Recebe dois números inteiros via terminal.
- Verifica se o primeiro número é maior que o segundo e lança uma exceção customizada.
- Exibe uma contagem progressiva dos números no console.

## 🚀 Tecnologias Utilizadas
- Java
- Tratamento de Exceções
- Estruturas de Controle de Fluxo (if, for)
- Scanner para entrada de dados

## 📂 Estrutura do Projeto
```
DesafioControleFluxo/
│-- src/
│   ├── Contador.java
│   ├── ParametrosInvalidosException.java
│-- README.md
```

## 🛠 Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/JeanAlencar01/Dio-Trilha-Java-Basico/tree/main/Desafio-Controle-Fluxo
   ```
2. Acesse o diretório do projeto:
   ```bash
   cd DesafioControleFluxo
   ```
3. Compile o código:
   ```bash
   javac src/*.java
   ```
4. Execute o programa:
   ```bash
   java src.Contador
   ```
5. Digite os dois números inteiros quando solicitado.

## 📜 Exemplo de Uso
```
Digite o primeiro parâmetro:
5
Digite o segundo parâmetro:
10

Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
```
Caso o primeiro parâmetro seja maior que o segundo, a seguinte mensagem é exibida:
```
O segundo parâmetro deve ser maior que o primeiro
```

## 📌 Autor
Desenvolvido por [Jean Alencar](https://github.com/JeanAlencar01).

