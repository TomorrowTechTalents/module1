package com.worksheet01;

import java.util.Scanner;

class Exercise14 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    double radius = scanner.nextDouble();

    double area = Math.PI * radius * radius;

    System.out.println("área = " + area);
  }
}
