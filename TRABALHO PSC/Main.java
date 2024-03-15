import java.util.Scanner;
import Exercicios.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exercicio;

        System.out.println("Qual exercicio gostaria de testar?");
        exercicio = sc.nextInt();
        switch(exercicio){
            case 1:
            Exercicio1.run();
            break;
            case 2:
            Exercicio2.run();
            break;
            case 3:
            Exercicio3.run();
            break;
            case 4:
            Exercicio4.run();
            break;
            case 5:
            Exercicio5.run();
            break;
            case 6:
            Exercicio6.run();
            break;
            case 7:
            Exercicio7.run();
            break;
            case 8:
            Exercicio8.run();
            break;
            case 9:
            Exercicio9.run();
            break;
            case 10:
            Exercicio10.run();
            break;
            case 11:
            Exercicio11.run();
            break;
            case 12:
            Exercicio12.run();
            break;
            case 13:
            Exercicio13.run();
            break;
            case 14:
            Exercicio14.run();
            break;
            case 15:
            Exercicio15.run();
            break;
            case 16:
            Exercicio16.run();
            break;
            case 17:
            Exercicio17.run();
            break;
            case 18:
            Exercicio18.run();
            break;
        }
    }
}