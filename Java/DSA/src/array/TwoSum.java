package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int target = scanner.nextInt();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr) + "=>" + target);
        findTarget(arr, target);

    }


    static int[] findTarget(int[] nums, int target) {


        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {

            int diff = (target - nums[i]);
            if (hash.containsKey(diff)) {
                int[] res = {hash.get(diff), i};
                return res;
            }

            hash.put(nums[i], i);

        }

        return null;


    }

}
