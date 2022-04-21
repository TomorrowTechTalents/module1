package com.worksheet03;

import java.util.Scanner;

class Exercise11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    int auxNumber;

    if (number1 > number2) {
      auxNumber = number1;
      number1 = number2;
      number2 = auxNumber;
    }

    for (int i = number1 + 1; i < number2; i++) {
      System.out.println(i);
    }
  }
}
