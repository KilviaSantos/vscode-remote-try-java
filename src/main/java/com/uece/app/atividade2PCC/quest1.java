package com.uece.app.atividade2PCC;
//import java.util.Arrays;
import java.util.Random;

public class quest1 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(100) + 1;
        System.out.println("O número escolhido foi: " + n);
        
    }
    
}

/*Proponha um algoritmo que leia um número inteiro n (1 ≤ n ≤ 100) e gere n valores inteiros
de forma aleatória, no intervalo de 1 a 100, e insira um a um em um vetor V , de modo que,
após a inserção de cada valor, o vetor fique sempre ordenado de forma crescente*/