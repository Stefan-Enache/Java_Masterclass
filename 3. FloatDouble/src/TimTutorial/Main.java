package TimTutorial;

public class Main {

    public static void main(String[] args) {
        // 32 bytes
        int myIntValue = 5 / 3;
        // 32 bytes
        float myFloatValue = 5f / 3f;
        // 64 bytes
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("Float = " + myFloatValue);
        System.out.println("Double = " + myDoubleValue);

        double pounds = 200;
        double kilograms = 0.45359237d * pounds;
        System.out.println("Converted kilograms = " + kilograms);
        double pi = 3.141_952;
        System.out.println(pi);


    }
}
