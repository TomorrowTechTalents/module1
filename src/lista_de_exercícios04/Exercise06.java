package lista_de_exercícios04;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] drawnNumbers = new int[13];

        for (int i = 0; i < 13; i++) {
            drawnNumbers[i] = scanner.nextInt();
        }

        while (true) {
            int cardNumber = scanner.nextInt();

            int[] numbers = new int[13];

            for (int i = 0; i < 13; i++) {
                numbers[i] = scanner.nextInt();
            }

            byte numberOfMatchingNumbers = 0;

            for (int i = 0; i < 13; i++) {
                if (drawnNumbers[i] == numbers[i]) {
                    numberOfMatchingNumbers++;
                }
            }

            System.out.println(cardNumber + " - " + numberOfMatchingNumbers);

            if (numberOfMatchingNumbers == 13) {
                System.out.println("Ganhador");
            }
        }
    }
}
