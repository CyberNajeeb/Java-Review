package javaReview.javaPractice;

public class WarmUp3 {

    public static String uniqueChars(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(j, j + 1).equalsIgnoreCase("" + str.charAt(i)))
                    count++;
            }
            if (count == 1)
                result += "" + str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("aaabsscnnd"));
    }
}
