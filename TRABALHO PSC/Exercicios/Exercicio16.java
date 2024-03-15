package Exercicios;

import java.util.Scanner;

public class Exercicio16{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float area, latas, preco, precoLata, rendimentoLitro, volumeLata, rendimentoLata;

        //inicializaçao
        precoLata = 80f;
        rendimentoLitro = 3f;
        volumeLata = 18f;
        
        rendimentoLata = rendimentoLitro * volumeLata;

        System.out.println("Quantos metros quadrados serão pintados?");
        area = sc.nextFloat();

        latas = (float) Math.ceil(area / rendimentoLata);
        preco = latas * precoLata;

        System.out.println("Você precisará de " + (int) latas + " latas e o preço total é: R$ " + preco);
    }
}