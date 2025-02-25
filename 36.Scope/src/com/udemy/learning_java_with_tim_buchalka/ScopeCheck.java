package com.udemy.learning_java_with_tim_buchalka;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timeTwo() {
        int var2 = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * var2);
        }
    }


    public void useInner() {
        InnerClass innerClass = new InnerClass();
        System.out.println("var 3 from outer class " + innerClass.var3);
    }

    public class InnerClass {
        private int var3 = 3;

        public InnerClass() {
            System.out.println("Inner class created, varOne is " + varOne + " and var3 = " + var3);
        }

        public void timeTwo() {
            System.out.println("varOne is still available here " + varOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * var3);
            }
        }
    }
}
