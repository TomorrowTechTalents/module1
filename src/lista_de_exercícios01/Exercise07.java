package lista_de_exercícios01;

import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double number1 = scanner.nextDouble();
    double number2 = scanner.nextDouble();

    System.out.println("soma = " + (number1 + number2));
    System.out.println("subtração =  " + (number1 - number2));
    System.out.println("multiplicação = " + number1 * number2);
    System.out.println("divisão = " + number1 / number2);
  }
}
