package com.pluralsight.calcengine.finalRecap;

import com.pluralsight.calcengine.recap.Contact;
import com.pluralsight.calcengine.recap.MobilePhone;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhoneFinalRecap mobilePhone = new MobilePhoneFinalRecap();

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

    public static void store() {
        System.out.println("Enter name ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number ");
        String phoneNumber = scanner.nextLine();
//        Contact contact = Contact.createContact(name, phoneNumber);

        mobilePhone.store(name, phoneNumber);
    }

    public static void modify() {
        System.out.println("Enter old contact name ");
        String oldName = scanner.nextLine();

        System.out.println("Enter new contact name ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact phone number ");
        String phoneNumber = scanner.nextLine();


        if (mobilePhone.modify(oldName, name, phoneNumber)) {
            System.out.println("updated");
        }
    }

    public static void remove() {
        System.out.println("Enter contact name ");
        String name = scanner.nextLine();
//        Contact oldContact = mobilePhone.findContact(mobilePhone.findContact(name));
        int position = mobilePhone.findContact(name);
        if (position < 0) {
            System.out.println(name + " does not exist");
            return;
        }
        mobilePhone.remove(name);
    }

    public static void query() {
        System.out.println("Enter contact name ");
        String name = scanner.nextLine();

        if (mobilePhone.findContact(name) < 0) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println(mobilePhone.query(name));
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
