// Programar em Java #50 - Operadores Bit a Bit

package com.caffeinealgorithm.programaremjava;

public class OperadoresBitABit {
    private int x = 60; // 00111100 < 01111000 < 11110000 | 00111100 > 00011110 > 00001111
    private int y = 13; // 00001101

    public void Run() {
        // 12 -> 00001100
        System.out.println(new StringBuilder().append("Resultado do operador &: ").append(x & y));

        // 61 -> 00111101
        System.out.println(new StringBuilder().append("Resultado do operador |: ").append(x | y));

        // 240 -> 11110000
        System.out.println(new StringBuilder().append("Resultado do operador <<: ").append(x << 2));

        // 15 -> 00001111
        System.out.println(new StringBuilder().append("Resultado do operador >>: ").append(x >> 2));
    }
}