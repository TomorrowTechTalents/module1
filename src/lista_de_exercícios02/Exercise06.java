package com.worksheet02;

import java.util.Scanner;

class Exercise06 {
  public static void main() {
    Scanner scanner = new Scanner (System.in);

    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();
    double number3 = scanner.nextDouble();
    double number4 = scanner.nextDouble();

    System.out.println("soma dos quadrados: " + (number1 * number1 + number2 * number2 + number3 * number3 + number4 * number4));
  }
}
