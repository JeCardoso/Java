// Programar em Java #15 - Switch

package com.caffeinealgorithm.programaremjava;

public class Switch {
    public void Run() {
        char caso = 'D';

        switch (caso) {
            case 'A':
                System.out.println("O caso A existe!");
                break;
            case 'B':
                System.out.println("O caso B existe!");
                break;
            case 'C':
                System.out.println("O caso C existe!");
                break;
            default:
                System.out.println(new StringBuilder().append("O caso ").append(caso).append(" não existe!"));
                break;
        }
    }
}