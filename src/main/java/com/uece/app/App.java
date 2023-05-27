package com.uece.app;

import com.uece.app.pessoas.Aluno;

public class App {
    public static void main(String[] args) {

            Aluno aluno1= new Aluno();
            aluno1.setNome("Fernando");
            System.out.println(aluno1.getNome());
            Aluno aluno2= new Aluno();
            aluno2.setNome("Maria");
            System.out.println(aluno2.getNome());
            

    }
}
