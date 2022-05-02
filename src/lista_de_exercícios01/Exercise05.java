package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Exercise05 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    final BigDecimal SALARY_ADJUSTMENT_RATE = new BigDecimal("1.07");

    Scanner scanner = new Scanner(System.in);

    System.out.print("digite o valor do salário: R$ ");
    BigDecimal salary = scanner.nextBigDecimal();

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    System.out.println("salário antes do reajuste: " + currencyFormat.format(salary));
    System.out.println("salário após o reajuste:   " + currencyFormat.format(salary.multiply(SALARY_ADJUSTMENT_RATE)));
  }
}
