// Programar em Java #34 - Mais sobre a Herança

package com.caffeinealgorithm.programaremjava;

public class MaisSobreAHeranca {
    public void Run() {
        _Filho pessoa = new _Filho();
        pessoa.Informacao();
        pessoa.ComidaPreferida();
    }
}

class _Pai {
    protected String ultimoNome = "Silva";

    public void ComidaPreferida() {
        System.out.println("A minha comida preferida é arroz de marisco!");
    }
}

class _Filho extends _Pai {
    private String primeiroNome = "Nelson";
    private int idade = 21;

    public void Informacao() {
        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome));
        System.out.println(new StringBuilder().append("Idade: ").append(idade));
    }

    @Override
    public void ComidaPreferida() {
        System.out.println("A minha comida preferida é lasanha!");
    }
}