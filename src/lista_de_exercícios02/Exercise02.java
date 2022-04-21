package com.worksheet02;

import java.util.Scanner;

class Exercise02 {
  public static void main() {
    Scanner scanner = new Scanner (System.in);

    String fullName = scanner.nextLine();
    String address = scanner.nextLine();
    String CEP = scanner.nextLine();
    String telephoneNumber = scanner.nextLine();

    System.out.println("Nome completo: " + fullName);
    System.out.println("Endereço: " + address);
    System.out.print("CEP: " + CEP + "\t");
    System.out.println("telefone: " + telephoneNumber);
  }
}
