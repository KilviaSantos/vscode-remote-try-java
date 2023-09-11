package com.uece.app.atividade2PCC;
import java.util.Arrays;
import java.util.Random;

public class quest1 {
    public static void main(String[] args) {
        /*leia um número inteiro n (1 ≤ n ≤ 100) e gere n valores inteiros
de forma aleatória*/
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(100) + 1;
        System.out.println("O número escolhido foi: " + n);

        /*Valor inserido um a um em um vetor V , ordenação de forma crescente*/
        int[] V = new int[n];
            for (int i = 0; i < n; i++) {
            int numAleatorio = aleatorio.nextInt(100) + 1;
            V[i] = numAleatorio;
        }
        Arrays.sort(V);

        System.out.println(Arrays.toString(V));

    }
}


/*Proponha um algoritmo que leia um número inteiro n (1 ≤ n ≤ 100) e gere n valores inteiros
de forma aleatória, no intervalo de 1 a 100, e insira um a um em um vetor V , de modo que,
após a inserção de cada valor, o vetor fique sempre ordenado de forma crescente*/