// Programar em Java #24 - Erros Comuns

package com.caffeinealgorithm.programaremjava;

import java.util.Scanner;

public class ErrosComuns {
    public void Run() {
        // Erro de compilação
        System.out.println("Eu sou uma string!");

        // Erro de tempo de execução
        int x = 10, y = 0;
        // System.out.println(new StringBuilder().append("Resultado da divisão: ").append(x / y));

        // Erro de lógica
        Scanner inputDoUtilizador = new Scanner(System.in);
        String primeiroNome = null, ultimoNome = null;

        System.out.print("Insere o teu último nome: ");
        ultimoNome = inputDoUtilizador.nextLine();

        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome));
    }
}