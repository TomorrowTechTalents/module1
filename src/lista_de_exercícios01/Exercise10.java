package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Exercise10 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    System.out.println("valor, em reais: ");
    BigDecimal value = scanner.nextBigDecimal();

    final BigDecimal INTEREST_RATE = new BigDecimal("0.007");

    System.out.println("valor com rendimento após 1 mês: " + currencyFormat.format(value.multiply(INTEREST_RATE)));
  }
}
