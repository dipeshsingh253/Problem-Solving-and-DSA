package array;

public class NumberOfGoodPairs {

    //Question Link : https://leetcode.com/problems/number-of-good-pairs/

    public int numIdenticalPairs(int[] nums) {
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            pair = Check(i, nums.length, pair, nums);
        }
        return pair;
    }

    int Check(int i, int n, int pair, int[] num) {
        for (int j = i + 1; j < n; j++) {
            if (num[i] == num[j]) {
                pair++;
            }
        }
        return pair;
    }

}
