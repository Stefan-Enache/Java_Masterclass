package com.pluralsight.calcengine;


import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public ArrayList<Contacts> getMyContacts() {
        return myContacts;
    }

    public void printC() {
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println(myContacts.get(i).getName() + ": " + myContacts.get(i).getPhoneNr());
        }
    }

    public void store(String name, String phone) {
        myContacts.add(new Contacts(name, phone));
    }

    public boolean addNewContact(Contacts contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("contact already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }


    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contacts contact = this.myContacts.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }

        }
        return -1;
    }

    private int findContact(Contacts contact) {
        return this.myContacts.indexOf(contact);
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("name already exists");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;

    }

    public boolean remove(Contacts contact) {
        int foundPosition = findContact(contact);
        if (foundPosition >= 0) {
            this.myContacts.remove(foundPosition);
            System.out.println(contact.getName() + " was removed");
            return true;
        } else {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
    }

    public String queryContact(Contacts contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        if (findContact(name) >= 0) {
            return myContacts.get(findContact(name));
        }
        return null;
    }
}


