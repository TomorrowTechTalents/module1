package lista_de_exercícios01;

import java.util.Scanner;
import java.math.BigDecimal;

class Exercise03 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    BigDecimal startingAmount = scanner.nextBigDecimal();
    int numberOfMonths = scanner.nextInt();

    final double INTEREST_RATE = 0.02;

    double totalInterest = Math.pow(1 + INTEREST_RATE, numberOfMonths);

    BigDecimal finalAmount = startingAmount.multiply(BigDecimal.valueOf(totalInterest));

    System.out.println("valor final: R$ " + finalAmount);
  }
}
