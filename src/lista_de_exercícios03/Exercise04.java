package lista_de_exercícios03;

import java.util.Scanner;

class Exercise04 {
  public static void main(String[] args) {
    final int QUANTITY_OF_NUMBERS = 5;

    Scanner scanner = new Scanner(System.in);

    int[] numbers = new int[QUANTITY_OF_NUMBERS];

    for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
      numbers[i] = scanner.nextInt();      
    }

    sort(numbers, QUANTITY_OF_NUMBERS);

    for (int i = 0; i < QUANTITY_OF_NUMBERS; i++) {
      System.out.println(numbers[i]);
    }
  }

  static void sort(int[] array, int size) {
    int auxNumber;
    boolean isSorted = false;

    while (isSorted == false) {
      isSorted = true;

      for (int i = 0; i < size - 1; i++) {
        if (array[i + 1] > array[i]) {
          auxNumber = array[i];
          array[i] = array[i + 1];
          array[i + 1] = auxNumber;
          isSorted = false;
        }
      }
    }
  }  
}
