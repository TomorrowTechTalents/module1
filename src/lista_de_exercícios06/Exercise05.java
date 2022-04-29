package lista_de_exercícios06;

import java.util.Locale;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Scanner scanner = new Scanner(System.in);

        double height = scanner.nextDouble();

        System.out.println("peso ideal para homens: " + getIdealWeightForMen(height));
        System.out.println("peso ideal para mulheres: " + getIdealWeightForWomen(height));
    }

    static double getIdealWeightForMen(double height) {
        return (72.7 * height) - 58;
    }

    static double getIdealWeightForWomen(double height) {
        return (62.1 * height) - 44.7;
    }
}
