package Exercicios;

import java.util.Scanner;

public class Exercicio17 {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        float area, areaComFolga, latas, galoes, latas2, galoes2, precoTotal1, precoTotal2, precoTotal3, precoLata, precoGalao, rendimentoLitro, volumeLata, volumeGalao, rendimentoLata, rendimentoGalao;

        //inicializaçao
        precoLata = 80;
        precoGalao = 25;
        rendimentoLitro = 6;
        volumeLata = 18;
        volumeGalao = 3.6f;

        rendimentoLata = rendimentoLitro * volumeLata;
        rendimentoGalao = rendimentoLitro * volumeGalao;

        System.out.println("Qual o tamanho em metros quadrados da área a ser pintada?");
        area = sc.nextFloat();

        areaComFolga = area * 1.1f;

        latas = (float) Math.ceil(areaComFolga / rendimentoLata);

        galoes = (float) Math.ceil(areaComFolga / rendimentoGalao);

        latas2 = (float) Math.floor(areaComFolga / rendimentoLata);
        galoes2 = (float) Math.ceil((areaComFolga - (latas2 * rendimentoLata))/ rendimentoGalao);

        if (galoes2 >= precoLata / precoGalao){
            latas2++;
            galoes2 = 0;
        }

        precoTotal1 = latas * precoLata;
        precoTotal2 = galoes * precoGalao;
        precoTotal3 = latas2 * precoLata + galoes2 * precoGalao;

        System.out.println("A) Comprando apenas latas seriam necessarias "+ (int) latas + " latas e o preço ficaria: R$ "+ precoTotal1);
        System.out.println("B) Comprando apenas galoes seriam necessarias "+ (int) galoes + " galoes e o preço ficaria: R$ "+ precoTotal2);
        System.out.println("C) Comprando latas e galoes seriam necessarias "+ (int) latas2 + " latas e " + (int) galoes2 + " galoes e o preço ficaria: R$ "+ precoTotal3);
    }    
}