package TimTutorial;

public class Main {

    public static void main(String[] args) {
        checkNumber(4537551456456456465465464517f);
    }

    public static void checkNumber(float number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }

}
