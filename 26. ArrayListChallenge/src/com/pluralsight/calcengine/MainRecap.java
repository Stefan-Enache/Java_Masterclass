package com.pluralsight.calcengine;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRecap {

    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhoneRecap mobilePhone = new MobilePhoneRecap();

    public static void main(String[] args) {
        boolean quit = false;


        while (!quit) {
            printActions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
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

    public static void store() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.add(new ContactsRecap(name, phoneNumber));
    }

    public static void modify() {
        System.out.println("Enter old contact: ");
        String oldContact = scanner.nextLine();
        ContactsRecap old = mobilePhone.queryContact(oldContact);
        int oldContactPosition = mobilePhone.findContact(old);

        if (oldContactPosition < 0) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter number: ");
            String phoneNumber = scanner.nextLine();
            mobilePhone.modify(old, new ContactsRecap(name, phoneNumber));
        }
    }

    public static void remove() {
        System.out.println("Enter old contact: ");
        String oldContact = scanner.nextLine();
        ContactsRecap old = mobilePhone.queryContact(oldContact);

        mobilePhone.remove(old);
    }

    public static void query() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        ContactsRecap foundContact = mobilePhone.queryContact(name);

        if (foundContact != null) {
            System.out.println(name + " : " + foundContact.getPhoneNumber());
        } else {
            System.out.println(name + " missing");
        }
    }
}
