package javaReview.javaPractice;

public class ArrayMaxElement {
    public static int maxArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int each : arr) {
        if (each>max)
            max=each;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArray(new int[]{1, 244, 34, 44}));
    }
}
