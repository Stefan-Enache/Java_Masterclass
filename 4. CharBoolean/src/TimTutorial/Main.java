package TimTutorial;

public class Main {

    public static void main(String[] args) {
        // 16 bytes
        char myChar = '\u00AE';
        System.out.println(myChar);
        // bytes
        boolean myBoolean = true;
        boolean isMale = true;

        String myString = "This is\u00AE a string \u00AE\u00AE";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println(myString);

        String nrString = "250,5";
        nrString = nrString + "45";
        System.out.println(nrString);

        String lastString = "18";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);

    }
}
