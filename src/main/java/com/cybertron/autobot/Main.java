package com.cybertron.autobot;

public class Main {

    public static void main(String[] args) {

        GerenciadorAutobots gerenciador = new GerenciadorAutobots();

        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
        Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
        Autobot ratchet = new Autobot("Ratchet", 180.0, 7);
        Autobot jazz = new Autobot("Jazz", 0.0, 4);

        gerenciador.adicionar(optimus);
        gerenciador.adicionar(bumblebee);
        gerenciador.adicionar(ratchet);
        gerenciador.adicionar(jazz);

        System.out.println(
                "Energon total: " + gerenciador.calcularEnergonTotal()
        );

        Autobot encontrado = gerenciador.buscar("Bumblebee");

        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNome());
        } else {
            System.out.println("Autobot não encontrado.");
        }

        gerenciador.reparar(ratchet);

        System.out.println(
                "Energon do Ratchet: " + ratchet.getEnergon()
        );

        System.out.println(
                "Classificação: " + gerenciador.classificar(ratchet)
        );

        System.out.println("\nAutobots indisponíveis:");

        for (Autobot autobot :
                gerenciador.listarAutobotsIndisponiveis()) {
            System.out.println(autobot.getNome());
        }
    }
}
