// Programar em Java #47 - Métodos II

package com.caffeinealgorithm.programaremjava;

import java.util.Scanner;

public class MetodosII {
    private String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum consectetur.";
    private Scanner inputDoUtilizador = new Scanner(System.in);

    public void Run() {
        // indexOf()
        int indice = 0;

        while ((indice = loremIpsum.indexOf('i', indice)) != -1) {
            System.out.println(loremIpsum.substring(indice));
            indice++;
        }

        // trim()
        System.out.print("\nInsere o teu primeiro nome: ");
        String primeiroNome = inputDoUtilizador.nextLine();

        System.out.print("\nInsere o teu último nome: ");
        String ultimoNome = inputDoUtilizador.nextLine();

        System.out.println(new StringBuilder().append("Nome (sem o uso do método trim()): ").append(primeiroNome).append(' ').append(ultimoNome));
        System.out.println(new StringBuilder().append("Nome (com o uso do método trim()): ").append(primeiroNome.trim()).append(' ').append(ultimoNome.trim()));
    }
}