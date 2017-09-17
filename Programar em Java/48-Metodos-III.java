// Programar em Java #48 - Métodos III

package com.caffeinealgorithm.programaremjava;

public class MetodosIII {
    private String a = "Nelson", b = "Nelson", c = "Silva";
    private String lingProgPreferida = "A minha linguagem preferida já foi o C#!";

    public void Run() {
        // equals()
        System.out.println(new StringBuilder().append("a = b : ").append(a.equals(b)));
        System.out.println(new StringBuilder().append("b = c : ").append(b.equals(c)));

        // replace()
        System.out.println(lingProgPreferida);
        System.out.println(lingProgPreferida.replace("já foi", "é"));
    }
}