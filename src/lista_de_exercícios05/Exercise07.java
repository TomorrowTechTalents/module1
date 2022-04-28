package lista_de_exercícios05;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {                   //constant
            char transactionCode = scanner.next().charAt(0);
            BigDecimal originalValue = scanner.nextBigDecimal();

            BigDecimal sumOfValuesOfSalesInFull = BigDecimal.ZERO;
            BigDecimal sumOfValuesOfSalesInInstallments = BigDecimal.ZERO;

            if (transactionCode == 'V') {            // constant
               // sumOfSalesInFullValues += originalValue;
            } else if (transactionCode == 'P') {
                //sumOfSalesInInstallmentsValues =
            } else {
                throw new IllegalArgumentException("apenas códigos \"V\" e \"P\" são válidos");
            }
        }
    }
}
