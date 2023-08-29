package com.uece.app.atividade1PCC;
import java.util.Scanner;

public class Quest3 {
   
    public static void main(String[] args){

    //Faça um algoritmo chamado Calculadora 
    //System.out.println("Bemvindo(a) a sua Calculadora. Que operação você deseja executar?");
    //string[] operacoesStrings;
    //operacoesStrings = new string[4];
    //string[] operacoes = {soma, subtração, multiplicação, divisão};
    //System.out.println(operacoesStrings);
    //Exibe as opções de operações (soma, subtração, multiplicação e divisão) 

    getNumbers();
    
    
    //Cada operação deverá ser criada em um procedimento (sub-rotina).
    }

    //Solicita dois números do usuário
    private static void getNumbers() {
        Scanner numero = new Scanner(System.in);
        int num1, num2;
        //Primeiro número
        System.out.println("Digite o primeiro número a ser utilizado na operação:");
        num1 = numero.nextInt();
        
        //Segundo número
        System.out.println("Digite o segundo número a ser utilizado na operação:");
        num2 = numero.nextInt();
      }

    //Realiza soma com os números


    //Realiza subtração com os números


    //Realiza multiplicação com os números


    //Realiza divisão com os números

}
