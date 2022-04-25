package lista_de_exercícios01;

import java.util.Scanner;

public class Exercise04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age = scanner.nextInt();

    System.out.println("dias vividos, aproximadamente: " + (int) (age * 365.24));
  }
}
