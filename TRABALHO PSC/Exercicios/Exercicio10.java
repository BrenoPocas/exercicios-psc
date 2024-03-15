package Exercicios;

import java.util.Scanner;

public class Exercicio10{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float temperaturaFarenheit, temperaturaCelsius;
        
        System.out.println("Insira a temperatura em Celsius: ");
        temperaturaCelsius = sc.nextFloat();
        temperaturaFarenheit = (temperaturaCelsius * 1.8f) + 32f;

        System.out.println("A temperatura em Farenheit é: " + temperaturaFarenheit + "°C");
    }
}