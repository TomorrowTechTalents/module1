package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    System.out.print("primeiro número: ");
    double number1 = scanner.nextDouble();

    System.out.print("segundo número: ");
    double number2 = scanner.nextDouble();

    System.out.println("----------");

    System.out.println("soma = " + (number1 + number2));
    System.out.println("subtração = " + (number1 - number2));
    System.out.println("multiplicação = " + number1 * number2);
    System.out.println("divisão = " + number1 / number2);
  }
}
