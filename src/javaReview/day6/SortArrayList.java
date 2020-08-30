package javaReview.day6;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayList {

    public static void sortArrays(ArrayList arrayList){

        Arrays.sort(arrayList.toArray());
        arrayList.toString().split("");

        System.out.println(Arrays.toString(arrayList.toArray()));
    }

    public static void main(String[] args) {
//        sortArrays(new ArrayList(Arrays.asList("as", "sa")));
        removeDups("aabsgggggaa");
    }

    public static void removeDups(String s){
        String result = "";
        for (int i = 0; i <s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
                if (!s.substring(i, i+=1).equalsIgnoreCase(s.substring(i+1, i+=2))){
                    result +=s.charAt(i);
                }
            }

        System.out.println("result = " + result);
        }
    }
