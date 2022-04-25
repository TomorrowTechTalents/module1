package lista_de_exercícios01;

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double mass = scanner.nextDouble();
    double height = scanner.nextDouble();
    double time = scanner.nextDouble();

    System.out.println("Cavalos = " + mass * height / time);
  }
}
