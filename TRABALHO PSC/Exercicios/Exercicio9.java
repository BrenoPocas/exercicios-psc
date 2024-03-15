package Exercicios;

import java.util.Scanner;

public class Exercicio9{
    public static void run() {
        Scanner sc = new Scanner(System.in);
        float temperaturaFarenheit, temperaturaCelsius;
        
        System.out.println("Insira a temperatura em Farenheit: ");
        temperaturaFarenheit = sc.nextFloat();
        temperaturaCelsius = ( 5f * (temperaturaFarenheit - 32f) / 9f );

        System.out.println("A temperatura em Celsius é: " + temperaturaCelsius + "°C");
    }
}