package lista_de_exercícios01;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise10 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    Scanner scanner = new Scanner(System.in);

    BigDecimal value = scanner.nextBigDecimal();

    final float INTEREST_RATE = 1.007f;

    System.out.println("valor com rendimento após 1 mês: " + value.multiply(BigDecimal.valueOf(INTEREST_RATE)));
  }
}
