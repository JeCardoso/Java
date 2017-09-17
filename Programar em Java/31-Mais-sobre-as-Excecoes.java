// Programar em Java #31 - Mais sobre as Exceções

package com.caffeinealgorithm.programaremjava;

public class MaisSobreAsExcecoes {
    private Exception nomeVazio = new Exception("Não se pode verificar um nome que esteja vazio!");

    public void Run() {
        try {
            VerificarNome("");
        } catch (Exception excecao) {
            System.out.println(excecao);
        }
    }

    private void VerificarNome(String nome) throws Exception {
        if (nome == "")
            throw nomeVazio;
        else
            System.out.println(new StringBuilder().append("Nome: ").append(nome));
    }
}