// Programar em Java #07 - Mais sobre as Strings

package com.caffeinealgorithm.programaremjava;

public class MaisSobreAsStrings {
    public void Run() {
        String primeiroNome = "Nelson";
        String ultimoNome = "Silva";
        int idade = 21;

        System.out.println("Nome: " + primeiroNome + ' ' + ultimoNome + "\nIdade: " + idade);
        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome).append("\nIdade: ").append(idade));
    }
}