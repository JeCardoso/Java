// Programar em Java #28 - Classes e Objetos

package com.caffeinealgorithm.programaremjava;

public class ClassesEObjetos {
    int vidas = 5;

    public void Ataque() {
        System.out.println("Eu fui atacado e perdi uma vida!");
        vidas -= 1; // vidas = vidas - 1
    }

    public void VerificarVida() {
        if (vidas <= 0)
            System.out.println("Eu estou morto porque não tenho mais vidas!");
        else
            System.out.println(new StringBuilder().append("Eu ainda estou em combate e tenho ").append(vidas).append(" vidas!"));
    }
}