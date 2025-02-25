package com.udemy.learningjavawithtimbuchalka;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenges {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String challenge2 = "I want a ball.";
        System.out.println((challenge1.concat(challenge2).matches("I want a bike.I want a ball.")));
        String regExp = "I want a .*";
        String regExp1 = "I want a (bike|ball).";

        System.out.println("-----------------------------------");
        System.out.println(challenge1.matches(regExp));
        System.out.println(challenge2.matches(regExp1));

        System.out.println("-----------------------------------");
        String regExp0 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp0);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
//        matcher.reset(); not necessary, different strings are used
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all \tblanks \nwith   underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));
        System.out.println("-----------------------------------");
        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]{20}"));
//        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));
//        System.out.println(challenge5.replaceAll("^a{3}bc{8}d{3}ef{3}g$", "Replaced"));
        System.out.println("-----------------------------------");
        String challenge7 = "kgsdks.225";
        String regExp3 = "(\\D+\\.\\d+)+";
        System.out.println(challenge7.matches(regExp3));
        System.out.println("-----------------------------------");
        String challenge8 = "abcd.125uvdsf.7twetgdf.999";
        Pattern pattern1 = Pattern.compile("\\.(\\d+)+");
        Matcher matcher1 = pattern1.matcher(challenge8);
        while (matcher1.find()) {
            System.out.println("Occurrence: " + matcher1.group(1));
        }

        System.out.println("-----------------------------------");
        String challenge9 = "abcd.135\tuvdsf.7\twetgdf.999\n";
        String challenge9NoSpace = challenge9.replaceAll("\\s", "");
        Pattern pattern9 = Pattern.compile("\\.(\\d+)+");
        Pattern pattern9b = Pattern.compile("\\.(\\d+)\\s");
        Matcher matcher9 = pattern9b.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }

        System.out.println("-----------------------------------");
        String challenge10 = "abcd.135\tuvdf.7\twetf.999\n";
        Pattern pattern10 = Pattern.compile("\\.(\\d+)\\s");
        Matcher matcher10 = pattern9b.matcher(challenge10);
        while (matcher10.find()) {
            System.out.println("start: " + matcher10.start(1) + " end: " + (matcher10.end(1) - 1));
        }
        System.out.println("-----------------------------------");
        String challenge11 = "{0,2}, {0,5}, {0,3}";
        Pattern pattern11 = Pattern.compile("\\{(.*?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println(matcher11.group(1));
        }

        System.out.println("Spin X spins test:");

        String spinXSpins = "SPIN 50 TIMES";

        String regExSpin = "SPIN (\\d+) TIMES";
        String regExSpin2 = "SPIN ([0-9]{2}) TIMES";
        System.out.println(spinXSpins.matches(regExSpin2));
//        Pattern spinXSpinsPattern = Pattern.compile(regExSpin);
//        Matcher matcher20 = spinXSpinsPattern.matcher(spinXSpins);


    }
}
