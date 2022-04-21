package com.worksheet01;

import java.util.Scanner;
import java.math.BigDecimal;

class Exercise12 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    BigDecimal costPrice = scanner.nextBigDecimal();
    BigDecimal percentualIncrease = scanner.nextBigDecimal();

    System.out.println("valor de venda: R$ " + costPrice.multiply(percentualIncrease.add(BigDecimal.valueOf(1))));
  }
}
