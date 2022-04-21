package com.worksheet03;

import java.util.Scanner;
import java.math.BigDecimal;

class Exercise12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      String name = scanner.nextLine();

      try {
        if (name.length() <= 3) {
          throw new IllegalArgumentException();
        } else {
          break;
        }
      } catch (IllegalArgumentException exception) {
        System.out.println("O nome precisa ter mais de 3 caracteres.");
      }
    }

    while (true) {
      int age = scanner.nextInt();

      try {
        if (age < 0 || age > 150) {
          throw new IllegalArgumentException();
        } else {
          break;
        }
      } catch (IllegalArgumentException exception) {
        System.out.println("A idade precisa estar entre 0 e 150.");
      }
    }

    while (true) {
      BigDecimal salary = scanner.nextBigDecimal();

      try {
        if (salary.signum() <= 0) {
          throw new IllegalArgumentException();
        } else {
          break;
        }
      } catch (IllegalArgumentException exception) {
        System.out.println("O salário precisa ser maior do que 0.");
      }
    }

    while (true) {
      char sex = scanner.next().charAt(0);

      try {
        if (sex != 'f' && sex != 'm') {
          throw new IllegalArgumentException();
        } else {
          break;
        }
      } catch (IllegalArgumentException exception) {
        System.out.println("O sexo precisa ser ou \"f\" ou \"m\".");
      }
    }

    while (true) {
      char civilStatus = scanner.next().charAt(0);

      try {
        switch (civilStatus) {
          case 's':
          case 'c':
          case 'v':
          case 'd':
            break;
          default:
            throw new IllegalArgumentException();
        }
      } catch (IllegalArgumentException exception) {
        System.out.println("O estado civil precisa ser " +
                "ou \"s\", ou \"c\", ou \"v\", ou \"d\".");

        continue;
      }

      break;
    }
  }
}
