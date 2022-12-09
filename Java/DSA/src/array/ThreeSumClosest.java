package array;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeSumClosest {

    public static void main(String[] args) {

//Question Link : https://leetcode.com/problems/3sum-closest/
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int target = scanner.nextInt();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr) + target);

        threeSumClosest(arr, target);
    }

    static int threeSumClosest(int[] arr, int target) {

        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == target) {
                    System.out.println("Sum :" + sum + " , Target :" + target);
                    j++;
                    k--;
                } else if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                }

            }

        }

        return 0;
    }

}
