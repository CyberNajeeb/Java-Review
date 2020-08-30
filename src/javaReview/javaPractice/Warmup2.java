package javaReview.javaPractice;

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

        System.out.println(uniqueChars("ABbxclieXCSLIE"));

    }
}
