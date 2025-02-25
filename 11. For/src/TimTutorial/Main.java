package TimTutorial;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInches(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInches(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInches(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInches(10000.0, 5.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i);


        }
        for (double i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInches(10000.0, i)));
        }

        int count = 0;
        for (int i = 7; i < 80; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("----------------------------------------------------------");

        int count2 = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count2++;
                sum += i;
                System.out.println(i);
                if (count2 == 6) {
                    break;
                }

            }
        }
        System.out.println("sum = " + sum);

        System.out.println("----------------------------------------------------------");

        System.out.println(sumOdd(1, 100));

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= /*  n / 2  */ (long) Math.sqrt(n); i++) {
            System.out.println("   " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInches(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start) && (end > 0) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

}
