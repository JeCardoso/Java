// Programar em Java #46 - Métodos I

package com.caffeinealgorithm.programaremjava;

public class MetodosI {
    private String umDoisTres = "UmDoisTrês", nome = "Nelson Gomes da Silva";

    public void Run() {
        // substring()
        System.out.println(new StringBuilder().append("Intervalo 1: ").append(umDoisTres.substring(0, 2)));
        System.out.println(new StringBuilder().append("Intervalo 2: ").append(umDoisTres.substring(2, 6)));
        System.out.println(new StringBuilder().append("Intervalo 3: ").append(umDoisTres.substring(6)));

        // split()
        String[] palavras = nome.split(" ");

        for (String palavra : palavras)
            System.out.println(new StringBuilder().append("Palavra: ").append(palavra));

        String[] _palavras = nome.split(" Gomes da ");
        System.out.println(new StringBuilder().append("Nome: ").append(_palavras[0]).append(' ').append(_palavras[1]));
    }
}