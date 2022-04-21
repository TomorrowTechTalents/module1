package lista_de_exercícios03;

import java.util.Scanner;

class Exercise01 {
  public static void main(String[] args) {
    final double passingAverage = 7;

    double average;
    final int NUMBER_OF_GRADES = 4;
    
    Scanner scanner = new Scanner(System.in);
    double sumOfGrades = 0;

    for(int i = 0; i < NUMBER_OF_GRADES; i++) {
      sumOfGrades += scanner.nextDouble();
    }

    average = calculateAverage(sumOfGrades, NUMBER_OF_GRADES);

    System.out.println(average >= passingAverage ? "Aluno/a foi aprovado/a." : "Aluno/a está de recuperação.");
  }

  static double calculateAverage(double sum, int quantityOfItens) {
    return Math.ceil(sum/quantityOfItens * 10) / 10;
  }  
}
