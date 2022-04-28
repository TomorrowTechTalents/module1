package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;

public class Exercise09 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    String name = scanner.nextLine();
    float grade1 = scanner.nextFloat();
    float grade2 = scanner.nextFloat();
    float grade3 = scanner.nextFloat();

    System.out.println("média do aluno/a " + name + ": " + (grade1 + grade2 + grade3) / 3);
  }
}
