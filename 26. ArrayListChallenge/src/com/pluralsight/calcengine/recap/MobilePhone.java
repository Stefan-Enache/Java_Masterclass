package com.pluralsight.calcengine.recap;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contact> myContacts = new ArrayList<>();


    public void printContacts() {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
        }
    }


    public boolean store(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Already exists");
            return false;
        }

        this.myContacts.add(contact);
        return true;
    }

    public boolean modify(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        Contact contact = findContact(position);
        if (findContact(contact.getName()) < 0) {
            System.out.println(oldContact.getName() + " does not exist");
            return false;
        } else if (findContact(newContact.getName()) >= 0) {
            System.out.println(newContact.getName() + " already in list");
            return false;
        }


        this.myContacts.set(position, newContact);
        return true;
    }

    public boolean remove(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName() + " does not exist");
            return false;
        }

        this.myContacts.remove(position);
        return true;
    }

//    public Contact queryContact(String name){
//        for (int i = 0; i < this.myContacts.size(); i++) {
//            if (name.equals(this.myContacts.get(i).getName())) {
//                return i;
//            }
//        }
//        return contact;
//    }

    public void queryContact(String name) {
        int foundContactPosition = findContact(name);
        System.out.println("Found contact " + myContacts.get(foundContactPosition).getName() +
                " with the phone number " + myContacts.get(foundContactPosition).getPhoneNumber());

    }

    public int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (name.equals(this.myContacts.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public Contact findContact(int position) {
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }

    public Contact findContact2(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return myContacts.get(position);
        }
        return null;
    }
}
