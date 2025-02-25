package com.pluralsight.calcengine;

public class Contacts {
    private String name;
    private String phoneNr;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNr = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public static Contacts createContact(String name, String phoneNumber) {
        return new Contacts(name, phoneNumber);
    }

}
