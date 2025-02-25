public class BarkingDog {

//  public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {
//        if (hourOfTheDay < 0) {
//            return false;
//        } else if (hourOfTheDay > 23) {
//            return false;
//        } else if (hourOfTheDay < 8 && barking) {
//            return true;
//        } else if (hourOfTheDay > 22 && barking) {
//            return true;
//     }
//        return false;*/
//    }


    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            return false;
        } else if ((hourOfTheDay < 8 || hourOfTheDay > 22) && barking) {
            return true;
        }
        return false;
    }

}




