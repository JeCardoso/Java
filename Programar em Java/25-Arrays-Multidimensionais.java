// Programar em Java #25 - Arrays Multidimensionais

package com.caffeinealgorithm.programaremjava;

public class ArraysMultidimensionais {
    public void Run() {
        // [número de linhas][número de colunas]
        int[][] arrayMultidimensional = new int[][] {
                { 1, 2, 3, 4 },
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 }
        };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(new StringBuilder().append(arrayMultidimensional[i][j]).append('\t'));

            System.out.println();
        }
    }
}