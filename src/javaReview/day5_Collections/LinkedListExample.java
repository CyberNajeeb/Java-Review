package javaReview.day5_Collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");

        list.addFirst("Z");

        list.removeLast();

        Collections.sort(list);

        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}
