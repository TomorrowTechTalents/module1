package lista_de_exercícios06;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise06 {
    static final double PAINT_CAN_VOLUME = 18;
    static final double PAINT_GALLON_VOLUME = 3.6;

    public static void main(String[] args) {
        final double PAINT_LITER_COVERAGE = 6;

        Locale.setDefault(new Locale("pt", "BR"));

        final BigDecimal PAINT_CAN_PRICE = new BigDecimal("80");
        final BigDecimal PAINT_GALLON_PRICE = new BigDecimal("25");

        Scanner scanner = new Scanner(System.in);

        System.out.print("área a ser pintada, em m²: ");
        double area = scanner.nextDouble();

        double paintVolume = area / PAINT_LITER_COVERAGE;

        int numberOfPaintCans = (int) Math.ceil(paintVolume / PAINT_CAN_VOLUME);

        System.out.println("situação em que compram-se apenas latas de 18 litros:");
        System.out.println(" - quantidade de tinta a ser comprada: " + numberOfPaintCans * PAINT_CAN_VOLUME + " L");
        System.out.println(" - preço: " + BigDecimal.valueOf(numberOfPaintCans).multiply(PAINT_CAN_PRICE));

        System.out.println("----------");

        int numberOfPaintGallons = (int) Math.ceil(paintVolume / PAINT_GALLON_VOLUME);

        System.out.println("situação em que compram-se apenas galões de 3,6 litros:");
        System.out.println(" - quantidade de tinta a ser comprada: " + numberOfPaintGallons * PAINT_GALLON_VOLUME + " L");
        System.out.println(" - preço: " + BigDecimal.valueOf(numberOfPaintGallons).multiply(PAINT_GALLON_PRICE));
    }
}
