package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise05 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    System.out.print("digite o valor do salário: ");
    BigDecimal salary = scanner.nextBigDecimal();

    System.out.println("salário antes do reajuste: R$ " + salary);
    System.out.println("salário após o reajuste: R$ " + salary.multiply(BigDecimal.valueOf(1.07)));
  }
}
