package array;

import java.util.Arrays;
import java.util.Scanner;

public class PartitionArrayIntoThreeParts {

    public static void main(String[] args) {

        //Question Link :https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/description/

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr));

    }


    static boolean solution(int[] arr) {

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        if (sum % 3 != 0) {
            return false;
        }

        int target = sum / 3;

        int firstIndex = -1;
        int secondIndex = -1;
        int current = 0;

        for (int i = 0; i < arr.length; i++) {

            current += arr[i];

            if (current == target && firstIndex == -1) {
                firstIndex = i;
            } else if (current == 2 * target && firstIndex != -1 && secondIndex == -1) {
                secondIndex = i;
            }

        }

        return firstIndex != -1 && secondIndex != -1 && secondIndex != arr.length - 1;


    }

}
