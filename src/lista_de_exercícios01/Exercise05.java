package com.worksheet01;

import java.util.Scanner;
import java.math.BigDecimal;

class Exercise05 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    BigDecimal salary = scanner.nextBigDecimal();

    System.out.println("salário antes do reajuste: R$ " + salary);
    System.out.println("salário após o reajuste: R$ " + salary.multiply(BigDecimal.valueOf(1.07)));
  }
}
