// Programar em Java #49 - Lambda

package com.caffeinealgorithm.programaremjava;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    private List<String> pessoas = new ArrayList();

    public void Run() {
        pessoas.add("Nelson Silva");
        pessoas.add("Maria Celeste");
        pessoas.add("Pedro Henrique");
        pessoas.add("Raquel Soares");

        // ListarPessoas();

        pessoas.forEach((pessoa) -> System.out.println(new StringBuilder().append("Nome: ").append(pessoa)));
    }

    private void ListarPessoas() {
        for (String pessoa : pessoas)
            System.out.println(new StringBuilder().append("Nome: ").append(pessoa));
    }
}