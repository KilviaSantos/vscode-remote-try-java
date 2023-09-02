package com.uece.app.exercise;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TimeFutebol time = new TimeFutebol();

        List<Jogador> lista = new ArrayList<Jogador>();

        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));
        lista.add(new Jogador("Artur"));

        time.setJogadores(lista);

        try {
            System.out.println(
                    "Quantidade: " + time.getJogadores().size());

        } catch (Exception e) {
            System.out.println("Opss...: " + e.getMessage());
        }
    }
}
