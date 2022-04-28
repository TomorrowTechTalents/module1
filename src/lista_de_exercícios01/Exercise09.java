package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    System.out.print("nome do/a aluno/a: ");
    String name = scanner.nextLine();

    System.out.print("1ª nota: ");
    float grade1 = scanner.nextFloat();

    System.out.print("2ª nota: ");
    float grade2 = scanner.nextFloat();

    System.out.print("3ª nota: ");
    float grade3 = scanner.nextFloat();

    System.out.printf("média do/a aluno/a %s: %.1f\n", name, (grade1 + grade2 + grade3) / 3);
  }
}
