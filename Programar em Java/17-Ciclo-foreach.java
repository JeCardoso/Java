// Programar em Java #17 - Ciclo "foreach"

package com.caffeinealgorithm.programaremjava;

import java.util.List;
import java.util.ArrayList;

public class CicloForeach {
    public void Run() {
        List<String> paises = new ArrayList<>();

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