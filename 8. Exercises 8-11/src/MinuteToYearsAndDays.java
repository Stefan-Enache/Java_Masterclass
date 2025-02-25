public class MinuteToYearsAndDays {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
        }
        long hour = minutes / 60;
        long remainingHours = minutes % 60;
        long day = hour / 24;
        long remainingDays = hour % 24;
        long year = day / 356;
        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
    }

}
