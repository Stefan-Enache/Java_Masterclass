package com.pluralsight.calcengine.finalRecap;

import java.util.ArrayList;

public class MobilePhoneFinalRecap {

    private ArrayList<ContactFinalRecap> myContacts = new ArrayList<ContactFinalRecap>();

    public boolean store(String name, String phoneNumber) {
        int position = findContact(name);
        if (position >= 0) {
            System.out.println("Contact already exists");
            return false;
        } else {
            ContactFinalRecap newContact = new ContactFinalRecap(name, phoneNumber);
            myContacts.add(newContact);
            return true;
        }
    }

    public boolean modify(String oldContact, String newContactName, String newContactNumber) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact + " does not exist");
            return false;
        } else if (findContact(newContactName) != -1) {
            System.out.println("contact with name " + newContactName + " already exists");
            return false;
        } else {
            ContactFinalRecap newContact = new ContactFinalRecap(newContactName, newContactNumber);
            myContacts.set(position, newContact);
            return true;
        }
    }

    public void remove(String name) {
        int position = findContact(name);
        myContacts.remove(position);
    }

    public void printContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(myContacts.get(i).getName() + ": " + myContacts.get(i).getPhoneNumber());
        }
    }


    public ContactFinalRecap query(String name) {
        int position = findContact(name);
        return myContacts.get(position);
    }

//    public int findContact(ContactFinalRecap name){
//        return myContacts.indexOf(name);
//    }

    public int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            ContactFinalRecap contact = myContacts.get(i);
            if (contact.getName().endsWith(name)) {
                return i;
            }
        }
        return -1;
    }

}
