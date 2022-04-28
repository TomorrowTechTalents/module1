package lista_de_exercícios05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de opções:");
        System.out.println("\t1. Média aritmética");
        System.out.println("\t2. Média ponderada");
        System.out.print("Digite a opção desejada: ");

        byte option;

        try {
            option = scanner.nextByte();

            if (option != 1 && option != 2) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException | InputMismatchException exception) {
            System.out.println("apenas \"1\" e \"2\" são opções válidas");

            return;
        }

        if (option == 1) {
            final byte NUMBER_OF_GRADES = 2;

            System.out.print("1ª nota: ");
            float grade1 = scanner.nextFloat();

            System.out.print("2ª nota: ");
            float grade2 = scanner.nextFloat();

            System.out.print("média aritmética: " + (grade1 + grade2) / NUMBER_OF_GRADES);
        } else {
            System.out.print("1ª nota: ");
            float grade1 = scanner.nextFloat();

            System.out.print("peso da 1ª nota: ");
            float grade1Weight = scanner.nextFloat();

            System.out.print("2ª nota: ");
            float grade2 = scanner.nextFloat();

            System.out.print("peso da 2ª nota: ");
            float grade2Weight = scanner.nextFloat();

            System.out.print("3ª nota: ");
            float grade3 = scanner.nextFloat();

            System.out.print("peso da 3ª nota: ");
            float grade3Weight = scanner.nextFloat();

            float weightedMean = (grade1 * grade1Weight + grade2 * grade2Weight + grade3 * grade3Weight) /
                    (grade1Weight + grade2Weight + grade3Weight);

            System.out.print("média ponderada: " + weightedMean);
        }
    }
}
