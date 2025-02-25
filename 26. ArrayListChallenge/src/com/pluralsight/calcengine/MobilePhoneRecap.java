package com.pluralsight.calcengine;

import java.util.ArrayList;

public class MobilePhoneRecap {

    private ArrayList<ContactsRecap> contacts = new ArrayList<>();

    // Constructor
//    public MobilePhoneRecap() {
//        this.contacts = new ArrayList<>();
//    }


    public boolean add(ContactsRecap contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Already on file");
            return false;
        } else {
            contacts.add(contact);
            return true;
        }
    }


    public void printContacts() {
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println("Name: " + this.contacts.get(i).getName() + " | Phone number: "
                    + this.contacts.get(i).getPhoneNumber());
        }
    }


    public boolean modify(ContactsRecap oldContact, ContactsRecap newContact) {
        int position = findContact(oldContact);

////        reversed if else
//        if(position >= 0){
//            this.contacts.set(position, newContact);
//            return true;
//        }
//
//
//            System.out.println(oldContact.getName() + " was not found");
//            return false;


        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("already exists");
            return false;
        }

        this.contacts.set(position, newContact);
        return true;

    }

    public void remove(ContactsRecap contact) {
        int position = findContact(contact);
        if (position >= 0) {
            this.contacts.remove(position);
        }
    }

//    public boolean queryContact(ContactsRecap contact){
//        int position = findContact(contact);
//        if(position >= 0){
//            return true;
//        } return false;
//    }

    public ContactsRecap queryContact(String contact) {
        int position = findContact(contact);
        if (position >= 0) {
            return contacts.get(position);
        }
        return null;
    }

    public int findContact(ContactsRecap contact) {
        return this.contacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equals(contactName)) {
                return i;

            }
        }
        return -1;
    }

}
