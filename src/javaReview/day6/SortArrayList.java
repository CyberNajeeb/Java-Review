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
        //removeDups("aabsgggggaa");
        System.out.println(primeNumber(89));
    }

    public static void removeDups(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
//            for (int j = 0; j < s.length(); j++) {
            if (!s.substring(i, i += 1).equalsIgnoreCase(s.substring(i + 1, i += 2))) {
                result += s.charAt(i);
            }
        }

        System.out.println("result = " + result);
    }
        public  static  String  identifyOddEven( int  n ) {

        String result = n%2==0 ? "Even" : "odd" ;
            System.out.println("result = " + result);
            return  result;
        }
    public static boolean primeNumber(int num) {

        boolean result = false;

        if(num <= 1) {

            return result;

        }

        for(int i = 2; i < num; i++) {

            if(num % i != 0 ) {

                return true;

            }

        }
        return result;

    }
        }

