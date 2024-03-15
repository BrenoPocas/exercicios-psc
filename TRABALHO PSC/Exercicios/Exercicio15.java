package Exercicios;

import java.util.Scanner;

public class Exercicio15{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float salarioBruto, salarioLiquido, impostoDeRenda, inss, sindicato, valorHora, horas;

        System.out.println("Quanto você ganha por hora?");
        valorHora = sc.nextFloat();
        System.out.println("Quantas horas foram trabalhadas esse mês?");
        horas = sc.nextFloat();

        salarioBruto = horas * valorHora;
        impostoDeRenda = salarioBruto * 0.11f;
        inss = salarioBruto * 0.08f;
        sindicato = salarioBruto * 0.05f;
        salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.println("+ Salario Bruto : R$ " + salarioBruto);
        System.out.println("- IR : R$ " + impostoDeRenda);
        System.out.println("- INSS : R$ " + inss);
        System.out.println("- Sindicato : R$ " + sindicato);
        System.out.println("= Salario Liquido : R$ " + salarioLiquido);
    }
}