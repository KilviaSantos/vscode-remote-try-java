package com.uece.app.programmingexam;
import java.util.Scanner;

public class Question2 {
 
    public static void main(String[] args) {
        // Declarar nota1 e nota2 = numero real
        double nota1, nota2;

        // nota1 <= 10
        // nota2 <=10
        // Input nota1
        // Input nota2
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();

        // Declarar variavel aluno do tipo string
        String aluno;

        // aluno = Input ("Qual o nome do aluno?")
        System.out.println("Qual o nome do aluno?");
        aluno = sc.next();

        // Declarar Aulas Ministradas double duas casas decimais
        double aulasMinistradas;

        // Declarar Aulas Assistidas double duas casas decimais
        double aulasAssistidas;

        // Input Aulas Ministradas
        // Input Aulas Assistidas
        System.out.println("Digite o número de aulas ministradas:");
        aulasMinistradas = sc.nextDouble();
        System.out.println("Digite o número de aulas assistidas:");
        aulasAssistidas = sc.nextDouble();

        // Fechar o scanner
        sc.close();

        // Criar metodo calculo media final double duas casas decimais
        double mediaFinal = calculoMediaFinal(nota1, nota2);

        // Criar metodo calculo frequencia double duas casas decimais em porcentagem
        double frequencia = calculoFrequencia(aulasMinistradas, aulasAssistidas);

        // Criar metodo Resultado do aluno, se frequencia>=75% "Aprovado", se não "Reprovado"
        String resultadoFrequencia = resultadoFrequencia(frequencia);

        // Criar metodo média final, se media final>=7:00 "Aprovado", se não "Reprovado"
        String resultadoMedia = resultadoMedia(mediaFinal);

        // Print resultado aluno ()
        System.out.println("O resultado do aluno " + aluno + " é:");
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Frequência: " + frequencia + "%");
        System.out.println("Resultado por frequência: " + resultadoFrequencia);
        System.out.println("Resultado por média: " + resultadoMedia);
    }

    public static double calculoMediaFinal(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    public static double calculoFrequencia(double aulasMinistradas, double aulasAssistidas) {
        return (aulasAssistidas / aulasMinistradas) * 100;
    }

    public static String resultadoFrequencia(double frequencia) {
        if (frequencia >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static String resultadoMedia(double mediaFinal) {
        if (mediaFinal >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}   

// Elabore um algoritmo que leia as duas notas obtidas por um aluno (valores reais de 0 a 10) na//
//disciplina de Linguagem de Programação I, o número total de aulas ministradas e o número de//
//aulas que ele assistiu. Calcule e apresente a média final e a sua frequência, ambas com duas//
//casas decimais. Ao final, o seu algoritmo deve apresentar o resultado do aluno na disciplina.//
//Ele estará aprovado somente se obtiver frequência igual ou superior a 75% e média final igual//
// ou superior a 7:00. //

//Declarar nota1 e nota2 = numero real //
//nota1 <= 10//
//nota2 <=10//
//Input nota1 //
//Input nota2 //
//Declarar variavel aluno do tipo string//
//aluno = Input ("Qual o nome do aluno?") //
//Declarar Aulas Ministradas double duas casas decimais//
//Declarar Aulas Assistidas double duas casas decimais//
//Criar metodo calculo media final double duas casas decimais//
//Criar metodo calculo frequencia double duas casas decimais em porcentagem//
//Criar metodo Resultado do aluno, se frequencia>=75% "Aprovado", se não "Reprovado"//
//Criar metodo média final, se media final>=7:00 "Aprovado", se não "Reprovado"//
//Print resultado aluno ()//
