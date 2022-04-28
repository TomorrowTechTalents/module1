package lista_de_exercícios02;

import java.util.Locale;
import java.util.Scanner;

class Beach {
  public String name;
  public double distance;

  Beach(String name, double distance) {
    this.name = name;
    this.distance = distance;
  }
}

public class Exercise04 {
  public static void main(String[] args) {
    Locale.setDefault(new Locale("pt", "BR"));

    final int NUMBER_OF_BEACHES = 5;
    final double LOWER_BOUND_DISTANCE = 10;
    final double UPPER_BOUND_DISTANCE = 15;
    
    Scanner scanner = new Scanner (System.in);

    Beach[] beaches = new Beach[NUMBER_OF_BEACHES];

    String name;
    double distance;
    double sumOfDistances = 0;

    for (int i = 0; i < NUMBER_OF_BEACHES; i++) {
      System.out.print("nome da praia: ");
      name = scanner.nextLine();
      System.out.print("distância, em km: ");
      distance = scanner.nextDouble();
      scanner.nextLine();

      beaches[i] = new Beach(name, distance);

      sumOfDistances += distance;
    }

    System.out.println("praia mais distante: " + findMostDistantBeach(beaches, NUMBER_OF_BEACHES).name);

    System.out.println("há "+ findBeachesInRange(beaches, NUMBER_OF_BEACHES, LOWER_BOUND_DISTANCE, UPPER_BOUND_DISTANCE).length + " praia(s) a mais de " + LOWER_BOUND_DISTANCE + " km e menos de " + UPPER_BOUND_DISTANCE + " km de distância");

    System.out.println("média das distâncias das praias: " + sumOfDistances / NUMBER_OF_BEACHES + " km");
  }

  static Beach findMostDistantBeach(Beach[] beaches, int numberOfBeaches) {
    double maximumDistance = 0;
    Beach mostDistantBeach = beaches[0];

    for (int i = 0; i < numberOfBeaches; i++) {
      if (beaches[i].distance > maximumDistance) {
        maximumDistance = beaches[i].distance;
        mostDistantBeach = beaches[i];
      }
    }

    return mostDistantBeach;
  }

  static Beach[] findBeachesInRange(Beach[] beaches, int numberOfBeaches,
                                  double lowerBoundDistance, double upperBoundDistance) {
    Beach[] beachesInRange = new Beach[0];

    for (int i = 0; i < numberOfBeaches; i++) {
      if (beaches[i].distance > lowerBoundDistance && beaches[i].distance < upperBoundDistance)
        beachesInRange = addBeachInArray(beaches[i], beachesInRange);
    }

    return beachesInRange;
  }

  static Beach[] addBeachInArray(Beach beach, Beach[] beachesInRange) {
    Beach[] newArray = new Beach[beachesInRange.length + 1];

    System.arraycopy(beachesInRange, 0, newArray, 0, beachesInRange.length);

    newArray[beachesInRange.length] = beach;

    return newArray;
  }  
}
