package javaReview.javaPractice;

import java.util.Arrays;

public class SumOfElementsInArray {


    /*
    Given an array of ints, return the sum of the first 2 elements in the array. If the array
    length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
    */
    public static int sum2(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        return nums[0] + nums[1];
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] newArray = {a[a.length / 2], b[b.length / 2]};
        System.out.println("newArray = " + Arrays.toString(newArray));
        return newArray;
    }

    //Given an array of ints, return a new array length 2 containing the first and last
    // elements from the original array. The original array will be length 1 or more.
    public int[] makeEnds(int[] nums) {
        if (nums.length < 2)
            return nums;
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    //Given an int array length 2, return true if it contains a 2 or 3.
    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3)
                return true;
        }
        return false;
    }

    //Given an int array length 2, return true if it does not contain a 2 or 3.
    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3)
                return false;
        }
        return true;
    }

    //Given an int array, return a new array with double the length where its last element is the
    // same as the original array, and all the other elements are 0. The original array will be
    // length 1 or more. Note: by default, a new int array contains all 0's.
    //makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]

    public static int[] makeLast(int[] nums) {
        int[] newArr = new int[nums.length * 2];

        newArr[newArr.length - 1] = nums[nums.length - 1];
        return newArr;
    }
    //Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

    //double23([2, 2]) → true
    //double23([2, 3]) → false
    public static boolean double23(int[] nums) {

        if (nums.length < 2)
            return false;
        return nums[0] == nums[1];
    }
    //Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
    // set the 3 element to 0. Return the changed array.
    //
    //fix23([1, 2, 3]) → [1, 2, 0]
    //fix23([2, 3, 5]) → [2, 0, 5]
    //fix23([1, 2, 1]) → [1, 2, 1]

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3)
            nums[nums.length - 2] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            nums[nums.length - 1] = 0;
        return nums;
    }
    //Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
    //
    //start1([1, 2, 3], [1, 3]) → 2
    //start1([7, 2, 3], [1]) → 1
    //start1([1, 2], []) → 1

    public static int start1(int[] a, int[] b) {

        if (a[0] == 1 && b[0] == 1)
            return 2;
        if (a[0] == 1)
            return 1;
        if (b[0] == 1)
            return 1;
        return 0;
    }
    //Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from
    // a followed by the elements from b. The arrays may be any length, including 0, but there will be 2 or more
    // elements available between the 2 arrays.
    //
    //make2([4, 5], [1, 2, 3]) → [4, 5]
    //make2([4], [1, 2, 3]) → [4, 1]
    //make2([], [1, 2]) → [1, 2]

    public int[] make2(int[] a, int[] b) {

        int[] result = new int[2];
        if (a.length == 0)
            result = new int[]{b[0], b[1]};
        if (a.length == 1)
            result = new int[]{a[0], b[0]};
        if (a.length == 2)
            result = new int[]{a[0], a[1]};
        if (a.length > 2)
            result = new int[]{a[0], a[1]};

        if (b.length == 0)
            result = new int[]{a[0], a[1]};
        if (b.length == 1)
            result = new int[]{a[a.length - 1], b[0]};
        if (a.length == 0 && b.length == 2)
            result = new int[]{b[0], b[1]};
        return result;
    }

    public static void forFun() {
        int multtBy = 8;
        Integer leftNums = 1;
        Integer rightNum = 0;
        Integer add = 0;
        String ln = "1";
        for (int i = 0; i <= 3; i++) {
            System.out.print(ln + " x ");
            ln += leftNums.toString() + (leftNums * 10);
            System.out.println(multtBy + " + " + add);
            add++;

        }
    }

    public static void main(String[] args) {
        //System.out.println(sum2(new int[]{19}));
        //System.out.println(Arrays.toString(middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
//        System.out.println((double23(new int[]{})));
//        System.out.println(start1(new int[]{13, 3, 4, 5}, new int[]{1, 3, 4, 5}));
//
        //forFun();
    }
}
