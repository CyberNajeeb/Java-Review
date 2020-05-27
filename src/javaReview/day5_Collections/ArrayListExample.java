package javaReview.day5_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");

        for (String s : list) {
            System.out.print(s + " ");
        }
        Set<String> setList = new HashSet<>();
        setList.add("A");
        setList.add("B");
        setList.add("C");
        setList.add("C");

        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
