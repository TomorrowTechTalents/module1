package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    System.out.print("valor de uma temperatura em graus Celsius para ser convertido: ");

    float celsius = scanner.nextFloat();

    System.out.println("em Kelvin:\t\t\t\t" + (celsius + 273.15) + " K");
    System.out.println("em graus Fahrenheit:\t" + (celsius * 1.8 + 32) + " ºF");
    System.out.println("em graus Rankine:\t\t" + (celsius * 1.8 + 32 + 459.67) + " ºR");
    System.out.println("em graus Réaumur:\t\t" + celsius * 0.8 + " ºRé");
  }
}
