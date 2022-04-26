package lista_de_exercícios05;

import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise04 {
    public static void main(String[] args) {
        final double LOWER_OVERSPEED = 10;
        final double MEDIUMLOW_OVERSPEED = 11;
        final double MEDIUMLARGE_OVERSPEED = 30;
        final double LARGER_OVERSPEED = 31;
        final BigDecimal LOWER_FINE = new BigDecimal("50");
        final BigDecimal MEDIUM_FINE = new BigDecimal("100");
        final BigDecimal LARGER_FINE = new BigDecimal("200");


        Scanner scanner = new Scanner(System.in);

        System.out.print("valor do limite de velocidade em km/h: ");
        double speedLimit = scanner.nextDouble();

        System.out.print("valor da velocidade registrada, em km/h: ");
        double drivingSpeed = scanner.nextDouble();

        double overspeed = drivingSpeed - speedLimit;

        BigDecimal fine;

        try {
            if (overspeed <= 0) {
                System.out.println("sem multa");

                return;
            } else if (overspeed <= LOWER_OVERSPEED) {
                fine = LOWER_FINE;
            } else if (overspeed >= MEDIUMLOW_OVERSPEED && overspeed <= MEDIUMLARGE_OVERSPEED) {
                fine = MEDIUM_FINE;
            } else if (overspeed >= LARGER_OVERSPEED) {
                fine = LARGER_FINE;
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException exception) {
            fine = BigDecimal.ZERO;
        }

        System.out.println();
        System.out.println("valor da multa: " + fine);
    }
}
