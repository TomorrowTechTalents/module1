package lista_de_exercícios04;

import java.util.Random;

public class Exercise03 {
    public static void main(String[] args) {
        Random random = new Random();

        // Limit for performance reasons
        int dimension1 = random.nextInt(9) + 1;
        int dimension2 = random.nextInt(9) + 1;

        double largestValue;
        double[][] values = new double[dimension1][dimension2];

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                values[i][j] = random.nextDouble();
            }
        }

        int[] largestValuePositions = findPositionOfLargestValue(values);
        largestValue = values[largestValuePositions[0]][largestValuePositions[1]];

        System.out.println("maior valor: " + largestValue);
        System.out.println("na posição: [" + largestValuePositions[0] + "][" + largestValuePositions[1] + "]");
    }

    static int[] findPositionOfLargestValue(double[][] values) {
        int firstPosition = 0;
        int secondPosition = 0;
        int dimension1 = values.length;
        int dimension2 = values[0].length;
        double largestValue = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension2; j++) {
                if (largestValue < values[i][j]) {
                    largestValue = values[i][j];
                    firstPosition = i;
                    secondPosition = j;
                }
            }
        }

        return new int[] {firstPosition, secondPosition};
    }
}
