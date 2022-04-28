package lista_de_exercícios02;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    final double FUEL_EFFICIENCY = 12;

    Scanner scanner = new Scanner (System.in);

    System.out.print("duração da viagem, em horas: ");
    double time = scanner.nextDouble();

    System.out.print("velocidade média de deslocamento, em km/h: ");
    double speed = scanner.nextDouble();

    System.out.println("quantidade de combustível necessário: " + time * speed / FUEL_EFFICIENCY + " L");
  }
}
