package TimTutorial;

public class Main {

    public static void main(String[] args) {


        // int width = 32
        int myIntValue = 2_147_483_647;
        System.out.println(myIntValue);

        // short width = 16
        short myShortValue = 32767;
        short myShortTotal = (short) (myShortValue);
        System.out.println(myShortTotal);

        // bite width = 8
        byte myByteValue = -128;
        byte myByteTotal = (byte) (myByteValue);
        System.out.println(myByteTotal);

        // long width = 64
        long myLongValue = 50000 + 10 * (myByteValue + myShortTotal + myIntValue);
        long myLongTotal = (long) (myLongValue);
        System.out.println(myLongTotal);

        short myShorts = (short) (10 * (myByteValue + myShortTotal + myIntValue));
        System.out.println(myShorts);


        // 32 bytes
        int myIntValue1 = 5 / 2;
        // 32 bytes
        float myFloatValue = 5f / 3f;
        // 64 bytes
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue1);
        System.out.println("Float = " + myFloatValue);
        System.out.println("Double = " + myDoubleValue);

        double pounds = 200;
        double kilograms = 0.45359237d * pounds;
        System.out.println("Converted kilograms = " + kilograms);
        double pi = 3.141_952;
        System.out.println(pi);


        // 16 bytes
        char myChar = '\u00AE';
        System.out.println(myChar);
        // bytes
        boolean myBoolean = true;
        boolean isMale = true;

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println(myString);

        String nrString = "250,5";
        nrString = nrString + "45";
        System.out.println(nrString);

        int result = 1 + 2;
        System.out.println(result);
        int pResult = result;

        result = result - 1;
        System.out.println(pResult + " - 1 = " + result);

        pResult = result;

        result = result * 10;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result *= 3;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("Not an Alien");
        else
            System.out.println("Alien");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("Winner");

        int sScore = 90;
        if ((topScore > sScore) || (topScore < 100))
            System.out.println("just right");
        if (isMale)
            System.out.println("male");

        isMale = true;
        boolean wasMale = isMale ? true : false;
        if (wasMale)
            System.out.println("wasMale is true");

        double exDouble = 20;
        double sexDouble = 80;
        double exResult = (exDouble + sexDouble) * 25;
        double exRemainder = exResult % 40;
        System.out.println(exRemainder);
        if (exRemainder >= 20)
            System.out.println("Total was over the limit");

    }
}



