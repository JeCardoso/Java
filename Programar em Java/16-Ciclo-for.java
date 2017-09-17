// Programar em Java #16 - Ciclo for

package com.caffeinealgorithm.programaremjava;

public class CicloFor {
    public void Run() {
        String[] materialEscolar = new String[] {
                "Mochila",  // 0
                "Estojo",   // 1
                "Lápis",    // 2
                "Borracha", // 3
                "Afia",     // 4
                "Tesoura"   // 5
        };

        /* System.out.println(materialEscolar[0]);
        System.out.println(materialEscolar[1]); */

        for (int indice = 0; indice < materialEscolar.length; indice++)
            System.out.println(new StringBuilder().append("materialEscolar[").append(indice).append("]: ").append(materialEscolar[indice]));
    }
}