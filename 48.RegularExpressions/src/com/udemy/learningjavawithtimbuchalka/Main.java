package com.udemy.learningjavawithtimbuchalka;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String string = "I am a string. Yes I am.";
        String yourString = string.replaceAll("I", "you");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12G44 hhijabcD\teeeii iijkl99z";
        int numeric = 1112332314;
        System.out.println(alphanumeric.replaceAll(".", "Y"));
        System.out.println(alphanumeric.replaceAll("a......F", "Y"));
        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
        System.out.println(alphanumeric.matches("..cDeeeF12GhhabcDeeeiiiijkl99z"));
        System.out.println(alphanumeric.replaceAll("ijkl99z$", "END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "SX"));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));
        String x = String.valueOf(numeric).replaceAll("[24]", "7");
        System.out.println(x);
        int y = Integer.decode(x);
        System.out.println(y + 2);

        System.out.println("Harry".replaceAll("[Hh]arry", "Larry"));
        System.out.println(alphanumeric.replaceAll("[^ej]", "x"));
        System.out.println(alphanumeric.replaceAll("(?iu)[a-f3-8]", "X"));
        System.out.println(alphanumeric.replaceAll("\\d", "Y"));
        System.out.println(alphanumeric.replaceAll("\\D", "Y"));
        System.out.println(alphanumeric.replaceAll("\\s", ""));
        System.out.println(alphanumeric.replaceAll("\\S", "U"));
        System.out.println(alphanumeric.replaceAll("\\w", "j"));
        System.out.println(alphanumeric.replaceAll("\\b", "<>"));
        System.out.println(alphanumeric.replaceAll("e{3}", "!"));
        System.out.println(alphanumeric.replaceAll("e+", "!"));
        System.out.println(alphanumeric.replaceAll("^abcDe*", "!"));
        System.out.println(alphanumeric.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());


        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + ": " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        String h2GroupPattern1 = "(<h2>)(.+?)(</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern1);
        Matcher matcher1 = groupPattern.matcher(htmlText);
        System.out.println(matcher1.matches());
        matcher1.reset();
        while (matcher1.find()) {

            System.out.println("Occurrence " + matcher1.group(2));
        }

    }
}
