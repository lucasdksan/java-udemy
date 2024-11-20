package fundamentals;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da temperatura em F: ");
        double tempF = sc.nextDouble();
        final double factor = 5.0/9;
        double tempC = (tempF - 32) * factor;

        System.out.println("Resultado da conversão: " + tempC + "°C");
    }
}
