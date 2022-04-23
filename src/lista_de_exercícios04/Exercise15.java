package lista_de_exercícios04;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantityOfProducts = scanner.nextInt();

        Product[] products = new Product[quantityOfProducts];

        for (int i = 0; i < quantityOfProducts; i++) {
            String name = scanner.nextLine();
            scanner.nextLine();
            int numberOfGoods = scanner.nextInt();
            BigDecimal unitPrice = scanner.nextBigDecimal();

            products[i] = new Product(name, numberOfGoods, unitPrice);
        }


        BigDecimal sumOfAllPrices = BigDecimal.ZERO;

        for (int i = 0; i < quantityOfProducts; i++) {
            sumOfAllPrices = sumOfAllPrices.add(products[i].priceOfAllUnits);
        }

        BigDecimal sumOfUnitPrices = BigDecimal.ZERO;

        for (int i = 0; i < quantityOfProducts; i++) {
            sumOfUnitPrices = sumOfUnitPrices.add(products[i].unitPrice);
        }

        System.out.println(sumOfAllPrices);
        System.out.println(sumOfUnitPrices.divide
                           (BigDecimal.valueOf(quantityOfProducts), 2, RoundingMode.HALF_EVEN));
    }
}

class Product {
    public String name;
    public int numberOfGoods;
    public BigDecimal unitPrice;
    public BigDecimal priceOfAllUnits;

    Product(String name, int numberOfGoods, BigDecimal unitPrice) {
        this.name = name;
        this.numberOfGoods = numberOfGoods;
        this.unitPrice = unitPrice;
        this.priceOfAllUnits = BigDecimal.valueOf(this.numberOfGoods).multiply(this.unitPrice);
    }
}
