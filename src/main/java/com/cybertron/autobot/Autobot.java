
package com.cybertron.autobot;

public class Autobot {

    private String nome;
    private double energon;
    private int nivel;

    public Autobot(String nome, double energon, int nivel) {
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

    public void adicionarEnergon(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException(
                    "A quantidade de energon deve ser positiva."
            );
        }

        this.energon += quantidade;
    }

    public void reparar() {
        if (energon < 0) {
            throw new IllegalStateException(
                    "Não é possível reparar um Autobot com energon negativo."
            );
        }

        adicionarEnergon(100);
    }
}
