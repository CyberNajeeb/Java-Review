package javaReview.day5_Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();
        set.add("z");
        set.add("Y");
        //set.add(null);
        set.add("z");
        set.add("80");
        set.add("/");
        //set.add(null);
        set.add("z");
        set.add("a");

        System.out.println(set);
    }
}