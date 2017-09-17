// Programar em Java #22 - Argumentos

package com.caffeinealgorithm.programaremjava;

public class Argumentos {
    public void Run() {
        DadosPessoais("Maria Celeste", 37, "Inglesa");
    }

    public void DadosPessoais(String nome, int idade, String nacionalidade) {
        System.out.println(new StringBuilder().append("Nome: ").append(nome));
        System.out.println(new StringBuilder().append("Idade: ").append(idade));
        System.out.println(new StringBuilder().append("Nacionalidade: ").append(nacionalidade));
    }
}