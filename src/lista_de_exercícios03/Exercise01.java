package lista_de_exercícios03;

import java.util.Locale;
import java.util.Scanner;

class Exercise01 {
  public static void main(String[] args) {
    // mistério fantasmagórico
    System.out.println(Locale.getDefault());
    Locale.setDefault(new Locale("pt", "BR"));
    System.out.println(Locale.getDefault());

    final double PASSING_AVERAGE = 7;

    double average;
    final int NUMBER_OF_GRADES = 4;
    
    Scanner scanner = new Scanner(System.in);
    double sumOfGrades = 0;

    for(int i = 0; i < NUMBER_OF_GRADES; i++) {
      sumOfGrades += scanner.nextDouble();
    }

    average = calculateAverage(sumOfGrades, NUMBER_OF_GRADES);

    System.out.println(average >= PASSING_AVERAGE ? "Aluno/a foi aprovado/a." : "Aluno/a está de recuperação.");
  }

  static double calculateAverage(double sum, int quantityOfItens) {
    return Math.ceil(sum/quantityOfItens * 10) / 10;
  }  
}
