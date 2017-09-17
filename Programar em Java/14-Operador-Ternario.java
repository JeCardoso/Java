// Programar em Java #14 - Operador Ternário

package com.caffeinealgorithm.programaremjava;

public class OperadorTernario {
    // (condição) ? condição for verdadeira : condição for falsa;

    public void Run() {
        int idade = 21;
        // boolean eMaiorDeIdade;

        /* if (idade >= 18)
            eMaiorDeIdade = true;
        else
            eMaiorDeIdade = false; */

        // eMaiorDeIdade = (idade >= 18) ? true : false;

        System.out.println(new StringBuilder().append("É maior de idade: ").append(((idade >= 18) ? true : false)));
    }
}