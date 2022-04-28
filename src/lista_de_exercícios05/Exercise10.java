package lista_de_exercícios05;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        final byte NUMBER_OF_SPECTATORS = 5;

        Scanner scanner = new Scanner(System.in);

        short sumOfAges = 0;
        byte numberOfAnswersGood = 0;
        byte numberOfAnswersGreat = 0;
        byte numberOfAnswersRegular = 0;

        for (int i = 0; i < NUMBER_OF_SPECTATORS; i++) {
            short age = scanner.nextShort();
            byte opinion = scanner.nextByte();

            if (opinion == 1) {
                numberOfAnswersRegular++;
            } else if (opinion == 2) {
                numberOfAnswersGood++;
            } else if (opinion == 3) {
                numberOfAnswersGreat++;

                sumOfAges += age;
            } else {
                throw new IllegalArgumentException("apenas \"1\", \"2\", \"3\" são opções válidas");
            }
        }

        System.out.println("média das idades das pessoas que responderam \"ótimo\": " +
                         (double) sumOfAges/numberOfAnswersGreat + " anos");
        System.out.println("quantidade de pessoas que respondeu \"regular\": " + numberOfAnswersRegular);
        System.out.println("percentagem de pessoas que respondeu \"bom\": " +
                           (double) numberOfAnswersGood / NUMBER_OF_SPECTATORS * 100 + "%");
    }
}
