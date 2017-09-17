// Programar em Java #33 - Herança

package com.caffeinealgorithm.programaremjava;

public class Heranca {
    public void Run() {
        Filho pessoa = new Filho();
        pessoa.Informacao();
        pessoa.ComidaPreferida();
    }
}

class Pai {
    protected String ultimoNome = "Silva";

    public void ComidaPreferida() {
        System.out.println("A minha comida preferida é arroz de marisco!");
    }
}

class Filho extends Pai {
    private String primeiroNome = "Nelson";
    private int idade = 21;

    public void Informacao() {
        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome));
        System.out.println(new StringBuilder().append("Idade: ").append(idade));
    }
}