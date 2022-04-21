package com.worksheet01;

import java.util.Scanner;

class Exercise15 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    int numberOfHorses = scanner.nextInt();

    System.out.println("quantidade de ferraduras necessárias: " + numberOfHorses * 4);
  }
}
