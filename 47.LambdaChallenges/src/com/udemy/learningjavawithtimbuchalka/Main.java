package com.udemy.learningjavawithtimbuchalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

//        String everySecondChar = source -> {
//            StringBuilder returnVal = new StringBuilder();
//            for (int i = 0; i < source.length(); i++) {
//                if (i % 2 == 1) {
//                    returnVal.append(source.charAt(i));
//                }
//                return returnVal.toString();
//            }
//        };

        Function<String, String> lambdaFunction = (String s) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };


//        System.out.println(lambdaFunction.apply("1234567890"));
        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));

        Supplier<String> iLoveJava = () -> "I love Java";
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "olivia",
                "emily",
                "Ava"
        );

        List<String> firstUpperCaseList = new ArrayList<>();
        topNames2015.forEach(name ->
                firstUpperCaseList.add(name.substring(0, 1).toUpperCase() + name.substring(1)));
        firstUpperCaseList.sort((s1, s2) -> s1.compareTo(s2));
        firstUpperCaseList.forEach(s -> System.out.println(s));

        System.out.println("-----------");

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted()
                .count();


        long x = topNames2015.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println(x);
    }

    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }
}
