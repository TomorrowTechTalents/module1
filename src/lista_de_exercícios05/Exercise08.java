package lista_de_exercícios05;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        final byte NUMBER_OF_PEOPLE = 7;

        Scanner scanner = new Scanner(System.in);

        byte plus90weight = 0;
        short sumOfAges = 0;

        for (int i = 0; i < NUMBER_OF_PEOPLE; i++) {
            System.out.print("idade, em anos: ");
            short age = scanner.nextShort();

            sumOfAges += age;

            System.out.print("massa, em kg: ");
            double weight = scanner.nextDouble();

            if (weight > 90) {
                plus90weight++;
            }

            System.out.println("==========");
        }

        System.out.println("quantidade de pessoas com mais de 90 kg: " + plus90weight);
        System.out.println("média das idades: " + (double) sumOfAges/NUMBER_OF_PEOPLE + " ano(s)");
    }
}
