package lista_de_exercícios03;

class Exercise03 {
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++) {
      System.out.print(i);

      if (i % 10 == 0) {
        System.out.print(" - Múltiplo de 10");
      }

    System.out.println();
    }
  }
}
