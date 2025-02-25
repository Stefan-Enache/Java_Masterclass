public class SpeedConverter {

    public static double toMilesPerHour(double kmPerHour) {
        if (kmPerHour < 0) {
            return -1;
        }
//        return Math.round(kmPerHour / 1.609);
        double miles = (kmPerHour / 1.609);
        return miles;
    }

    public static void printConversion(double kmPerHour) {
        if (kmPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double mph = toMilesPerHour(kmPerHour);
            System.out.println(kmPerHour + " km/h = " + mph + " m/h");
        }
    }

}