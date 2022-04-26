package lista_de_exercícios05;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte numberOfPositiveAnswers = 0;

        System.out.println("Telefonou para a vítima? [s|n]");
        if (scanner.next().charAt(0) == 's') {numberOfPositiveAnswers++;}

        System.out.println("Esteve no local do crime? [s|n]");
        if (scanner.next().charAt(0) == 's') {numberOfPositiveAnswers++;}

        System.out.println("Mora perto da vítima? [s|n]");
        if (scanner.next().charAt(0) == 's') {numberOfPositiveAnswers++;}

        System.out.println("Devia para a vítima? [s|n]");
        if (scanner.next().charAt(0) == 's') {numberOfPositiveAnswers++;}

        System.out.println("Já trabalhou com a vítima? [s|n]");
        if (scanner.next().charAt(0) == 's') {numberOfPositiveAnswers++;}

        String intervieweeStatus;

        System.out.println();

        try {
            switch (numberOfPositiveAnswers) {
                case 0:
                case 1:
                    return;
                case 2:
                    intervieweeStatus = "Suspeita";
                    break;
                case 3:
                case 4:
                    intervieweeStatus = "Cúmplice";
                    break;
                case 5:
                    intervieweeStatus = "Assassino";
                    break;
                default:
                    throw new RuntimeException();
            }
        } catch(RuntimeException exception) {
            System.out.println("Algo errado não está certo. Contate o administrador do sistema.");

            return;
        }

        System.out.println(intervieweeStatus);
    }
}
