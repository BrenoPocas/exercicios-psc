package Exercicios;

import java.util.Scanner;

public class Exercicio6{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float raio, area;        

        System.out.print("Insira o raio da circunferencia: ");
        raio = sc.nextFloat();

        area = (float) Math.PI * (float) Math.pow(raio, 2);

        System.out.println("A area da circunferencia é: " + area);
    }
}