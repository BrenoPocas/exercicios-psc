package Exercicios;

import java.util.Scanner;

public class Exercicio3{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("A soma dos numeros digitados é: " + soma);
    }
}