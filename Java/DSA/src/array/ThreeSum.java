package array;

import java.util.*;

public class ThreeSum {


    public static void main(String[] args) {


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
