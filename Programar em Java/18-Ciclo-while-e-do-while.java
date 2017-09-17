// Programar em Java #18 - Ciclo while e do while

package com.caffeinealgorithm.programaremjava;

public class CicloWhileEDoWhile {
    public void Run() {
        int contador = 1;

        while (contador <= 10) {
            System.out.println(new StringBuilder().append("[while] Contador: ").append(contador));
            contador++; // contador = contador + 1
        }

        contador = 1;

        do {
            System.out.println(new StringBuilder().append("[do while] Contador: ").append(contador));
            contador++;
        } while (contador <= 10);
    }
}