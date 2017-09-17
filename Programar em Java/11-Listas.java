// Programar em Java #11 - Listas

package com.caffeinealgorithm.programaremjava;

import java.util.List;
import java.util.ArrayList;

public class Listas {
    public void Run() {
        List<String> cores = new ArrayList<>();

        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Laranja");

        cores.remove("Laranja");
        cores.clear();

        System.out.println(new StringBuilder().append("Número de cores: ").append(cores.size()));
        // System.out.println(new StringBuilder().append("Primeira cor: ").append(cores.get(0)));
        // System.out.println(new StringBuilder().append("Última cor: ").append(cores.get(cores.size() - 1)));
    }
}