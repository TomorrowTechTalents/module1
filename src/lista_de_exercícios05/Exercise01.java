package lista_de_exercícios05;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise01 {
    public static void main(String[] args) {
        final BigDecimal DAYS_PER_YEAR = new BigDecimal("365.242");
        final BigDecimal CIGARETTES_PER_PACK = new BigDecimal("20");

        Scanner scanner = new Scanner(System.in);

        System.out.print("período de tempo fumando, em anos: ");
        BigDecimal timeSmokingInYears = scanner.nextBigDecimal();

        System.out.print("quantidade média aproximada de cigarros consumidos por dia: ");
        BigDecimal numberOfCigarettesPerDay = scanner.nextBigDecimal();

        System.out.print("preço de 1 carteira de 20 cigarros: ");
        BigDecimal cigarettesPackPrice = scanner.nextBigDecimal();

        BigDecimal timeSmokingInDays = timeSmokingInYears.multiply(DAYS_PER_YEAR);

        BigDecimal cigaretteUnitPrice = cigarettesPackPrice.
                                        divide(CIGARETTES_PER_PACK, 2, RoundingMode.HALF_EVEN);

        System.out.println("\ndinheiro gasto, aproximadamente: " + cigaretteUnitPrice.
                           multiply(numberOfCigarettesPerDay).multiply(timeSmokingInDays));
    }
}
