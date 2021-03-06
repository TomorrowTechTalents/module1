package lista_de_exercícios05;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contact[] contacts = new Contact[0];

        while (true) {
            System.out.println("escolha uma opção: ");
            System.out.println("1 > inserir um contato");
            System.out.println("2 > remover um contato");
            System.out.println("3 > listar contatos"); //findcontactbypersoncode para apagar?
            System.out.println("4 > sair");

            byte option = scanner.nextByte();
            scanner.nextLine();

            try {
                if (option == 1) {
                    System.out.print("código da pessoa: ");
                    String personCode = scanner.nextLine();

                    System.out.print("número de telefone: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("idade, em anos: ");
                    short age = scanner.nextShort();

                    Contact contact = new Contact(personCode, phoneNumber, age); // --> essas 4 linhas para um método chamado criar contato

                    contacts = Contact.addInArray(contact, contacts);
                } else if (option == 2) {
                    System.out.print("código da pessoa a ser removida: ");
                    String personCodeToBeRemoved = scanner.nextLine();

                    int indexToBeRemoved = Contact.findIndexToRemove(personCodeToBeRemoved, contacts); // --> get index to be removed? find by personcode?

                    if (indexToBeRemoved >= 0) {
                        contacts = Contact.removeFromArray(indexToBeRemoved, contacts);
                    } else {
                        throw new IllegalArgumentException("código de pessoa não encontrado");
                    }
                } else if (option == 3) {
                    Contact.printArray(contacts);
                } else if (option == 4) {
                    break;
                } else {
                    throw new IllegalArgumentException("opção inválida");
                }
            } catch (IllegalArgumentException exception) {
                // placeholder
            } finally {
                System.out.println("\n==========\n");
            }
        }
    }
}

class Contact {
    String personCode;
    String phoneNumber;
    short age;

    Contact(String personCode, String phoneNumber, short age) {
        this.personCode = personCode;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    static Contact[] addInArray(Contact contact, Contact[] contacts) {
        Contact[] newArray = new Contact[contacts.length + 1];

        System.arraycopy(contacts, 0, newArray, 0, contacts.length);

        newArray[contacts.length] = contact;

        System.out.println("Contato adicionado com sucesso!");

        return newArray;
    }

    static Contact[] removeFromArray(int indexToBeRemoved, Contact[] contacts) {
        Contact[] newArray = new Contact[contacts.length - 1];

        System.arraycopy(contacts, 0, newArray, 0, indexToBeRemoved);
        System.arraycopy(contacts, indexToBeRemoved + 1, newArray, indexToBeRemoved, contacts.length - indexToBeRemoved - 1);

        return newArray;
    }

    static int findIndexToRemove(String personCode, Contact[] contacts) { // talvez esse nao pertence aqui
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].personCode.equals(personCode)) { // equals?
                return i;
            }
        }

        return -1; //talvez uma constante not found
    }

    static void printArray(Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            System.out.print("contato #" + (i + 1) + ": ");
            System.out.print("código da pessoa - " + contacts[i].personCode + " | ");
            System.out.print("número de telefone - " + contacts[i].phoneNumber + " | ");
            System.out.println("idade - " + contacts[i].age + " ano(s)");
        }
    }
}
