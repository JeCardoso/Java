// Programar em Java #35 - Interfaces

package com.caffeinealgorithm.programaremjava;

public class Interfaces {
    public void Run() {
        Carro carro = new Carro("Nissan", "Juke", "Dianteira", "Manual", "Gasóleo", 1461, 175, 110, 25070);
        carro.Informacao();
    }
}

class Carro implements ICarro {
    private String marca, modelo, localizacaoDoMotor, transmissao, combustivel;
    private int cilindrada, velocidadeMaxima, potenciaMaxima;
    private double preco;

    public Carro(String marca, String modelo, String localizacaoDoMotor, String transmissao, String combustivel,
                 int cilindrada, int velocidadeMaxima, int potenciaMaxima, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.localizacaoDoMotor = localizacaoDoMotor;
        this.transmissao = transmissao;
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
        this.velocidadeMaxima = velocidadeMaxima;
        this.potenciaMaxima = potenciaMaxima;
        this.preco = preco;
    }

    public void Informacao() {
        System.out.println(new StringBuilder().append("Marca: ").append(marca));
        System.out.println(new StringBuilder().append("Modelo: ").append(modelo));
        System.out.println(new StringBuilder().append("Localização do motor: ").append(localizacaoDoMotor));
        System.out.println(new StringBuilder().append("Transmissão: ").append(transmissao));
        System.out.println(new StringBuilder().append("Combustível: ").append(combustivel));
        System.out.println(new StringBuilder().append("Cilindrada: ").append(cilindrada).append(" cc"));
        System.out.println(new StringBuilder().append("Velocidade máxima: ").append(velocidadeMaxima).append(" km/h"));
        System.out.println(new StringBuilder().append("Potência máxima: ").append(potenciaMaxima).append(" cv"));
        System.out.println(new StringBuilder().append("Preço: ").append(preco).append(" euros"));
    }
}

interface ICarro {
    void Informacao();
}