package com.pluralsight.calcengine;

public class ContactsRecap {
    private String name;
    private String phoneNumber;

    public ContactsRecap(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public static ContactsRecap createContact(String name, String phoneNumber){
//        return new ContactsRecap(name, phoneNumber);
//    }
}
