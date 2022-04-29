package lista_de_exercícios06;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        final short NUMBER_OF_CITIES = 5;
        final int NUMBER_OF_VEHICLES_THRESHOLD = 2000;

        Scanner scanner = new Scanner(System.in);

        double highestAccidentsRate = -1;
        double lowestAccidentsRate = Double.MAX_VALUE;
        String highestRateCity = "";
        String lowestRateCity = "";
        int totalNumberOfVehicles = 0;
        short numberOfSmallCities = 0;
        int numberOfAccidentsInSmallCities = 0;

        for (int i = 0; i < NUMBER_OF_CITIES; i++) {
            System.out.print("código da cidade: ");
            String cityCode = scanner.nextLine();

            System.out.print("número de veículos de passeio: ");
            int numberOfVehicles = scanner.nextInt();

            System.out.print("número de acidentes de trânsito com vítimas: ");
            int numberOfAccidents = scanner.nextInt();
            scanner.nextLine();

            double accidentsRate = (double) numberOfAccidents / numberOfVehicles;

            if (accidentsRate > highestAccidentsRate) {
                highestAccidentsRate = accidentsRate;

                highestRateCity = cityCode;
            }

            if (accidentsRate < lowestAccidentsRate) {
                lowestAccidentsRate = accidentsRate;

                lowestRateCity = cityCode;
            }

            totalNumberOfVehicles += numberOfVehicles;

            if (numberOfVehicles < NUMBER_OF_VEHICLES_THRESHOLD) {
                numberOfSmallCities++;

                numberOfAccidentsInSmallCities += numberOfAccidents;
            }

            System.out.println("==========");
        }

        System.out.println("maior índice de acidentes de trânsito: " + highestAccidentsRate + " acidentes/veículo de passeio");
        System.out.println("código da cidade com o maior índice de acidentes de trânsito: " + highestRateCity);
        System.out.println("menor índice de acidentes fatais de trânsito: " + lowestAccidentsRate + " acidentes/veículo de passeio");
        System.out.println("código da cidade com o menor índice de acidentes de trânsito: " + lowestRateCity);
        System.out.println("média de veículos nas cidades juntas: " + (double) totalNumberOfVehicles / NUMBER_OF_CITIES + " veículos de passeio/cidade");

        if (numberOfSmallCities > 0) {
            System.out.println("média dos números de acidentes de trânsito das cidades com menos de 2.000 veículos de passeio: " + (double) numberOfAccidentsInSmallCities / numberOfSmallCities + " acidentes/cidade");
        }
    }
}
