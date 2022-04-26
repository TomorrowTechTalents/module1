package lista_de_exercícios02;

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.print("nome completo: ");
    String fullName = scanner.nextLine();

    System.out.print("endereço: ");
    String address = scanner.nextLine();

    System.out.print("CEP: ");
    String CEP = scanner.nextLine();

    System.out.print("número de telefone: ");
    String telephoneNumber = scanner.nextLine();

    System.out.println("Nome completo: " + fullName);
    System.out.println("Endereço: " + address);
    System.out.print("CEP: " + CEP + "\t");
    System.out.println("telefone: " + telephoneNumber);
  }
}
