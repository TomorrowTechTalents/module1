package lista_de_exercícios01;

import java.util.Scanner;

public class Exercise15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfHorses = scanner.nextInt();

    System.out.println("quantidade de ferraduras necessárias: " + numberOfHorses * 4);
  }
}
