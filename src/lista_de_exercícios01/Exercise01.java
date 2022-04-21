package lista_de_exercícios01;

import java.util.Scanner;

class Exercise01 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    float celsius = scanner.nextFloat();

    System.out.println("Kelvin: " + celsius + 273.15);
    System.out.println("Fahrenheit: " + celsius * 1.8 + 32);
    System.out.println("Rankine: " + celsius * 1.8 + 32 + 459.67);
    System.out.println("Réaumur: " + celsius * 0.8);    
  }
}