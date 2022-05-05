package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise14 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    System.out.print("raio: ");
    double radius = scanner.nextDouble();

    double area = Math.PI * radius * radius;

    System.out.println("área: " + area);
  }
}
