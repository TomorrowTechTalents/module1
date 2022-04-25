package lista_de_exercícios01;

import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    BigDecimal costPrice = scanner.nextBigDecimal();
    BigDecimal percentualIncrease = scanner.nextBigDecimal();

    System.out.println("valor de venda: R$ " + costPrice.multiply(percentualIncrease.add(BigDecimal.valueOf(1))));
  }
}
