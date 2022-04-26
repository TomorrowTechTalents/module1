package lista_de_exercícios01;

import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise03 {
  public static void main(String[] args) {
    final BigDecimal INTEREST_RATE = new BigDecimal("0.02");

    Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
    System.out.print("digite o valor inicial: ");
    BigDecimal startingAmount = scanner.nextBigDecimal();

    System.out.print("digite o número de meses: ");
    int numberOfMonths = scanner.nextInt();
=======
    System.out.print("valor inicial em reais: ");
    BigDecimal startingAmount = scanner.nextBigDecimal();
>>>>>>> origin/development

    System.out.print("digite um valor inteiro para o tempo em meses: ");
    int numberOfMonths = scanner.nextInt();

    BigDecimal totalInterest = (BigDecimal.ONE.add(INTEREST_RATE)).pow(numberOfMonths);

    BigDecimal finalAmount = startingAmount.multiply(totalInterest);

    System.out.println("valor final: R$ " + finalAmount);
  }
}
