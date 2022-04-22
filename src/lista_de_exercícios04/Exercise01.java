package lista_de_exercícios04;

import java.util.Random;

public class Exercise01 {
    public static void main (String[] args) {
        final int QUANTITY_OF_NUMBERS = 10;
        final double UPPER_BOUND = 100;

        Random random = new Random();

        double[] randomNumbers = new double[QUANTITY_OF_NUMBERS];

        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextDouble() * UPPER_BOUND;
        }
    }
}
