package Exercicios;

import java.util.Scanner;

public class Exercicio7{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float lado, area, areax2;

        System.out.print("Insira a medida do lado do quadrado: ");
        lado = sc.nextFloat();

        area = (float) Math.pow(lado, 2);
        areax2 = area * 2f;

        System.out.println("A area do quadrado é: " + area + " e o doubro dela é: " + areax2);
    }
}