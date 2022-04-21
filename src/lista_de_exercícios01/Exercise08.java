package com.worksheet01;

import java.util.Scanner;

class Exercise08 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    double distance = scanner.nextDouble();
    double fuel = scanner.nextDouble();    

    System.out.println("consumo médio = " + fuel / distance + "L/km");
  }
}
