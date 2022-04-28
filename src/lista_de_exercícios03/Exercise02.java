package lista_de_exercícios03;

import java.util.Scanner;

public class Exercise02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      int number = scanner.nextInt();

      if (number > 0) {
        System.out.println("O número é positivo.");
      }
      else if (number < 0) {
        System.out.println("O número é negativo.");
      } else {
        break;
      }
    }
  }
}
