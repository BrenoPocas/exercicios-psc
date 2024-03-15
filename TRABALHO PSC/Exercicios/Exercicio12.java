package Exercicios;

import java.util.Scanner;

public class Exercicio12{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float altura, pesoIdeal;

        System.out.print("Insira sua altura: ");
        altura = sc.nextFloat();
        pesoIdeal = 72.7f * altura - 58f;
        
        System.out.println("Seu peso ideal é: " + pesoIdeal + "kg");
    }
}