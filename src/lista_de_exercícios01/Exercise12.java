package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Exercise12 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    System.out.print("preço de custo: R$ ");
    BigDecimal costPrice = scanner.nextBigDecimal();

    System.out.print("proporção de aumento: ");
    BigDecimal percentualIncrease = scanner.nextBigDecimal();

    BigDecimal sellingPrice = costPrice.multiply(percentualIncrease.add(BigDecimal.ONE));

    System.out.println("valor de venda: " + currencyFormat.format(sellingPrice));
  }
}
