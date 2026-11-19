
package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GerenciadorAutobots {

    private static final double ENERGON_REPARO = 100.0;
    private static final double LIMITE_ELITE = 500.0;
    private static final double LIMITE_PADRAO = 200.0;

    private final List<Autobot> listaAutobots = new ArrayList<>();

    public void adicionar(Autobot autobot) {
        Objects.requireNonNull(autobot, "Autobot não pode ser nulo.");
        listaAutobots.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;

        for (Autobot autobot : listaAutobots) {
            total += autobot.getEnergon();
        }

        return total;
    }

    public Autobot buscar(String nome) {
        Objects.requireNonNull(nome, "Nome não pode ser nulo.");

        for (Autobot autobot : listaAutobots) {
            if (nome.equals(autobot.getNome())) {
                return autobot;
            }
        }

        return null;
    }

    public void reparar(Autobot autobot) {
        Objects.requireNonNull(autobot, "Autobot não pode ser nulo.");
        autobot.reparar(ENERGON_REPARO);
    }

    public Classificacao classificar(Autobot autobot) {
        Objects.requireNonNull(autobot, "Autobot não pode ser nulo.");

        double energon = autobot.getEnergon();

        if (energon > LIMITE_ELITE) {
            return Classificacao.ELITE;
        }

        if (energon > LIMITE_PADRAO) {
            return Classificacao.PADRAO;
        }

        return Classificacao.RESERVA;
    }

    public List<Autobot> listarAutobotsIndisponiveis() {
        List<Autobot> indisponiveis = new ArrayList<>();

        for (Autobot autobot : listaAutobots) {
            if (autobot.getEnergon() <= 0) {
                indisponiveis.add(autobot);
            }
        }

        return indisponiveis;
    }
}
