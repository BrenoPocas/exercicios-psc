package Exercicios;

import java.util.Scanner;

public class Exercicio11{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        int int1, int2;
        float real1, letraA, letraB, letraC;

        System.out.print("Digite um numero inteiro: ");
        int1 = sc.nextInt();
        System.out.print("Digite outro numero inteiro: ");
        int2 = sc.nextInt();
        System.out.print("Digite um numero real: ");
        real1 = sc.nextFloat();

        letraA = ((float) int1 * 2f) * ((float) int2 / 2f);
        letraB = (float) int1 * 3f + real1;
        letraC = (float) Math.pow(real1, 3);

        System.out.println("A) produto do dobro do primeiro com metade do segundo: " + letraA);
        System.out.println("B) soma do triplo do primeiro com o terceiro: " + letraB);
        System.out.println("C) terceiro elevado ao cubo: " + letraC);
    }
}