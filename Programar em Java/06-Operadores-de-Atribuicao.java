// Programar em Java #06 - Operadores de Atribuição

package com.caffeinealgorithm.programaremjava;

public class OperadoresDeAtribuicao {
    public void Run() {
        int x = 2;

        System.out.println("x = x + 3: " + (x += 3));
        System.out.println("x = x - 2: " + (x -= 2));
        System.out.println("x = x * 2: " + (x *= 2));
        System.out.println("x = x / 2: " + (x /= 2));
        System.out.println("x = x % 3: " + (x %= 3));
    }
}