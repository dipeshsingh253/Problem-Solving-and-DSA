package math;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {
//Test Case => 1 5 8 4 7 6 5 3 1

        //Question Link : https://leetcode.com/problems/next-permutation/
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        String[] tokens = s.split(" ");
        int[] nums = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);

        }

        System.out.println("Input :" + Arrays.toString(nums));
        nextGreatesPermutation(nums);
        System.out.println("Output :" + Arrays.toString(nums));

    }


    static void nextGreatesPermutation(int[] nums) {

        int n = nums.length;
// we will find the first element with ambiguity ==> consider that you want smallest but greater than current
        int i = n - 2;

        for (; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        //if the given number is the maximum permutation for given set of numbers
        if (i == -1) {
            System.out.println(-1);
            return;
        }
//else perform below operation
        if (i >= 0) {

            int j = n - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }
            System.out.println(j);
            swap(nums, i, j);

        }

        reverse(nums, i + 1);


    }


    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    private static void reverse(int[] nums, int start) {

        int end = nums.length - 1;

        while (start < end) {

            swap(nums, start, end);
            start++;
            end--;

        }


    }


}
