package lista_de_exercícios03;

import java.util.Scanner;

public class Exercise07 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();
    int result = 1;

    while (number > 0) {
      result *= number;
      number--;
    }

    System.out.println(result);
  }
}
