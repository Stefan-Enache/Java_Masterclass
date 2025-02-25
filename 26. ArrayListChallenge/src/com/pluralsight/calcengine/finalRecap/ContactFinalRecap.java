package com.pluralsight.calcengine.finalRecap;

import com.pluralsight.calcengine.recap.Contact;

public class ContactFinalRecap {

    public String name;
    public String phoneNumber;

    public ContactFinalRecap(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public static ContactFinalRecap createContact(String name, String phoneNumber) {
//        return new ContactFinalRecap(name, phoneNumber);
//    }


    @Override
    public String toString() {
        return "ContactFinalRecap{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
