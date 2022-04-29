package lista_de_exercícios06;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise01 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        final byte NUMBER_OF_JUMPS = 5;
        final byte NUMBER_OF_VALID_JUMPS = 3;

        Scanner scanner = new Scanner(System.in);

        List<Double> jumps = new ArrayList<>(5);

        while (true) {
            jumps.clear();
            String name = scanner.nextLine();

            if (name == null || name.isEmpty()) {
                break;
            }

            for (int i = 0; i < NUMBER_OF_JUMPS; i++) {
                double jump = scanner.nextDouble();
                scanner.nextLine();

                jumps.add(jump);
            }

            double jumpsSeriesResult = (jumps.get(0) + jumps.get(1) + jumps.get(2) + jumps.get(3) + jumps.get(4) -
                                        Collections.max(jumps) - Collections.min(jumps)) / NUMBER_OF_VALID_JUMPS;

            System.out.println();
            System.out.println("Atleta: " + name);
            System.out.println();
            System.out.println("Primeiro Salto: " + jumps.get(0) + " m");
            System.out.println("Segundo Salto: " + jumps.get(1) + " m");
            System.out.println("Terceiro Salto: " + jumps.get(2) + " m");
            System.out.println("Quarto Salto: " + jumps.get(3) + " m");
            System.out.println("Quinto Salto: " + jumps.get(4) + " m");
            System.out.println();
            System.out.println("Melhor salto: " + Collections.max(jumps) + " m");
            System.out.println("Pior Salto: " + Collections.min(jumps) + " m");
            System.out.println();
            System.out.println("Média dos demais saltos: " + jumpsSeriesResult + " m");
            System.out.println();
            System.out.println("Resultado final:");
            System.out.println(name + ": " + jumpsSeriesResult + " m");
            System.out.println();
        }
    }
}
