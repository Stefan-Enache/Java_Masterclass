package com.pluralsight.calcengine;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0722 555 223");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\nEnter action:(6 to show actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    store();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    query();
                    break;
                case 6:

                    printActions();
                    break;
            }
        }
    }

    private static void query() {
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts exitingContact = mobilePhone.queryContact(name);
        if (exitingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println(exitingContact.getName() + " : " + exitingContact.getPhoneNumber());

    }

    private static void remove() {
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts exitingContact = mobilePhone.queryContact(name);
        if (exitingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if (mobilePhone.removeContact(exitingContact)) {
            System.out.println("deleted");
        } else {
            System.out.println("error deleting");
        }
    }

    private static void modify() {
        System.out.println("Enter existing name");
        String name = scanner.nextLine();
        Contacts exitingContact = mobilePhone.queryContact(name);
        if (exitingContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newNr = scanner.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNr);
        if (mobilePhone.updateContact(exitingContact, newContact)) {
            System.out.println("Updated contact");
        } else {
            System.out.println("Update contact error");
        }

    }

    private static void store() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter phone nr");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("Added: " + name + " " + phone);
        } else {
            System.out.println("Cannot add " + name + " already on file");
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - shut down\n" +
                "1 - print contact\n" +
                "2 - add\n" +
                "3 - update existing contact\n" +
                "4 - remove existing contact\n" +
                "5 - query if contact exists\n" +
                "6 - print list of available actions");
        System.out.println("choose your action: ");
    }


}
