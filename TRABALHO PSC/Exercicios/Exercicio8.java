package Exercicios;

import java.util.Scanner;

public class Exercicio8{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float valorHora, horas, salario;

        System.out.println("Quanto você ganha por hora? ");
        valorHora = sc.nextFloat();

        System.out.println("Quantas horas você trabalhou no mês? ");
        horas = sc.nextFloat();

        salario = (float) valorHora * (float) horas;

        System.out.println("Você receberá R$" + salario + " este mês.");
    }
}