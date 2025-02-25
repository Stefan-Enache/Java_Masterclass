package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;

        }
        System.out.println("------------------------");

        for (count = 1; count != 6; count++) {
            System.out.println("count value is " + count);
        }
        System.out.println("------------------------");

        count = 3;
        while (true) {
            if (count == 9) {
                break;
            }
            System.out.println("count value is " + count);
            count++;
        }
        System.out.println("------------------------");

        count = 6;
        do {
            System.out.println("count value is " + count);
            count++;

            if (count > 10) {
                break;
            }
        } while (count != 6);
        System.out.println("------------------------");

        isEvenNumber(3);


        int nr = 4;
        int finalnr = 20;
        int counteven = 0;

        while (nr <= finalnr) {
            nr++;
            if (!isEvenNumber(nr)) {
                continue;

            }
            System.out.println("even number = " + nr);
            counteven++;
            if (counteven == 5) {
                break;
            }

        }

        System.out.println("total even = " + counteven);

        System.out.println("------------------------");

        int n = 0;
        while (n < 15) {
            n++;

            if (n <= 5) {
                System.out.println("Skipping " + n);
                continue;
            }

            System.out.println(n);

            if (n >= 10) {
                System.out.println("Breaking " + n);
                break;
            }
        }

        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuuuuuuu");


        sumDigits(125);
        isPalindrome(-12221);

        sumFirstAndLastDigit(223);
        getEvenDigitSum(12345);
        hasSharedDigit(12, 42);
        System.out.println(hasSameLastDigit(22, 23, 32));
        System.out.println("----------------------------");
        getGreatestCommonDivisor(22, 12);
        System.out.println("----------------------------");
        printFactors(6);
        isPerfectNumber(28);
        numberToWords(12340);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(isPalindrome2(11));
        System.out.println(sumFirstAndLastDigit2(223));


    }

    public static boolean isEvenNumber(int nr) {
        if (nr % 2 == 0) {

            return true;

        }
        return false;
    }
    /* DIGIT SUM CHALLENGE */

//    public static int sumDigits (int n) {
//        if((n >= 10) || (n < 0)) {
//            int firstDigit = n % 10;
//            int secondDigit = n/10;
//            int thirdDigit = n/100;
//            int sum = firstDigit + secondDigit + thirdDigit;
//
//            System.out.println(sum);
//        }
//        return -1;
//
//    }

    public static int sumDigits(int n) {
        if (n < 10) {
            System.out.println("wrong number");
            return -1;
        }

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean isPalindrome2(int number) {
        int reverse = 0;
        int originalNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (originalNumber == reverse) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int m = n;

        while (n != 0) {
            int lastDigit = n % 10;
            reverse *= 10;
            reverse += lastDigit;
            n /= 10;
        }
        System.out.println(reverse);
        System.out.println(m);
        if (m == reverse) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static int sumFirstAndLastDigit2(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        if (number < 10) {
            sum = number + number;
        }
        int firstDigit = 0;
        int lastDigit = 0;
        int firstLastDigit = number % 10;
        while (number != 0) {
            lastDigit = number % 10;
            firstDigit = number /= 10;
        }
        sum = firstLastDigit + lastDigit;

        return sum;


    }


    public static int sumFirstAndLastDigit(int n) {
        if (n < 0) {
            return -1;
        }
        int sum = 0;
        if (n < 10) {
            sum = n + n;
        }
        int firstLastDigit = n % 10;
        while (n > 0) {
            int lastDigit = n % 10;
            int firstDigit = n /= 10;

            if (firstDigit > 0) {
                sum = firstDigit + firstLastDigit;
            }

            System.out.println(sum);
        }
        return sum;

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println(sum);
        return sum;
    }


    public static boolean hasSharedDigit(int first, int second) {
        if ((first < 10) || (first > 99) || (second < 10) || (second > 99)) {
            return false;
        }
        int first1 = first / 10;
        int first2 = first % 10;
        int second1 = second / 10;
        int second2 = second % 10;
        if (((first1 == second1) || (first1 == second2)) || ((first2 == second1) || (first2 == second2))) {
            System.out.println(true);
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (((n1 < 10) || (n1 > 1000)) || ((n2 < 10) || (n2 > 1000)) || ((n3 < 10) || (n3 > 1000))) {
            return false;
        }

        while (n1 > 0) {
            n1 = n1 % 10;
            System.out.println(n1);
            if (n1 < 10) {
                break;
            }
        }
        while (n2 > 0) {
            n2 = n2 % 10;
            System.out.println(n2);
            if (n1 < 10) {
                break;
            }
        }
        while (n3 > 0) {
            n3 = n3 % 10;
            System.out.println(n3);
            if (n1 < 10) {
                break;
            }
        }
        if ((n1 == n2) || (n2 == n3) || (n1 == n3)) {
            System.out.println(true);
            return true;
        }
        return false;
    }

    public static boolean isValid(int n) {
        if ((n < 10) || (n > 1000)) {
            return false;
        }
        return true;
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (second != 0) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        System.out.println(first);
        return first;
    }

    public static void printFactors(int n) {
        if (n < 1) {
            System.out.println("Invalid Value");
        }
        int divisor = 0;
        while (divisor < n) {
            divisor++;
            if (n % divisor == 0)
                System.out.println(divisor);
        }
    }

    public static boolean isPerfectNumber(int n) {
        if (n < 1) {
            System.out.println("false");
            return false;

        }
        int divisor = 0;
        int sum = 0;
        while (divisor < (n - 1)) {
            divisor++;
            if (n % divisor == 0) {
                sum += divisor;

            }
            if (n == sum) {
                System.out.println("true");
                return true;
            }
        }
        return false;
    }

    public static void numberToWords(int number) {
        int reverseNumber = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i < getDigitCount(number); i++) {

            switch (reverseNumber % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reverseNumber /= 10;
        }
    }

    public static int reverse(int n) {
        int newNumber = n;
        int reverse = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reverse *= 10;
            reverse += lastDigit;
            n /= 10;
//                    switch (reverse) {
//                        case 0:
//                            System.out.println("Zero");
//                            break;
//                        case 1:
//                            System.out.println("One");
//                            break;
//                        case 2:
//                            System.out.println("Two");
//                            break;
//                        case 3:
//                            System.out.println("Three");
//                            break;
//                        case 4:
//                            System.out.println("Four");
//                            break;
//                        case 5:
//                            System.out.println("Five");
//                            break;
//                        case 6:
//                            System.out.println("Six");
//                            break;
//                        case 7:
//                            System.out.println("Seven");
//                            break;
//                        case 8:
//                            System.out.println("Eight");
//                            break;
//                        case 9:
//                            System.out.println("Nine");
//                            break;
//                    }
//            }

        }
        return reverse;

    }

    public static int getDigitCount(int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        if (n == 0) {
            count = 1;
        }
        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count;

    }

}
