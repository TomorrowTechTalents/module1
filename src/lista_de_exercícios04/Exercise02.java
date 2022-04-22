package lista_de_exercícios04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        final int DIMENSION1 = 2;
        final int DIMENSION2 = 5;

        Scanner scanner = new Scanner(System.in);

        double[][] values = new double[DIMENSION1][DIMENSION2];

        for (int i = 0; i < DIMENSION1; i++) {
            for (int j = 0; j < DIMENSION2; j++) {
                values[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();
    }
}
