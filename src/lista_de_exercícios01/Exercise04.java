package com.worksheet01;

import java.util.Scanner;

class Exercise04 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    int age = scanner.nextInt();

    System.out.println("dias vividos, aproximadamente: " + (int) (age * 365.24));
  }
}
