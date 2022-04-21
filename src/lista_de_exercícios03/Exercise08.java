package lista_de_exercícios03;

import java.util.Scanner;

class Exercise08 {
  public static void main(String[] args) {
    final double QUANTITY_OF_NUMBERS = 10;

    Scanner scanner = new Scanner(System.in);

    int sum = 0;
    int largestNumber = 0;
    int smallestNumber = Integer.MAX_VALUE;

    for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
      int number = scanner.nextInt();

      sum += number;

      if (number > largestNumber) {
        largestNumber = number;
      }

      if (number < smallestNumber) {
        smallestNumber = number;
      }
    }

    System.out.println("maior valor: " + largestNumber);
    System.out.println("menor valor: " + smallestNumber);
    System.out.println("média: " + sum/QUANTITY_OF_NUMBERS);
  }
}
