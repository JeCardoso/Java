// Programar em Java #43 - Classe Thread

package com.caffeinealgorithm.programaremjava;

public class ClasseThread {
    private Thread tarefa;

    public void Run() {
        tarefa = new Thread(this::ExecutarTarefa);
        tarefa.start();

        for (int indice = 1; indice <= 5; indice++) {
            System.out.println(new StringBuilder().append("Run() #").append(indice));

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException excecao) {
                System.out.println(excecao);
            }
        }

        System.out.println("A tarefa Run() finalizou!");

        try {
            tarefa.join();
        }
        catch (InterruptedException excecao) {
            System.out.println(excecao);
        }

        System.out.println("A tarefa ExecutarTarefa() finalizou!");
    }

    private void ExecutarTarefa() {
        for (int indice = 1; indice <= 10; indice++) {
            System.out.println(new StringBuilder().append("ExecutarTarefa() #").append(indice));

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException excecao) {
                System.out.println(excecao);
            }
        }
    }
}