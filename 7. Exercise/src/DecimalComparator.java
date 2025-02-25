public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double nr1, double nr2) {
        if ((int) (nr1 * 1000) == (int) (nr2 * 1000)) {
            return true;
        }
        return false;
    }

}
