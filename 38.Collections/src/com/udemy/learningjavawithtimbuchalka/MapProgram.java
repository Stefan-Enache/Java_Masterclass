package com.udemy.learningjavawithtimbuchalka;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already in map");
        } else {
            languages.put("Java", "a compiled, high level, oop, platform independent language");
            System.out.println("java added successfully");
        }

        languages.put("Python", "this is python ");
        languages.put("Algol", "algorithmic");
        System.out.println(languages.put("Basic", " is just basic"));
        languages.put("Lisp", " madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java already in map");
        } else {
            languages.put("Java", "aaaaaaaaaaaa");
        }

        System.out.println("===============================");

//        languages.remove("Lisp");

        if (languages.remove("Algol", "algorithmic")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }

        if (languages.replace("Lisp", " madness", "lisp lisp")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp not removed");
        }

//        System.out.println(languages.replace("Lisp", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
//        System.out.println(languages.replace("Scala", "dfgsdfsdfsdfsdfs"));
        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
