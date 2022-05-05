package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise08 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    System.out.print("valor da distância, em km: ");
    double distance = scanner.nextDouble();

    System.out.print("valor do volume de combustível consumido, em L: ");
    double fuel = scanner.nextDouble();

    System.out.println("consumo médio: " + fuel / distance + " L/km");
  }
}
