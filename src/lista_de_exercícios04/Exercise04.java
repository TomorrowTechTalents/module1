package lista_de_exercícios04;

import java.util.Random;

public class Exercise04 {
    public static void main(String[] args) {
        Random random = new Random();

        // Limit for performance reasons
        int dimension1 = random.nextInt(9) + 1;
        int dimension2 = random.nextInt(9) + 1;

        int[][] values = new int[dimension1][dimension2];

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                values[i][j] = random.nextInt();
            }
        }

        System.out.println(sumOfAllValues(values));
    }

    static int sumOfAllValues(int[][] values) {
        int sum = 0;
        int dimension1 = values.length;
        int dimension2 = values[0].length;

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                sum += values[i][j];
            }
        }

        return sum;
    }
}
