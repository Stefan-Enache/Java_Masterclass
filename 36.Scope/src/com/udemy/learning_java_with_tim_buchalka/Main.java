package com.udemy.learning_java_with_tim_buchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(var4);
        scopeInstance.timeTwo();

        System.out.println("***********");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println(innerClass.var3);
        innerClass.timeTwo();
        System.out.println("***********");


        X x = new X(new Scanner(System.in));
        x.x();
    }
}
