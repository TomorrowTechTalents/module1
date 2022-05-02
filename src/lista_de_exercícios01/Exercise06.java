package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Exercise06 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    final BigDecimal USD_RATE = new BigDecimal("4.70");
    final BigDecimal EUR_RATE = new BigDecimal("5.11");
    final BigDecimal GBP_RATE = new BigDecimal("6.12");

    Scanner scanner = new Scanner(System.in);

    System.out.print("valor em reais: R$ ");
    BigDecimal valueInBRL = scanner.nextBigDecimal();

    System.out.println();
    System.out.println("valor em dólares americanos: " + convertFromBRL(valueInBRL, USD_RATE, Locale.US));
    System.out.println("valor em euros: " + convertFromBRL(valueInBRL, EUR_RATE, Locale.forLanguageTag("pt-PT")));
    System.out.println("valor em libras esterlinas: " + convertFromBRL(valueInBRL, GBP_RATE, Locale.UK));
  }

  static String convertFromBRL(BigDecimal BRLValue, BigDecimal rate, Locale locale) {
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
    String convertedValue = currencyFormat.format(BRLValue.divide(rate, 2, RoundingMode.HALF_EVEN));
    return convertedValue;
  }
}
