package lista_de_exercícios05;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Contact[] contacts = new Contact[0];

        while (true) {
            System.out.println("escolha uma opção: ");
            System.out.println("1 > inserir um contato");
            System.out.println("2 > remover um contato");
            System.out.println("3 > listar contatos");
            System.out.println("4 > sair");

            byte option = scanner.nextByte();
            scanner.nextLine();

            if (option == 1) {
                System.out.print("código da pessoa: ");
                String personCode = scanner.nextLine();

                System.out.print("número de telefone: ");
                String phoneNumber = scanner.nextLine();

                System.out.print("idade: ");
                short age = scanner.nextShort(); // ver se precisa do scanner.nextLine em branco para o \n

                Contact contact = new Contact(personCode, phoneNumber, age); // -> essas 4 linhas para um metodo chamado criar contato

                contacts = Contact.add(contact, contacts);
            } else if (option == 2) {
                System.out.print("código da pessoa a ser removida: ");
                String personCodeToBeRemoved = scanner.nextLine();

                int indexToBeRemoved = Contact.findIndexToRemove(personCodeToBeRemoved, contacts);

                if (indexToBeRemoved >= 0) {
                    contacts = Contact.remove(indexToBeRemoved, contacts);
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IllegalArgumentException();
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

    static Contact[] add(Contact contact, Contact[] contacts) {
        Contact [] newArray = new Contact[contacts.length + 1];

        System.arraycopy(contacts, 0, newArray, 0, contacts.length);

        newArray[contacts.length] = contact;

        return newArray;
    }

    static Contact[] remove(int indexToBeRemoved, Contact[] contacts) {
        Contact[] newArray = new Contact[contacts.length - 1];

        System.arraycopy(contacts, 0, newArray, 0, indexToBeRemoved);
        System.arraycopy(contacts, indexToBeRemoved + 1, newArray, indexToBeRemoved, contacts.length - indexToBeRemoved - 1);

        return newArray;
    }

    static int findIndexToRemove(String personCode, Contact[] contacts) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i].personCode.equals(personCode)) { // equals?
                return i;
            }
        }

        return -1; //talvez uma constante not found
    }
}
