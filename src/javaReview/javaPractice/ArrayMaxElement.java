package javaReview.javaPractice;

public class ArrayMaxElement {
    public static int maxArray(int[] arr){
        int max = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArray(new int[]{1, 244, 34, 44}));
    }
}
