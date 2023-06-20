package com.uece.app.programmingexam;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
        }
        System.out.println("Resultado: " + b);
        sc.close();
    }
}
