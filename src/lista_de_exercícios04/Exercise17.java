package lista_de_exercícios04;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise17 {
    public static void main(String[] args) {
        final BigDecimal SALARY_THRESHOLD = new BigDecimal("150");

        Scanner scanner = new Scanner(System.in);

        BigDecimal salary;
        BigDecimal sumOfSalaries = BigDecimal.ZERO;
        BigDecimal highestSalary = new BigDecimal("-1");

        int population = 0;
        int numberOfLowIncomePeople = 0;

        short numberOfChildren;
        short sumOfChildren = 0;

        while (true) {
            salary = scanner.nextBigDecimal();

            if (salary.compareTo(BigDecimal.ZERO) < 0) {
                break;
            }

            sumOfSalaries = sumOfSalaries.add(salary);

            if (salary.compareTo(highestSalary) > 0) {
                highestSalary = salary;
            }

            if (salary.compareTo(SALARY_THRESHOLD) < 0) {
                numberOfLowIncomePeople++;
            }

            numberOfChildren = scanner.nextShort();

            sumOfChildren += numberOfChildren;

            population++;
        }

        System.out.println(sumOfSalaries.divide(BigDecimal.valueOf(population), 2, RoundingMode.HALF_EVEN));
        System.out.println(sumOfChildren / population);
        System.out.println(highestSalary);
        System.out.println(numberOfLowIncomePeople * 100 / population + "%");
    }
}
