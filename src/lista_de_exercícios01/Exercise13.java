package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Exercise13 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    System.out.print("preço de custo: ");
    BigDecimal costPrice = scanner.nextBigDecimal();

    BigDecimal sellerPercentual = new BigDecimal("0.28");
    BigDecimal taxesPercentual = new BigDecimal("0.45");

    BigDecimal factoryPercentual = BigDecimal.ONE.subtract(sellerPercentual).subtract(taxesPercentual);
    BigDecimal sellingPrice = costPrice.divide(factoryPercentual, 2, RoundingMode.HALF_EVEN);

    System.out.println("preço de venda: " + currencyFormat.format(sellingPrice));
  }
}
