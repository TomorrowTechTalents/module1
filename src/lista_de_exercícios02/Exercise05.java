package lista_de_exercícios02;

import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    double time = scanner.nextDouble();
    double speed = scanner.nextDouble();

    System.out.println("quantidade de combustível necessário: " + time * speed / 12);
  }
}
