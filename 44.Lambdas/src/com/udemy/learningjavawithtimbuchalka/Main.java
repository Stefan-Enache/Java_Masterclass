package com.udemy.learningjavawithtimbuchalka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	new Thread(new Runnable() {
//        @Override
//        public void run() {
//            System.out.println("Printing from the runnable");
//        }
//    }).start();

        new Thread(() -> {
            System.out.println("Printing from the runnable");
            System.out.println("line 2");
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalka", 21);
        Employee stefan = new Employee("Stefan Enache", 33);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(stefan);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        employees.forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });
        System.out.println("********************");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
//            new Thread(() -> System.out.println(employee.getAge())).start();
        }

//        String sillySting = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillySting);

        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        String sillyString = doStringStuff(uc, employees.get(0).getName(), employees.get(1).getName());
        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

//class CodeToRun implements Runnable {
//
//    @Override
//    public void run() {
//        System.out.println("Printing from the runnable");
//    }
//}

class AnotherClass {

    public String doSomething() {
        int i = 0;

        UpperConcat uc = (s1, s2) -> {
            System.out.println("The lambda expression's class is: " + getClass().getSimpleName());
            System.out.println("i in lambda = " + i);
            String result = s1.toUpperCase() + s2.toUpperCase();
//            System.out.println(result + " x");
            return result;
        };

//        UpperConcat uc = new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("i in anonymous class = " + i);
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        };


//            i++;
//        System.out.println("i = " + i);

        System.out.println("The AnotherClass class name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc, "String1", "String2");

//        System.out.println("The AnotherClass class name is: " + getClass().getSimpleName());
//        return Main.doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("The anonymous class name is: " + getClass().getSimpleName());
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, "String1", "String2");
    }

    public void printValue() {
        int number = 25;

        Runnable r = () -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value is " + number);
        };

        new Thread(r).start();
    }
}
