
package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GerenciadorAutobots {

    private final List<Autobot> autobots = new ArrayList<>();

    public void adicionar(Autobot autobot) {
        Objects.requireNonNull(autobot, "Autobot não pode ser nulo.");
        autobots.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;

        for (Autobot autobot : autobots) {
            total += autobot.getEnergon();
        }

        return total;
    }

    public Autobot buscar(String nome) {
        Objects.requireNonNull(nome, "Nome não pode ser nulo.");

        for (Autobot autobot : autobots) {
            if (autobot.getNome().equals(nome)) {
                return autobot;
            }
        }

        return null;
    }

    public void reparar(Autobot autobot) {
        Objects.requireNonNull(autobot, "Autobot não pode ser nulo.");
        autobot.reparar();
    }

    public String classificar(Autobot autobot) {
        Objects.requireNonNull(autobot, "Autobot não pode ser nulo.");

        double energon = autobot.getEnergon();

        if (energon > 500) {
            return "ELITE";
        }

        if (energon > 200) {
            return "PADRAO";
        }

        return "RESERVA";
    }
}
