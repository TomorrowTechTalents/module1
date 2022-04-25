package lista_de_exercícios01;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigDecimal totalValue = scanner.nextBigDecimal();

    final int NUMBER_OF_INSTALLMENTS = 5;

    System.out.println("valor total: R$ " + totalValue);
    System.out.println("valor de cada prestação: R$ " + totalValue.divide(BigDecimal.valueOf(NUMBER_OF_INSTALLMENTS), 2, RoundingMode.HALF_EVEN));
  }
}
