package lista_de_exercícios03;

import java.util.Scanner;

public class Exercise11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int largerNumber;
    int smallerNumber;

    if (number1 > number2) {
      largerNumber = number1;
      smallerNumber = number2;
    } else {
      largerNumber = number2;
      smallerNumber = number1;
    }

    for (int i = smallerNumber + 1; i < largerNumber; i++) {
      System.out.println(i);
    }
  }
}
