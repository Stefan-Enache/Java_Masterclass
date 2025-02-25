public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1, 4.0));
        System.out.println("---------------------");

        System.out.println(printYearsAndDays(1054080));
    }

    public static long printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");
            return -1;
        }
        long hour = minutes / 60;
        long remainingM = minutes / 60;
        long day = hour / 24;
        long year = day / 365;
        long remainingDays = day % 365;
        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
        return remainingDays;
    }

//    public static long printYearsAndDays (long minutes) {
//        if(minutes < 0) {
//            System.out.println("Invalid value");
//        }
//        long hour = minutes / 60;
//        long day = hour / 24;
//        long year = day / 365;
//        long remainingDays = day % 24;
//        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
//        return remainingDays;
//    }

}
