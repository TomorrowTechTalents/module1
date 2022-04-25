package lista_de_exercícios03;

import java.util.Scanner;

public class Exercise05 {
  public static void main(String[] args) {
    double LOWER_THRESHOLD = 18.5;
    double MIDDLE_THRESHOLD = 25.0;
    double HIGHER_THRESHOLD = 30.0;

    Scanner scanner = new Scanner(System.in);
    double mass = scanner.nextDouble();
    double height = scanner.nextDouble();

    double IMC = mass / (height * height);

    if (IMC < LOWER_THRESHOLD) {
      System.out.println("Pessoa abaixo do peso.");      
    } else if (IMC < MIDDLE_THRESHOLD) {
      System.out.println("Pessoa com peso normal.");      
    } else if (IMC < HIGHER_THRESHOLD) {
      System.out.println("Pessoa com excesso de peso.");
    } else {
      System.out.println("Pessoa obesa.");   
    }
  }
}
