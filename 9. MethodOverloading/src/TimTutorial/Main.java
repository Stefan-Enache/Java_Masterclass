package TimTutorial;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {


        int newScore = calculateScore("Stefan", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calculateFeetAndInchesToCentimeters(1, 1);

        double toCentimeters = calculateFeetAndInchesToCentimeters(1, 3);
        if (toCentimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
        calculateFeetAndInchesToCentimeters(157);
        calculateFeetAndInchesToCentimeters((short) 157);
        System.out.println("--------------------------------------------------------------------");
        getDurationString(666, 30);
        getDurationString(3753);
        System.out.println(durationString(65L, 45L));
        System.out.println(durationString(3910L));
        System.out.println(durationString(65, 9));

    }

    public static int getDurationString(int minutes, int seconds) {
        String name = "n";
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            System.out.println("Invalid value");
            return -1;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        System.out.println(String.format("0%s", String.valueOf(hours)) + "h " + remainingMinutes + "m " + seconds + "s ");
        return hours;
    }

    public static int getDurationString(int seconds) {
        if (seconds < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        int convertedMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(convertedMinutes, remainingSeconds);
    }

    public static String durationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;
    }

    public static String durationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return durationString(minutes, remainingSeconds);
    }


    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet >= 0) || (inches >= 0 || inches <= 12)) {
            double centimeters = feet * 30.48 + inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
            return centimeters;
        }
        System.out.println("Invalid input");
        return -1;
    }

    public static double calculateFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");
//            double centimeters = inches * 2.54;
//            System.out.println(inches + " inches = " + centimeters + " centimeters");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static double calculateFeetAndInchesToCentimeters(short inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches.");
//            double centimeters = inches * 2.54;
//            System.out.println(inches + " inches = " + centimeters + " centimeters");
        return calculateFeetAndInchesToCentimeters(feet, remainingInches);
    }
//    public static double calculateFeetAndInchesToCentimeters(double feet, double inches) {
//        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
//            System.out.println("Invalid input");
//            return -1;
//        }
//        double centimeters = (feet * 12) * 2.54;
//        centimeters += inches * 2.54;
//        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters");
//        return centimeters;
//    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Unnamed player no score");
        return 0;
    }

}
