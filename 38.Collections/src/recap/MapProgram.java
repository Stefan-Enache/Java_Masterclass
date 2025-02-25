package recap;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, oop, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted oop, high level programing language with dynamic semantics ");
        languages.put("Algol", "algorithmic language");
        System.out.println(languages.put("Basic", "beginners all purpose symbolic instruction code"));
        languages.put("Lisp", " there in lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in a map");
        } else {
            languages.put("Java", " this course is about java");
        }
//        System.out.println(languages.get("Java"));
//        System.out.println(languages.put("Java", " this course is about java"));
//        System.out.println(languages.get("Java"));

        System.out.println("============================");

//        languages.remove("Lisp");
        if (languages.remove("Algol", "algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. key value pair not found");
        }

        if (languages.replace("Lisp", " there in lies madness", "a functional programing language")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "won't work"));

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
