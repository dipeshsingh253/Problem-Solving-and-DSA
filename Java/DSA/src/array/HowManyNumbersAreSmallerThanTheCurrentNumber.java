package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    //Question Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    static int count(int[] nums, int i, int n) {

        int count = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] < nums[i]) {
                count++;
            }
        }
        return count;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
//81223 => 81223 => 12238 => 1,0 => 2,1 => 3,3 => 8 ,4
// => 4 0 1 1 3
        Map<Integer, Integer> map = new HashMap<>();
        int[] numsClone = nums.clone();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], i);
            }

        }
        int[] result = new int[nums.length];
        for (int i = 0; i < numsClone.length; i++) {
            result[i] = map.get(numsClone[i]);
        }
        return result;

    }

    public int[] smallerNumbersThanCurrentBruteForce(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {

            res[i] = count(nums, i, n);
        }

        return res;
    }

}
