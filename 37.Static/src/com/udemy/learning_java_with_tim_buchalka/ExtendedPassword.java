package com.udemy.learning_java_with_tim_buchalka;

public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("saving as " + this.decryptedPassword);
//    }
}
