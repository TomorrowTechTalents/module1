package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Exercise11 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    System.out.println("valor original: R$ ");
    BigDecimal totalValue = scanner.nextBigDecimal();

    final BigDecimal NUMBER_OF_INSTALLMENTS = new BigDecimal("5");

    BigDecimal installmentPrice = totalValue.divide(NUMBER_OF_INSTALLMENTS, 2, RoundingMode.DOWN);

    System.out.println("valor total: " + currencyFormat.format(installmentPrice.multiply(NUMBER_OF_INSTALLMENTS)));
    System.out.println("valor de cada prestação: " + currencyFormat.format(installmentPrice));
  }
}
