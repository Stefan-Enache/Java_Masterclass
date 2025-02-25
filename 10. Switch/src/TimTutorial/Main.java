package TimTutorial;

public class Main {

    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Was 1");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It was " + value);
                break;
            default:
                System.out.println("None");
                break;
        }
        char x = 'D';
        switch (x) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found");
                break;
            default:
                System.out.println("Not Found");
                break;
        }

        String month = "JanUARY";
        switch (month.toLowerCase()) {
            case "january":
            case "february":
            case "december":
                System.out.println("Winter");
                break;
            default:
                System.out.println("Winter is coming");
                break;
        }

        printDayOfTheWeek(2);
        ifDay(1);
        System.out.println(isLeapYear(1700));
        System.out.println(getDaysInMonth(2, 2018));
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednsday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid week day");
                break;
        }
    }

    public static void ifDay(int day) {
        if (day == 0)
            System.out.println("M");
        else if (day == 1)
            System.out.println("T");
        else System.out.println("invalid");
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
//        public static boolean isLeapYear(int year) {
//        if((year <= 0) || (year >= 9999)) {
//            return  false;
//        } else if (((year % 400 != 0) && (year % 100 == 0)) || (year % 4 == 0)) {
//            return true;
//        }return false;
//        }

//    public static boolean isLeapYear(int year) {
//        if ((year <= 0) || (year >= 9999)) {
//            return false;
//        } else if (((year % 400 == 0) && (year % 100 != 0)) || (year % 4 == 0)) {
//            return true;
//        }
//        return false;
//    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        } else if ((year % 100 == 0) && (year % 400 != 0)) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (((month >= 1) && (month <= 12)) && ((year >= 1) && (year <= 9999))) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    if (!isLeapYear(year)) {
                        return 28;
                    } else if (isLeapYear(year)) {
                        return 29;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
            }
        }
        return -1;
    }
//        public static void switch1(int month, int year) {
//            switch (month) {
//                case 1:
//                    if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999)))
//                    System.out.println(31);
//                    break;
//                case 2:
//                    if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999)))
//                    System.out.println(28);
//                    break;
//                case 3:
//                    if (isLeapYear(year)) {
//                    System.out.println(29);
//                }
//            }
//        }

}
