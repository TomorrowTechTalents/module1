package lista_de_exercícios04;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        final byte numberOfPeople = 10;

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[numberOfPeople];

        for (int i = 0; i < numberOfPeople; i++) {
            names[i] = scanner.nextLine();
        }

        String goalName = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < numberOfPeople; i++) {
            if (names[i].equals(goalName)) {
                System.out.println("ACHEI");

                return;
            }
        }
    }
}
