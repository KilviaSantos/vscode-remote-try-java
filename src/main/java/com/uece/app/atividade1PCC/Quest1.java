  package com.uece.app.atividade1PCC;
import java.security.SecureRandom;

public class Quest1{

    public static void main(String[] args) {
        final int linha = 8;
        final int coluna = 4;
        int[][] numeros = new int[linha][coluna];

        for(int i=0; i<linha; i++){
            for(int c=0; c<coluna; c++){
                numeros[i][c] = new SecureRandom().nextInt(100);
            }
        }

        
        for(int i=0; i<linha; i++){
            for(int c=0; c<coluna; c++){    
                System.out.print(numeros[i][c]+ " ");

            }
            System.out.println();
        }
        
        /** A soma desses números armazenados*/
        int soma = 0;
        for( int i = 0; i < linha; i++) {
            for( int c = 0; c < coluna; c++) {
                soma += numeros[i][c];
            }            
        }
        System.out.println("A soma de todos os números da matriz é: " + soma + ".");

        /** O menor número armazenado*/
        int menor = 101;
        for( int i = 0; i < linha; i++) {
            for( int c = 0; c < coluna; c++) {
                int celula= numeros[i][c];
                /**Se a celula for menor substitui a atual. */
                if (celula<menor){
                    menor=celula;
                }
            }
        }
        System.out.println("O menor número da matriz é: "+ menor + ".");
        
        /** A soma da diagonal principal (elementos em que os índices de linha e coluna são iguais)*/
       int somaDiagonal = 0;
        for( int i = 0; i < linha; i++) {
            for( int c = 0; c < coluna; c++) {
             //Encontrar e armazenar elementos com indices de linha e coluna.
             if (i==c) {
                somaDiagonal+= numeros[i][c] ;
             }   
            }
        }   
        System.out.println("A soma da diagonal é: " + somaDiagonal + "."); 
        /** Os números armazenados */
        System.out.println();
    }
}
