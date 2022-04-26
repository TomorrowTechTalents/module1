package lista_de_exercícios01;

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor da massa: ");
    double mass = scanner.nextDouble();

    System.out.print("Digite o valor da altura: ");
    double height = scanner.nextDouble();

    System.out.print("Digite o valor do tempo: ");
    double time = scanner.nextDouble();

    System.out.println("Cavalos = " + mass * height / time);
  }
}
