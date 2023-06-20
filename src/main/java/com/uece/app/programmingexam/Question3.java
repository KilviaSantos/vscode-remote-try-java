package com.uece.app.programmingexam;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        // Criar um objeto da classe Random
        Random random = new Random();

        // Criar um vetor de 10 elementos inteiros
        int[] vetor = new int[10];

        // Preencher o vetor com números aleatórios de 1 a 100
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }

        // Mostrar o vetor antes da ordenação
        System.out.println("Vetor escolhido:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        // Ordenar o vetor em ordem crescente usando o método bubbleSort
        bubbleSort(vetor);

        // Mostrar o vetor depois da ordenação
        System.out.println("Vetor escolhido e ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    // Criar um método para ordenar um vetor usando o algoritmo bubble sort
    public static void bubbleSort(int[] vetor) {
        // Repetir até que o vetor esteja ordenado
        boolean trocou = true;
        while (trocou) {
            // Inicializar a variável trocou como false
            trocou = false;
            // Percorrer o vetor da esquerda para a direita
            for (int i = 0; i < vetor.length - 1; i++) {
                // Comparar o elemento atual com o próximo
                if (vetor[i] > vetor[i + 1]) {
                    // Trocar os elementos de posição se o atual for maior que o próximo
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    // Atualizar a variável trocou como true
                    trocou = true;
                }
            }
        }
    }
}


/* Proponha um algoritmo que preencha um vetor de 10 elementos inteiros, com valores gerados
aleatoriamente no intervalo de 1 a 100, apresente-o e, em seguida, ordene-o em ordem crescente
do valor dos elementos e apresente-o novamente */

/* Criar vetor de 10 elementos
 * Adicionar Randon choice para gerar 10 numeros aleatorios no intervalo de 1 a 100
 * Fazer print dos valores escolhidos 
 * Colocar numeros escolhidos em ordem crescente
 * Fazer print do vetor em ordem crescente. 
 */