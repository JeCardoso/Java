// Programar em Java #36 - abstract

package com.caffeinealgorithm.programaremjava;

import java.util.ArrayList;
import java.util.List;

public class Abstract {
    public void Run() {
        // ClasseX.InformacaoX();
        ClasseY classe = new ClasseY();
        classe.InformacaoY();
    }
}

abstract class ClasseX {
    public static String organizacao = "Caffeine Algorithm";
    public static List<String> paises = new ArrayList<>();

    public static void InformacaoX() {
        for (char carater : organizacao.toCharArray())
            System.out.println(new StringBuilder().append("Carater: ").append(carater));
    }

    public abstract void InformacaoY();
}

class ClasseY extends ClasseX {
    public void InformacaoY() {
        paises.add("Portugal");
        paises.add("Brasil");
        paises.add("Espanha");
        paises.add("França");
        paises.add("Itália");
        paises.add("Austrália");
        paises.add("Índia");

        for (String pais : paises)
            System.out.println(new StringBuilder().append("País: ").append(pais));
    }
}