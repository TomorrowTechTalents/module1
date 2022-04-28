package lista_de_exercícios02;

import java.util.Locale;
import java.util.Scanner;

public class Exercise06 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner (System.in);

    System.out.print("1º número: ");
    double number1 = scanner.nextDouble();

    System.out.print("2º número: ");
    double number2 = scanner.nextDouble();

    System.out.print("3º número: ");
    double number3 = scanner.nextDouble();

    System.out.print("4º número: ");
    double number4 = scanner.nextDouble();

    System.out.println("soma dos quadrados: " + (number1 * number1 + number2 * number2
                                              + number3 * number3 + number4 * number4));
  }
}
