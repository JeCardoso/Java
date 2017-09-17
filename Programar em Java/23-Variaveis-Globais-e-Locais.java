// Programar em Java #23 - Variáveis Globais e Locais

package com.caffeinealgorithm.programaremjava;

public class VariaveisGlobaisELocais {
    String acesso = "Global";

    public void Run() {
        MudarAcesso();
        System.out.println(new StringBuilder().append("Acesso no exterior da função: ").append(acesso));
    }

    public void MudarAcesso() {
        String acesso = "Local";
        System.out.println(new StringBuilder().append("Acesso no interior da função: ").append(acesso));
    }
}