package lista_de_exercícios03;

import java.util.Random;
import java.util.Scanner;

public class Exercise10 {
  public static void main(String[] args) {
    final int LOWER_BOUNDARY = 1;
    final int UPPER_BOUNDARY = 10;
    final int NUMBER_OF_TRIES = 3;

    Scanner scanner = new Scanner(System.in);

    int goalNumber = generateIntegerRandomNumber(LOWER_BOUNDARY, UPPER_BOUNDARY);

    int triesMade = 0;

    while (true) {
      triesMade++;

      int guess = scanner.nextInt();

      if (guess == goalNumber) {
        System.out.println("Parabéns");

        return;
      } else if (triesMade == NUMBER_OF_TRIES) {
        break;
      } else if (guess < goalNumber) {
        System.out.println("O número correto é maior");
      } else {
        System.out.println("O número correto é menor");
      }      
    }

    System.out.println("O número era " + goalNumber);
  }

  static int generateIntegerRandomNumber(int lowerBoundary, int upperBoundary) {
    Random random = new Random();

    return random.nextInt(upperBoundary - lowerBoundary) + lowerBoundary;
  }
}
