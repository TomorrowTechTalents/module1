package lista_de_exercícios01;

import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Valor de uma temperatura em graus Celsius para ser convertido: ");

    float celsius = scanner.nextFloat();

    System.out.println("em Kelvin: " + (celsius + 273.15));
    System.out.println("em graus Fahrenheit: " + (celsius * 1.8 + 32));
    System.out.println("em Rankine: " + (celsius * 1.8 + 32 + 459.67));
    System.out.println("em graus Réaumur: " + celsius * 0.8);    
  }
}
