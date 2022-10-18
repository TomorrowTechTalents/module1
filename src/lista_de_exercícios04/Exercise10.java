package lista_de_exercícios04;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        int residualValue = value;

        int numberOf100Bills = residualValue / 100;
        residualValue %= 100;

        int numberOf50Bills = residualValue / 50;
        residualValue %= 50;

        int numberOf20Bills = residualValue / 20;
        residualValue %= 20;

        int numberOf10Bills = residualValue / 10;
        residualValue %= 10;

        int numberOf5Bills = residualValue / 5;
        residualValue %= 5;

        int numberOf2Bills = residualValue / 2;
        residualValue %= 2;

        int numberOf1Bills = residualValue / 1;

        int minimumNumberOfBills = numberOf100Bills + numberOf50Bills + numberOf20Bills +
                               numberOf10Bills + numberOf5Bills + numberOf2Bills + numberOf1Bills;

        System.out.println("O valor lido foi: " + value);

        System.out.println("A relação de notas em que o valor pode ser decomposto " +
                           "que usa o menor número de notas é: ");

        boolean previousStringExists = false;

        if (numberOf100Bills != 0) {
            System.out.print(numberOf100Bills + " nota(s) de 100");

            previousStringExists = true;
        }

        if (numberOf50Bills != 0) {
            if (previousStringExists) { // ternarios hein
                System.out.print(", ");
            }

            System.out.print(numberOf50Bills + " nota(s) de 50");

            previousStringExists = true;
        }

        if (numberOf20Bills != 0) {
            if (previousStringExists) {
                System.out.print(", ");
            }

            System.out.print(numberOf20Bills + " nota(s) de 20");

            previousStringExists = true;
        }

        if (numberOf10Bills != 0) {
            if (previousStringExists) {
                System.out.print(", ");
            }

            System.out.print(numberOf10Bills + " nota(s) de 10");

            previousStringExists = true;
        }

        if (numberOf5Bills != 0) {
            if (previousStringExists) {
                System.out.print(", ");
            }

            System.out.print(numberOf5Bills + " nota(s) de 5");

            previousStringExists = true;
        }

        if (numberOf2Bills != 0) {
            if (previousStringExists) {
                System.out.print(", ");
            }

            System.out.print(numberOf2Bills + " nota(s) de 2");

            previousStringExists = true;
        }

        if (numberOf1Bills != 0) {
            if (previousStringExists) {
                System.out.print(", ");
            }

            System.out.print(numberOf1Bills + " nota(s) de 1");
        }

        System.out.println(".");
    }
}

// try with enum
// caso < 1
