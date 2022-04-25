package lista_de_exercícios04;

import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal gasolineLiterPrice = new BigDecimal("7.59");
        BigDecimal alcoholLiterPrice = new BigDecimal("5.20");
        BigDecimal discountThreshold = new BigDecimal("20");
        BigDecimal alcoholSmallerDiscount = new BigDecimal("0.03");
        BigDecimal alcoholLargerDiscount = new BigDecimal("0.05");
        BigDecimal gasolineSmallerDiscount = new BigDecimal("0.04");
        BigDecimal gasolineLargerDiscount = new BigDecimal("0.06");

        BigDecimal volumeInLiters = scanner.nextBigDecimal();
        char fuel = scanner.next().charAt(0);

        BigDecimal discount;
        BigDecimal fuelLiterPrice;

        if (fuel == 'A') {
            fuelLiterPrice = alcoholLiterPrice;

            if (volumeInLiters.compareTo(discountThreshold) <= 0) {
                discount = alcoholSmallerDiscount;
            } else {
                discount = alcoholLargerDiscount;
            }
        } else {
            fuelLiterPrice = gasolineLiterPrice;

            if ((volumeInLiters.compareTo(discountThreshold) <= 0)) {
                discount = gasolineSmallerDiscount;
            } else {
                discount = gasolineLargerDiscount;
            }
        }

        BigDecimal salePrice = volumeInLiters.multiply(fuelLiterPrice).
                               multiply(BigDecimal.ONE.subtract(discount));

        System.out.println(salePrice);
    }
}
