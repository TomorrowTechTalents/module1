package lista_de_exercícios01;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise06 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigDecimal valueInBRL = scanner.nextBigDecimal();

    BigDecimal USDRate = new BigDecimal("4.70");
    BigDecimal EURRate = new BigDecimal("5.11");
    BigDecimal GBPRate = new BigDecimal("6.12");

    System.out.println("valor em dólares americanos: $ " + valueInBRL.divide(USDRate, 2, RoundingMode.HALF_EVEN);
    System.out.println("valor em euros: € " + valueInBRL.divide(EURRate, 2, RoundingMode.HALF_EVEN));
    System.out.println("valor em libras esterlinas: £ " + valueInBRL.divide(GBPRate, 2, RoundingMode.HALF_EVEN));
  }
}
