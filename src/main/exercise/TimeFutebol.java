package com.uece.app.exercise;
import java.util.List;

public class TimeFutebol{

    private List<Jogador> jogadores;

    private string nome;

    public TimeFutebol(){
        this.setNome("Sem Nome");
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String Nome){
        this.nome = nome;
    }

    public List<Jogador> getJogadores(){

        if(jogadores!= null && jogadores.size() <11){
          throw new RuntimeException(
            "Tem que ter no mínimo ou mais jogadores"
          );
        }
        return this.jogadores;    
    }

    public void setJogadores(List<Jogador> jogadores){
        this.jogadores = jogadores;
    }




}