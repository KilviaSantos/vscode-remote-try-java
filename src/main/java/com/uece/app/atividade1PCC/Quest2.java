package com.uece.app.atividade1PCC;
import java.util.Scanner;

public class Quest2{

   
    public static void main(String[] args){
        //Cria objeto Pessoa que será usado para input através do Scanner.
        Scanner pessoa = new Scanner(System.in);           
        
        //Recebe o nome (texto).
        System.out.println("Qual o seu nome?");
        String nome = pessoa.nextLine();

        //Recebe o cpf (texto)
        System.out.println("Qual o seu CPF?");
        String cpf = pessoa.nextLine();

        //Recebe o sexo (caractere)
        System.out.println("Qual o seu sexo?");
        String s = pessoa.nextLine();
        char sexo = s.charAt(0);

        //Recebe o ano de nascimento (inteiro) e armazene-os em um registro
        System.out.println("Qual o seu ano de nascimento?");
        int anoNascimento = pessoa.nextInt();

        //Imprime o nome, o sexo e a idade dessa pessoa
        System.out.println(nome + ", sexo " + sexo + ", nasceu no ano " + anoNascimento + ".");
    }
    
}