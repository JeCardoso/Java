// Programar em Java #44 - Classe Hashtable

package com.caffeinealgorithm.programaremjava;

import java.util.Hashtable;

public class ClasseHashtable {
    private Hashtable<String, Integer> pessoas = new Hashtable<>();
    // private Hashtable pessoas = new Hashtable();

    public void Run() {
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