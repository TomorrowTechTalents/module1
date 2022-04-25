package lista_de_exercícios04;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short man1Age = scanner.nextShort();
        short man2Age = scanner.nextShort();
        short woman1Age = scanner.nextShort();
        short woman2Age = scanner.nextShort();

        short olderManAge;
        short youngerManAge;
        short olderWomanAge;
        short youngerWomanAge;

        if (man1Age > man2Age) {
            olderManAge = man1Age;
            youngerManAge = man2Age;
        } else {
            olderManAge = man2Age;
            youngerManAge = man1Age;
        }

        if (woman1Age > woman2Age) {
            olderWomanAge = woman1Age;
            youngerWomanAge = woman2Age;
        } else {
            olderWomanAge = woman2Age;
            youngerWomanAge = woman1Age;
        }

        System.out.println(olderManAge + youngerWomanAge);
        System.out.println(youngerManAge * olderWomanAge);
    }
}
