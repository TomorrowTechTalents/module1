package lista_de_exercícios04;

import java.util.Random;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        final int DIMENSION1 = 2;
        final int DIMENSION2 = 5;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        byte[][] values = new byte[DIMENSION1][DIMENSION2];

        for (int i = 0; i < DIMENSION1; i++) {
            for (int j = 0; j < DIMENSION2; j++) {
                values[i][j] = scanner.nextByte();
            }
        }

        byte goalValue = scanner.nextByte();

        for (int i = 0; i < DIMENSION1; i++) {
            for (int j = 0; j < DIMENSION2; j++) {
                if (values[i][j] == goalValue) {
                    System.out.println("O valor existe no conjunto.");

                    return;
                }
            }
        }

        System.out.println("--");

        scanner.close();
    }
}
