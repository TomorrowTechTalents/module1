package lista_de_exercícios06;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class Exercise03 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        final BigDecimal CATCH_LIMIT_IN_KG = new BigDecimal("50");
        final BigDecimal OVERFISHING_FINE_PER_KG = new BigDecimal("4");

        Scanner scanner = new Scanner(System.in);

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.print("quantidade de peixe pescado, em kg: ");
        BigDecimal peso = scanner.nextBigDecimal();

        BigDecimal excesso = BigDecimal.ZERO;

        if (peso.compareTo(CATCH_LIMIT_IN_KG) > 0) {
            excesso = peso.subtract(CATCH_LIMIT_IN_KG);
        }

        System.out.println("quantidade de peixe pescado: " + peso + " kg");
        System.out.println("excedente de peixe pescado: " + excesso + " kg");

        BigDecimal multa = excesso.multiply(OVERFISHING_FINE_PER_KG);

        if (multa.compareTo(BigDecimal.valueOf(0.01)) > 0) {
            System.out.println("multa a ser paga: " + currencyFormat.format(multa));
        } else {
            System.out.println("não há multa a ser paga");
        }
    }
}
