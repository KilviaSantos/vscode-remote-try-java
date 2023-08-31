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
            getNumbers();
            adicao();    
                break;

            case 2:
            getNumbers();
            subtracao();     
                break;
                
            case 3:
            getNumbers();
            multiplicacao();     
                break;
        
            default:
            getNumbers();
            divisao(); 
                break;
                
        }

        // String opString = "soma", "subtração", "multiplicação", "divisão"
        //escolhaOp = operacao.nextLine();

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
        int[] numeros = getNumbers();

        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 + num2;
        System.out.println("A adição é: " + resultado);
    }

    //Realiza subtração com os números

    public static void subtracao(){
        int[] numeros = getNumbers();
        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 - num2;
        System.out.println("A subtração é: " + resultado);

    }

    //Realiza multiplicação com os números

    public static void multiplicacao(){
        int[] numeros = getNumbers();
        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 * num2;
        System.out.println("A multiplicação é: " + resultado);

    }

    //Realiza divisão com os números

    public static void divisao(){
        int[] numeros = getNumbers();
        int num1= numeros[0];
        int num2= numeros[1];
        int resultado = num1 / num2;
        System.out.println("A divisão é: " + resultado);

    }

    //Vou fazer um switch para a escolha da operação a ser realizada

    

    
}

