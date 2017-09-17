// Programar em Java #45 - Classe Stack

package com.caffeinealgorithm.programaremjava;

import java.util.Stack;

public class ClasseStack {
    private Stack<Integer> pilha = new Stack<Integer>();
    private int multiplicador = 10, numero = 1;

    public void Run() {
        for (int indice = 1; indice <= 5; indice++) {
            pilha.push(numero);
            numero *= multiplicador;
        }

        ImprimirPilha();
        System.out.println(new StringBuilder().append("\nA remover o número ").append(pilha.pop()).append(" da pilha com o método pop()!\n"));

        ImprimirPilha();
        System.out.println(new StringBuilder().append("\nO número que se encontra na parte superior da pilha é o ").append(pilha.peek()).append('!'));
    }

    private void ImprimirPilha() {
        for (int numero : pilha)
            System.out.println(numero);
    }
}