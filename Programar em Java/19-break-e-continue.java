// Programar em Java #19 - break e continue

package com.caffeinealgorithm.programaremjava;

import java.util.List;
import java.util.ArrayList;

public class BreakEContinue {
    public void Run() {
        int contador = 0;
        List<String> animais = new ArrayList<>();

        animais.add("Cão");
        animais.add("Gato");
        animais.add("Galinha");
        animais.add("Coelho");
        animais.add("Leão");

        for (String animal : animais) {
            System.out.println(new StringBuilder().append("Animal: ").append(animal));

            if (animal == "Galinha")
                break;
        }

        while (contador < 10) {
            contador++;

            if (contador == 5)
                continue;

            System.out.println(new StringBuilder().append("Contador: ").append(contador));
        }
    }
}