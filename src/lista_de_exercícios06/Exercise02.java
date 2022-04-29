package lista_de_exercícios06;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise02 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        final double PAINT_LITER_COVERAGE = 3;
        final double PAINT_CAN_VOLUME = 18;
        final BigDecimal PAINT_CAN_PRICE = new BigDecimal("80");

        Scanner scanner = new Scanner(System.in);

        System.out.print("área a ser pintada, em m²: ");
        double area = scanner.nextDouble();

        double paintVolume = area/PAINT_LITER_COVERAGE;

        int numberOfPaintCans = (int) Math.ceil(paintVolume / PAINT_CAN_VOLUME);

        System.out.println("quantidade de latas de tinta a ser comprada: " + numberOfPaintCans);
        System.out.println("preço total: " + BigDecimal.valueOf(numberOfPaintCans).multiply(PAINT_CAN_PRICE));
    }
}
