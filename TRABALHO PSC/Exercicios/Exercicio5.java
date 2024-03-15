package Exercicios;

import java.util.Scanner;

public class Exercicio5{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float medidaEmMetros, medidaEmCentimetros;
        
        System.out.print("Insira uma medida em metros: ");
        medidaEmMetros = sc.nextFloat();

        medidaEmCentimetros = medidaEmMetros * 100f;

        System.out.println("A medida inserida equivale à " + medidaEmCentimetros + " centimetros.");
    }
}