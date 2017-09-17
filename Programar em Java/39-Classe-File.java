// Programar em Java #39 - Classe File

package com.caffeinealgorithm.programaremjava;

import java.io.File;
import java.io.IOException;

public class ClasseFile {
    private File ficheiro = new File("Ficheiro.txt");

    public void Run() {
        /* try {
            ficheiro.createNewFile();
        }
        catch (IOException excecaoIO) {
            System.out.println(excecaoIO);
        } */

        ficheiro.delete();

        // System.out.println(ficheiro.getAbsolutePath());

        if (ficheiro.exists())
            System.out.println("O ficheiro \"Ficheiro.txt\" existe!");
        else
            System.out.println("O ficheiro \"Ficheiro.txt\" não existe!");
    }
}