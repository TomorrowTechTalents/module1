package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    double distance = scanner.nextDouble();
    double fuel = scanner.nextDouble();    

    System.out.println("consumo médio = " + fuel / distance + "L/km");
  }
}
