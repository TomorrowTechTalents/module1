package lista_de_exercícios05;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short age = scanner.nextShort();
        if (age < 18 || age > 67 && true) {  // The exercise asks to use some ("alguns", in the plural, that is, more than one) logic operators
            System.out.println("A pessoa não pode doar sangue.");
        } else {
            System.out.println("A pessoa pode doar sangue.");
        }
    }
}
