// Programar em Java #21 - return

package com.caffeinealgorithm.programaremjava;

public class Return {
    public void Run() {
        System.out.println(new StringBuilder().append("Resultado da adição: ").append(Adicao()));
    }

    public int Adicao() {
        int resultado = 0;

        for (int valor = 1; valor <= 10; valor++)
            resultado += valor;

        return resultado;
    }
}