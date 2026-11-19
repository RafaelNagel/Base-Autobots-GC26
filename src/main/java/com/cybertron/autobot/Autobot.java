
package com.cybertron.autobot;

public class Autobot {

    private String nome;
    private double energon;
    private int nivel;

    public Autobot(String nome, double energon, int nivel) {
        if (nivel < 1 || nivel > 10) {
            throw new IllegalArgumentException(
                    "O nível deve estar entre 1 e 10."
            );
        }

        this.nome = nome;
        this.energon = energon;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public double getEnergon() {
        return energon;
    }

    public int getNivel() {
        return nivel;
    }

    public void reparar(double quantidade) {
        if (energon < 0) {
            throw new IllegalStateException("Energon negativo.");
        }

        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "Quantidade de reparo inválida."
            );
        }

        energon += quantidade;
    }
}
