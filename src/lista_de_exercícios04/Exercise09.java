package lista_de_exercícios04;

import java.util.Random;

public class Exercise09 {
    public static void main(String[] args) {
        final int DIMENSION1 = 3;
        final int DIMENSION2 = 5;

        int[][] numbers = new int[DIMENSION1][DIMENSION2];

        Random random = new Random();

        for (int i = 0; i < DIMENSION1; i++) {
            for (int j = 0; j < DIMENSION2; j++) {
                numbers[i][j] = random.nextInt();
            }
        }

        long[] linesSums = new long[DIMENSION1];

        for (int i = 0; i < DIMENSION1; i++) {
            for (int j = 0; j < DIMENSION2; j++) {
                linesSums[i] += numbers[i][j];
            }
        }

        long[] columnsSums = new long[DIMENSION2];

        for (int i = 0; i < DIMENSION1; i++) {
            for (int j = 0; j < DIMENSION2; j++) {
                columnsSums[j] += numbers[i][j];
            }
        }

        System.out.print("[");

        for (int i = 0; i < DIMENSION1 - 1; i++) {
            System.out.print(linesSums[i] + ", ");
        }

        System.out.println(linesSums[DIMENSION1 - 1] + "]");

        System.out.print("[");

        for (int i = 0; i < DIMENSION2 - 1; i++) {
            System.out.print(columnsSums[i] + ", ");
        }

        System.out.println(columnsSums[DIMENSION2 - 1] + "]");

        System.out.print("[");

        for (int i = 0; i < DIMENSION1 - 1; i++) {
            System.out.print("[");

            for (int j = 0; j < DIMENSION2 - 1; j++) {
                System.out.print(numbers[i][j] + ", ");
            }

            System.out.print(numbers[i][DIMENSION2 - 1] + "], ");
        }

        System.out.print("[");

        for (int j = 0; j < DIMENSION2 - 1; j++) {
            System.out.print(numbers[DIMENSION1 - 1][j] + ", ");
        }

        System.out.print(numbers[DIMENSION1 - 1][DIMENSION2 - 1] + "]");

        System.out.print("]");
    }
}
