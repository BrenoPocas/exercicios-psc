package Exercicios;

import java.util.Scanner;

public class Exercicio4{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float nota1, nota2, nota3, nota4, media;

        System.out.print("Informe a nota do 1º bimestre: ");
        nota1 = sc.nextInt();
        System.out.print("Informe a nota do 2º bimestre: ");
        nota2 = sc.nextInt();
        System.out.print("Informe a nota do 3º bimestre: ");
        nota3 = sc.nextInt();
        System.out.print("Informe a nota do 4º bimestre: ");
        nota4 = sc.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4f;

        System.out.println("A media das notas é: " + media);
    }
}