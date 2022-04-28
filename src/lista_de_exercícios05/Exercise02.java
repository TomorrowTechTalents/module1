package lista_de_exercícios05;

import java.util.Locale;
import java.util.Scanner;
import java.math.BigDecimal;

public class Exercise02 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        final BigDecimal LOW_SALARY_THRESHOLD = new BigDecimal("900");
        final BigDecimal MEDIUM_SALARY_THRESHOLD = new BigDecimal("1500");
        final BigDecimal HIGH_SALARY_THRESHOLD = new BigDecimal("2500");
        final BigDecimal SMALLER_INCOME_TAX_PERCENTAGE = new BigDecimal("0.05");
        final BigDecimal MEDIUM_INCOME_TAX_PERCENTAGE = new BigDecimal("0.10");
        final BigDecimal LARGER_INCOME_TAX_PERCENTAGE = new BigDecimal("0.20");
        final BigDecimal UNION_DUES_PERCENTAGE = new BigDecimal("0.03");
        final BigDecimal FGTS_PERCENTAGE = new BigDecimal("0.11");

        Scanner scanner = new Scanner(System.in);

        System.out.print("valor da hora trabalhada: R$ ");
        BigDecimal wagePerHour = scanner.nextBigDecimal();

        System.out.print("horas trabalhadas por mês: ");
        BigDecimal workedHoursPerMonth = scanner.nextBigDecimal();

        BigDecimal grossSalary = wagePerHour.multiply(workedHoursPerMonth);

        BigDecimal incomeTax;

        if (grossSalary.compareTo(LOW_SALARY_THRESHOLD) <= 0) {
            incomeTax = BigDecimal.ZERO;
        } else if (grossSalary.compareTo(MEDIUM_SALARY_THRESHOLD) <= 0) {
            incomeTax = grossSalary.multiply(SMALLER_INCOME_TAX_PERCENTAGE);
        } else if (grossSalary.compareTo(HIGH_SALARY_THRESHOLD) <= 0) {
            incomeTax = grossSalary.multiply(MEDIUM_INCOME_TAX_PERCENTAGE);
        } else {
            incomeTax = grossSalary.multiply(LARGER_INCOME_TAX_PERCENTAGE);
        }

        BigDecimal unionDues = grossSalary.multiply(UNION_DUES_PERCENTAGE);
        BigDecimal FGTS = grossSalary.multiply(FGTS_PERCENTAGE);
        BigDecimal discounts = incomeTax.add(unionDues);
        BigDecimal netSalary = grossSalary.subtract(discounts);

        System.out.println();
        System.out.println("valor do Imposto de Renda:\t" + incomeTax);
        System.out.println("salário mensal bruto:\t\t" + grossSalary);
        System.out.println("contribuição sindical:\t\t" + unionDues);
        System.out.println("valor do FGTS:\t\t\t\t" + FGTS);
        System.out.println("salário mensal líquido:\t\t" + netSalary);
        System.out.println("valor descontado do salário mensal bruto: " + discounts);
    }
}
