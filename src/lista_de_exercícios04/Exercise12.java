package lista_de_exercícios04;

import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise12 {
    public static void main(String[] args) {
        final BigDecimal lowSalesPercentage = BigDecimal.valueOf(0.03);
        final BigDecimal goodSalesPercentage = BigDecimal.valueOf(0.05);
        final BigDecimal salesThreshold = BigDecimal.valueOf(1500);

        Scanner scanner = new Scanner(System.in);

        BigDecimal baseSalary = scanner.nextBigDecimal();
        BigDecimal valueOfSales = scanner.nextBigDecimal();

        BigDecimal totalSalary;

        if (valueOfSales.compareTo(salesThreshold) <= 0) {
            totalSalary = baseSalary.add(lowSalesPercentage.multiply(valueOfSales));
        } else {
            totalSalary = baseSalary.add(lowSalesPercentage.multiply(salesThreshold)).
                          add(goodSalesPercentage.multiply(valueOfSales.subtract(salesThreshold)));
        }

        System.out.println(totalSalary);
    }
}
