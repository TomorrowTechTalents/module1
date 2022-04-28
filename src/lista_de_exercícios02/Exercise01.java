package lista_de_exercícios02;

import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner (System.in);

    System.out.print("nome do aluno: ");
    String name = scanner.nextLine();

    System.out.print("turma do aluno: ");
    String schoolClass = scanner.nextLine();

    System.out.print("1ª nota do aluno: ");
    double grade1 = scanner.nextDouble();

    System.out.print("2ª nota do aluno: ");
    double grade2 = scanner.nextDouble();

    System.out.print("3ª nota do aluno: ");
    double grade3 = scanner.nextDouble();

    System.out.printf("média do aluno %s da turma %s: %.1f.\n", name, schoolClass, (grade1 + grade2 + grade3)/3);
  }
}
