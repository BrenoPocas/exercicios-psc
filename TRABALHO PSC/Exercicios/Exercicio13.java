package Exercicios;

import java.util.Scanner;

public class Exercicio13{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float altura, pesoIdealM, pesoIdealF;

        System.out.print("Insira sua altura: ");
        altura = sc.nextFloat();
        pesoIdealM = 72.7f * altura - 58f;
        pesoIdealF = 62.1f * altura - 44.7f;
        
        System.out.println("Seu peso ideal é: " + pesoIdealM + "kg para homens e " + pesoIdealF + "kg para mulheres.");
    }
}