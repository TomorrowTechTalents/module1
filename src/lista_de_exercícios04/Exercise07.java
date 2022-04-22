package lista_de_exercícios04;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        final int NUMBER_OF_STUDENTS = 10;
        final int PASSING_GRADE = 6;

        Scanner scanner = new Scanner(System.in);
        char[] G = new char[NUMBER_OF_QUESTIONS];

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            G[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            char[] R = new char[NUMBER_OF_QUESTIONS];
            int numberOfCorrectAnswers = 0;
            for (int j = 0; j < NUMBER_OF_QUESTIONS; j++) {
                R[j] = scanner.next().charAt(0);

                if (R[j] == G[j]) {
                    numberOfCorrectAnswers++;
                }
            }

            System.out.println(numberOfCorrectAnswers >= PASSING_GRADE ? "APROVADO" : "REPROVADO");
        }
    }
}
