package lista_de_exercícios05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        final byte NUMBER_OF_TRANSACTIONS = 4;
        final BigDecimal NUMBER_OF_INSTALLMENTS = new BigDecimal("3");

        Scanner scanner = new Scanner(System.in);

        boolean inInstallmentsSaleRegistered = false;
        BigDecimal sumOfValuesOfSalesInFull = BigDecimal.ZERO;
        BigDecimal sumOfValuesOfSalesInInstallments = BigDecimal.ZERO;

        BigDecimal[] installmentsValues = new BigDecimal[NUMBER_OF_TRANSACTIONS];

        for (int i = 0; i < NUMBER_OF_TRANSACTIONS; i++) {
            System.out.print("código da transação: ");
            char transactionCode = scanner.next().charAt(0);

            if (transactionCode == 'V') {            // enumerator
                System.out.print("valor da transação: R$ ");
                BigDecimal value = scanner.nextBigDecimal();

                sumOfValuesOfSalesInFull = sumOfValuesOfSalesInFull.add(value);
            } else if (transactionCode == 'P') {
                inInstallmentsSaleRegistered = true;

                System.out.print("valor original da transação: R$ ");

                BigDecimal originalValue = scanner.nextBigDecimal();

                installmentsValues[i] = originalValue.divide(NUMBER_OF_INSTALLMENTS, 2, RoundingMode.DOWN);

                sumOfValuesOfSalesInInstallments = sumOfValuesOfSalesInInstallments.
                                                   add(installmentsValues[i].multiply(NUMBER_OF_INSTALLMENTS));
            } else {
                throw new IllegalArgumentException("apenas códigos \"V\" e \"P\" são válidos");
            }

            System.out.println("==========");
        }

        BigDecimal totalSalesValue = sumOfValuesOfSalesInFull.add(sumOfValuesOfSalesInInstallments);

        System.out.println("valor total das compras à vista: " + sumOfValuesOfSalesInFull);
        System.out.println("valor total das compras a prazo: " + sumOfValuesOfSalesInInstallments);
        System.out.println("valor total das compras efetuadas: " + totalSalesValue);

        if (inInstallmentsSaleRegistered) {
            System.out.println("valor(es) da(s) prestação(ões) da(s) compra(s) a prazo: ");

            for (int i = 0; i < NUMBER_OF_TRANSACTIONS; i++) {
                if (installmentsValues[i] != null) {
                    System.out.println("compra " + i + ": " + installmentsValues[i]);
                }
            }
        }
    }
}
