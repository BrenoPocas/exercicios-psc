package Exercicios;

import java.util.Scanner;

public class Exercicio18 {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float tamanho, velocidade, tempoH, tempoM, tempoS;

        System.out.print("Digite o tamanho do arquivo (MB): ");
        tamanho = sc.nextFloat();
        System.out.print("Digite a velocidade do download (Mbps): ");
        velocidade = sc.nextFloat();

        tempoS = tamanho / velocidade;
        tempoM = (float) Math.floor(tempoS / 60);
        tempoS = tempoS - tempoM * 60;
        tempoH = (float) Math.floor(tempoM / 60);
        tempoM = tempoM - tempoH * 60;

        System.out.println("O tempo de download será " + tempoH + " horas, " + tempoM + " minutos e " + tempoS + " segundos.");
    }    
}
