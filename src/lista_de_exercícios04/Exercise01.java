package lista_de_exercícios04;

import java.util.Random;

public class Exercise01 {
    public static void main(String[] args) {
        final int QUANTITY_OF_NUMBERS = 10;
        final double UPPER_BOUND = 100;

        Random random = new Random();

        double[] randomNumbers = new double[QUANTITY_OF_NUMBERS];

        for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
            randomNumbers[i] = random.nextDouble() * UPPER_BOUND;
        }

        printArray(randomNumbers);
    }

    static void printArray(double[] array) {
        int arrayLength = array.length;

        System.out.print("[");

        for (int i = 0; i < arrayLength - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(array[arrayLength - 1] + "]");
    }
}
