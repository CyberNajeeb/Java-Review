package javaReview.javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Warmup2 {

    public static String uniqueChars(String str) {
        String uniques = "";
        for (int i = 0; i < str.length(); i++) {
            //if (!uniques.equalsIgnoreCase("" + str.charAt(i)))
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(j, j + 1).equalsIgnoreCase("" + str.charAt(i)))
                    count++;
            }
            if (count == 1)
                uniques += "" + str.charAt(i);

        }
        return uniques;
    }

    public static void main(String[] args) {

//        System.out.println(uniqueChars("ABbxclieXCSLIE"));
        SortingArrayAsc(new int[]{1,2,5,9,65,4});
    }

    //Write a return method that can sort an int array in Ascending order without using the sort
    // method of the Arrays class.
    //         Ex:
    //            int[] arr = {10, 9, 8, 7};
    //             arr = Sort(arr);         ==>{ 7, 8, 9, 10};

    public static void SortingArrayAsc(int[] arr) {

        List<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
