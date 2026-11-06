git remote add origin https://github.com/expertism/md-sessions.git/*
* Manchester Digital Session 1 & 2
*
*/

package org.mdigital;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class Main {
    static void main() {

//        int age = 20; // whole number
//        String name = "Ciel"; // text (must have double quote) single '' = char
//        double price = 9.99; // decimal number
//        final int nage = 18; // constant variable (never changes)
//
//        System.out.println(nage);
//        System.out.println("Hello World!");
//        System.out.println(age);
//        System.out.println(name);
//        System.out.println(age + name + price);

        String name = "Ciel";

        System.out.println(name.substring(1,3)); // (use name. for all methods)

        String sentence = " the quick fox jumps ";
        String[] ls = sentence.split(" ");

        HashSet<String> movies = new HashSet<>(); // has no dups
        movies.add("spiderman");
        movies.add("batman");
        movies.add("superman");
        movies.add("hero");
        movies.add("spiderman");

        System.out.println(movies);
        System.out.println(movies.contains("hero"));

        LinkedHashMap<String, String> mtitle = new LinkedHashMap<>();
        mtitle.put("spiderman", "2026, ciel");
        mtitle.put("batman", "1999, adam");
        mtitle.put("43", "5000, cole");
        mtitle.put("superman", "2030, ci");
        System.out.println(mtitle);
        System.out.println(mtitle.get("batman"));
        System.out.println(mtitle.containsKey("superman"));

    }
}
