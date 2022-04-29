package lista_de_exercícios06;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        final double PAINT_LITER_COVERAGE = 3;
        final double PAINT_CAN_VOLUME = 18;
        final BigDecimal PAINT_CAN_PRICE = new BigDecimal("80");

        Scanner scanner = new Scanner(System.in);

        double area = scanner.nextDouble();

        double paintVolume = area/PAINT_LITER_COVERAGE; // --> litro

        //.setRoundingMode(RoundingMode.UP)

//        DecimalFormat decimalFormat = new DecimalFormat("00");
//
//        decimalFormat.setRoundingMode(RoundingMode.CEILING);

        int numberOfPaintCans = (int) (paintVolume / PAINT_CAN_VOLUME);

        if (paintVolume/PAINT_CAN_VOLUME > numberOfPaintCans){
            numberOfPaintCans++;
        }

        System.out.println("quantidade de latas de tinta a ser comprada: " + numberOfPaintCans);
        System.out.println("preço total: " + BigDecimal.valueOf(numberOfPaintCans).multiply(PAINT_CAN_PRICE));
    }
}
