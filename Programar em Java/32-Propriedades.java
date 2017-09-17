// Programar em Java #32 - Propriedades

package com.caffeinealgorithm.programaremjava;

public class Propriedades {
    private String primeiroNome = "", ultimoNome = "";
    private int idade = 21;

    public void setPrimeiroNome(String primeiroNome) {
        if (primeiroNome != "")
            this.primeiroNome = primeiroNome;
        else
            System.out.println("A string referente ao primeiro nome não pode estar vazia!");
    }

    public void setUltimoNome(String ultimoNome) {
        if (ultimoNome != "")
            this.ultimoNome = ultimoNome;
        else
            System.out.println("A string referente ao último nome não pode estar vazia!");
    }

    public int getIdade() {
        return idade;
    }

    public void Informacao() {
        System.out.println(new StringBuilder().append("Nome: ").append(primeiroNome).append(' ').append(ultimoNome));
        System.out.println(new StringBuilder().append("Idade: ").append(getIdade()));
    }
}