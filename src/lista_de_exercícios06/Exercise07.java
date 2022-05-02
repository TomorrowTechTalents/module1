package lista_de_exercícios06;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigDecimal;

public class Exercise07 {
    public static void main(String[] args) {
        final int NUMBER_OF_CARS = 5;
        final BigDecimal FUEL_PRICE = new BigDecimal("7.25");

        Scanner scanner = new Scanner(System.in);

        List<String> carModels = new ArrayList<>(NUMBER_OF_CARS);
        List<Double> fuelEfficiency = new ArrayList<>(NUMBER_OF_CARS);

        System.out.println("Comparativo de Consumo de Combustível");
        System.out.println();

        for (int i = 0; i < NUMBER_OF_CARS; i++) {
            System.out.println("Veículo " + (i + 1));
            System.out.print("Nome: ");
            carModels.add(scanner.nextLine());
            System.out.print("Km por litro: " );
            fuelEfficiency.add(scanner.nextDouble());
            scanner.nextLine();
        }

        System.out.println();
        System.out.println("Relatório Final");

        for (int i = 0; i < NUMBER_OF_CARS; i++) {
            BigDecimal litersPer1000km = BigDecimal.valueOf(1000 / fuelEfficiency.get(i));

            System.out.printf(" %d - %-16s-%7.1f -", (i + 1), carModels.get(i).toLowerCase(), fuelEfficiency.get(i));
            System.out.printf("%7.1f litros - R$%7.2f%n", litersPer1000km, litersPer1000km.multiply(FUEL_PRICE));
        }

        double highestEfficiency = Collections.max(fuelEfficiency);
        String mostEconomicalCar = carModels.get(fuelEfficiency.indexOf(highestEfficiency));

        System.out.println("O menor consumo é do " + mostEconomicalCar.toLowerCase() + ".");
    }
}
