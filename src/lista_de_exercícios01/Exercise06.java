package lista_de_exercícios01;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Exercise06 {
  public static void main() {    
    Scanner scanner = new Scanner(System.in);

    BigDecimal valueInBRL = scanner.nextBigDecimal();

    float USDRate = 4.70f;
    float EURRate = 5.11f;
    float GBPRate = 6.12f;

    System.out.println("valor em dólares americanos: $ " + valueInBRL.divide(BigDecimal.valueOf(USDRate), 2, RoundingMode.HALF_EVEN));
    System.out.println("valor em euros: € " + valueInBRL.divide(BigDecimal.valueOf(EURRate), 2, RoundingMode.HALF_EVEN));
    System.out.println("valor em libras esterlinas: £ " + valueInBRL.divide(BigDecimal.valueOf(GBPRate), 2, RoundingMode.HALF_EVEN));
  }
}
