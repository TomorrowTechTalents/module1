package lista_de_exercícios03;

import java.util.Scanner;

class Exercise09 {
  public static void main(String[] args) {
    final double NUMBER_OF_PEOPLE = 10;

    Scanner scanner = new Scanner(System.in);

    int numberOf18PlusPeople = 0;

    for (int i = 0; i < NUMBER_OF_PEOPLE; i++) {
      int age = scanner.nextInt();

      if (age > 18) {
        numberOf18PlusPeople++;
      }
    }

    System.out.println("número de pessoas com mais de 18 anos: " + numberOf18PlusPeople);
  }
}
