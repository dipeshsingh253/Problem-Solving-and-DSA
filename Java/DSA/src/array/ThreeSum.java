package array;

import java.util.*;

public class ThreeSum {


    public static void main(String[] args) {

        //Question Link : https://leetcode.com/problems/3sum/

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr));

        System.out.println(threeSumBruteForce(arr));

    }


    static List<List<Integer>> threeSumOptimized(int[] arr, int target) {

        List<List<Integer>> res = new ArrayList<>();

        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || arr[i - 1] != arr[i]) {

                int j = i + 1;
                int k = n - 1;

                while (j < k) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum == 0) {
//                    System.out.println("Sum :" + sum + " , Target :" + target);


                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        res.add(temp);

                        while (j < k && arr[j] == arr[j + 1]) j++;
                        while (j < k && arr[k] == arr[k - 1]) k--;

                        j++;
                        k--;


                    } else if (sum > 0) {
                        k--;
                    } else if (sum < 0) {
                        j++;
                    }

                }
            }
        }


        return res;
    }

    static List<List<Integer>> threeSumBruteForce(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        if (!isThere(res, temp)) {

                            res.add(temp);
                        }

                    }
                }
            }
        }
        return res;


    }

    static boolean isThere(List<List<Integer>> res, List<Integer> temp) {

        Collections.sort(temp);

        for (List<Integer> arr : res) {
            int c = 0;
            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i) == arr.get(i)) {
                    c++;
                }
            }

            if (c == temp.size()) {
                return true;
            }

        }

        return false;
    }
}
