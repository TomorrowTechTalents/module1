package lista_de_exercícios01;

import java.util.Scanner;

class Exercise14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double radius = scanner.nextDouble();

    double area = Math.PI * radius * radius;

    System.out.println("área = " + area);
  }
}
