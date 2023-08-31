package com.uece.app.atividade1PCC;
import java.util.Scanner;

public class Quest3 {
   
    public static void main(String[] args){
        // Solicita a operaçao do usuário
        Scanner operacao = new Scanner(System.in);
        System.out.println("Digite o número 1 para Adição, 2 para Subtração, 3 para Multiplicação ou 4 para Divisão.");
        int opEscolha;
        opEscolha = operacao.nextInt();
            switch(opEscolha){
            case 1:            
            adicao();    
                break;

            case 2:            
            subtracao();     
                break;
                
            case 3:            
            multiplicacao();     
                break;
        
            default:            
            divisao(); 
                break;
                
        }

        
     } 
     //Faça um algoritmo chamado Calculadora         
     //Solicita dois números do usuário

    public static int[] getNumbers(){
        Scanner numero = new Scanner(System.in);
        int num1, num2;
        //Primeiro número
        System.out.println("Digite o primeiro número a ser utilizado na operação:");
        num1 = numero.nextInt();
        
        //Segundo número
        System.out.println("Digite o segundo número a ser utilizado na operação:");
        num2 = numero.nextInt();
        
        return new int[]{num1, num2};

      }

    //Realiza soma com os números

    public static void adicao(){
        System.out.println("Você escolheu a adição! Então vamos começar!");
        int[] numeros = getNumbers();

        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 + num2;
        System.out.println("O resultado da adição é: " + resultado);
    }

    //Realiza subtração com os números

    public static void subtracao(){
        System.out.println("Você escolheu a subtração! Então vamos começar!");
        int[] numeros = getNumbers();

        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 - num2;
        System.out.println("O resultado da subtração é: " + resultado);

    }

    //Realiza multiplicação com os números

    public static void multiplicacao(){
        System.out.println("Você escolheu a multiplicação! Então vamos começar!");
        int[] numeros = getNumbers();

        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + resultado);

    }

    //Realiza divisão com os números

    public static void divisao(){
        System.out.println("Você escolheu a divisão! Então vamos começar!");
        int[] numeros = getNumbers();
        
        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 / num2;
        System.out.println("O resultado da divisão é: " + resultado);

    }

    

    
}

