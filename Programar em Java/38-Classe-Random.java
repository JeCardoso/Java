// Programar em Java #38 - Classe Random

package com.caffeinealgorithm.programaremjava;

import java.util.Random;

public class ClasseRandom {
    private Random aleatorio = new Random();

    public void Run() {
        System.out.println(new StringBuilder().append("Número aleatório até 20: ").append(aleatorio.nextInt(21)));
        System.out.println(new StringBuilder().append("Número aleatório (double): ").append(aleatorio.nextDouble()));

        for (int indice = 1; indice <= 10; indice++)
            System.out.println(new StringBuilder().append("Número aleatório #").append(indice).append(": ").append(aleatorio.nextInt()));
    }
}