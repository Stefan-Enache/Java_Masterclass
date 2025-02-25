package com.udemy.learningjavawithtimbuchalka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        Function<String, String> labdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        System.out.println(labdaFunction.apply("1234567890"));
        System.out.println(everySecondChar(labdaFunction, "1234567890"));

        Supplier<String> iLoveJava = () -> "I Love Java";
        System.out.println(iLoveJava.get());

        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "isla",
                "ava"
        );

        List<String> firstUppercase = new ArrayList<>();

        topNames2015.forEach(name ->
                firstUppercase.add(name.substring(0, 1).toUpperCase() + name.substring(1)));

        firstUppercase.sort(String::compareTo);
        firstUppercase.forEach(System.out::println);

        System.out.println("-----------------------");

        long c = topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted()
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println(c);

        topNames2015
                .stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .collect(Collectors.toList());

    }

    public static String everySecondChar(Function<String, String> func, String s) {
        return func.apply(s);
    }
}
