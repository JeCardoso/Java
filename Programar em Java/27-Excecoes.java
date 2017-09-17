// Programar em Java #27 - Exceções

package com.caffeinealgorithm.programaremjava;

public class Excecoes {
    public void Run() {
        int[] numeros = new int[] {
                1, 2, 3, 4, 5
        };

        try {
            System.out.println(new StringBuilder().append("Conteúdo do elemento: ").append(numeros[4]));
        }
        catch (Exception exception) {
            // System.out.println("O código presente no try não está a funcionar corretamente!");
            System.out.println(exception);
        }
        finally {
            System.out.println("Eu faço parte do finally e sou executado caso haja ou não alguma exceção!");
        }
    }
}