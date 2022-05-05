package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Exercise03 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    final BigDecimal INTEREST_RATE = new BigDecimal("0.02");

    Scanner scanner = new Scanner(System.in);

    System.out.print("valor inicial em reais: ");
    BigDecimal startingAmount = scanner.nextBigDecimal();

    System.out.print("digite um valor inteiro para o tempo em meses: ");
    int numberOfMonths = scanner.nextInt();

    BigDecimal totalInterest = (BigDecimal.ONE.add(INTEREST_RATE)).pow(numberOfMonths);

    BigDecimal finalAmount = startingAmount.multiply(totalInterest);

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    System.out.println("valor final: " + currencyFormat.format(finalAmount));
  }
}
