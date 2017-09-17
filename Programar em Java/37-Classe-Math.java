// Programar em Java #37 - Classe Math

package com.caffeinealgorithm.programaremjava;

public class ClasseMath {
    public void Run() {
        System.out.println(new StringBuilder("Resultado do método sin(): ").append(Math.sin(10.5)));
        System.out.println(new StringBuilder("Resultado do método cos(): ").append(Math.cos(10.5)));
        System.out.println(new StringBuilder("Resultado do método tan(): ").append(Math.tan(10.5)));
        System.out.println(new StringBuilder("Resultado do método floor(): ").append(Math.floor(10.5)));
        System.out.println(new StringBuilder("Resultado do método ceil(): ").append(Math.ceil(10.5)));
        System.out.println(new StringBuilder("Resultado do método abs(): ").append(Math.abs(-10.5)));
        System.out.println(new StringBuilder("Resultado do método sqrt(): ").append(Math.sqrt(10.5)));
        System.out.println(new StringBuilder("Resultado do método pow(): ").append(Math.pow(2, 5))); // 2 * 2 * 2 * 2 * 2
    }
}