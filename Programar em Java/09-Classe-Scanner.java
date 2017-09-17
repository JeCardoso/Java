// Programar em Java #09 - Classe Scanner

package com.caffeinealgorithm.programaremjava;

import java.util.Scanner;

public class ClasseScanner {
    public void Run() {
        Scanner inputDoUtilizador = new Scanner(System.in);
        String primeiroNome, ultimoNome;
        int idade;

        System.out.print("Insere o teu primeiro nome: ");
        primeiroNome = inputDoUtilizador.nextLine();

        System.out.print("Insere o teu último nome: ");
        ultimoNome = inputDoUtilizador.nextLine();

        System.out.print("Insere a tua idade: ");
        idade = inputDoUtilizador.nextInt();

        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome).append("\nIdade: ").append(idade));
    }
}