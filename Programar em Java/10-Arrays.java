// Programar em Java #10 - Arrays

package com.caffeinealgorithm.programaremjava;

public class Arrays {
    public void Run() {
        /* String[] cores = new String[5];

        cores[0] = "Azul";
        cores[1] = "Verde";
        cores[2] = "Amarelo";
        cores[3] = "Vermelho";
        cores[4] = "Laranja"; */

        String[] cores = new String[] {
                "Azul",
                "Verde",
                "Amarelo",
                "Vermelho",
                "Laranja"
        };

        System.out.println(new StringBuilder().append("Número de cores: ").append(cores.length));
        System.out.println(new StringBuilder().append("Primeira cor: ").append(cores[0]));
        System.out.println(new StringBuilder().append("Última cor: ").append(cores[cores.length - 1]));
    }
}