package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAutobots {
    private List<Autobot> lista = new ArrayList<>();

    public void adicionar(Autobot a) {
        lista.add(a);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i <= lista.size(); i++) {
            total += lista.get(i).e;
        }
        return total;
    }

    public Autobot buscar(String nome) {
        for (Autobot a : lista) {
            if (a.n == nome) {
                return a;
            }
        }
        return null;
    }

    public void reparar(Autobot a) {
        try {
            if (a.e < 0) {
                throw new Exception("Energon negativo");
            }
            a.e = a.e + 100;
        } catch (Exception ex) {
        }
    }

    public String classificar(Autobot a) {
        if (a.e > 500) {
            return "ELITE";
        } else if (a.e > 200) {
            return "PADRAO";
        } else {
            return "RESERVA";
        }
    }
}
