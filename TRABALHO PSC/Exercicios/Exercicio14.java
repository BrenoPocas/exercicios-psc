package Exercicios;

import java.util.Scanner;

public class Exercicio14{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float peso, excesso, multa;

        System.out.println("Quantos quilos foram trazidos hoje?");
        peso = sc.nextFloat();
        if (peso > 50) 
            excesso = peso - 50;
        else 
            excesso = 0;
        multa = excesso * 4;

        System.out.println("Quilos trazidos: " + peso);
        System.out.println("Excesso trazido: " + excesso);
        System.out.println("Multa: R$ " + multa);        
    }
}