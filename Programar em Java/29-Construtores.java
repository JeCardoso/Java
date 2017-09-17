// Programar em Java #29 - Construtores

package com.caffeinealgorithm.programaremjava;

public class Construtores {
    String primeiroNome = null, ultimoNome = null;
    int idade = 0;

    public Construtores(String primeiroNome, String ultimoNome, int idade) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.idade = idade;
    }

    public void Informacao() {
        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome));
        System.out.println(new StringBuilder().append("Idade: ").append(idade));
    }

    public void VerificarEntrada() {
        if (idade >= 18)
            System.out.println("Esta pessoa pode entrar no local porque tem mais de 18 anos!");
        else
            System.out.println("Esta pessoa não pode entrar no local porque tem menos de 18 anos!");
    }
}