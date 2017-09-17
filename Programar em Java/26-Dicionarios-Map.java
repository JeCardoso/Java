// Programar em Java #26 - Dicionários (Map)

package com.caffeinealgorithm.programaremjava;

import java.util.HashMap;
import java.util.Map;

public class DicionariosMap {
    public void Run() {
        Map<String, Integer> pessoas = new HashMap<>();
        // Map pessoas = new HashMap();

        pessoas.put("Nelson Silva", 21);
        pessoas.put("Maria Celeste", 37);
        pessoas.put("Pedro Henrique", 52);
        pessoas.put("Raquel Soares", 68);

        pessoas.replace("Pedro Henrique", 100);
        pessoas.remove("Maria Celeste");
        pessoas.clear();

        System.out.println(new StringBuilder().append("Nome das pessoas: ").append(pessoas.keySet()));
        System.out.println(new StringBuilder().append("Idade das pessoas: ").append(pessoas.values()));
    }
}