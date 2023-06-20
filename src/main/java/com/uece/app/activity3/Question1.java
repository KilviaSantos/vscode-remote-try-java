// 1. Escreva um programa que lê todos os elementos de uma matriz 4 × 4 e mostra a matriz e a sua transposta na tela //
package com.uece.app.activity3;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Question1 {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        for (int i = 0; i < matriz.length; i++) {
            int[] linha = matriz[i];

            for (int j = 0; j < linha.length; j++) {
                System.out.print(linha[j] + ", ");
            }
            System.out.println();
        }

        System.out.println("Hello, World!");
    }
}
