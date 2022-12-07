package array;

import java.util.Arrays;
import java.util.Scanner;

public class TriangleTriplets {

    public static void main(String[] args) {

//Question Link : https://leetcode.com/problems/valid-triangle-number/description/


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr));

        System.out.println(countPossibleTriangles(arr));
        System.out.println(countPossibleTriangleBruteForce(arr));
    }


    static int countPossibleTriangles(int[] arr) {

        int count = 0;

        Arrays.sort(arr);
        int n = arr.length;

        for (int i = n - 1; i > 1; i--) {

            int j = 0;
            int k = i - 1;
            while (j < k) {
                if (arr[j] + arr[k] > arr[i]) {
                    count += k - j;
                    k--;
                } else {
                    j++;
                }
            }

        }

        return count;


    }

    static int countPossibleTriangleBruteForce(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] > nums[k] &&
                            nums[i] + nums[k] > nums[j] &&
                            nums[j] + nums[k] > nums[i]) {
                        count++;
                    }
                }
            }
        }
        return count;

    }

}
