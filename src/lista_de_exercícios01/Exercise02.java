package com.worksheet01;

import java.util.Scanner;

class Exercise02 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    double mass = scanner.nextDouble();
    double height = scanner.nextDouble();
    double time = scanner.nextDouble();

    System.out.println("Cavalos = " + mass * height / time);
  }
}
