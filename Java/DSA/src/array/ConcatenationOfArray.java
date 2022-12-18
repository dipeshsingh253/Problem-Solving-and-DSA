package array;

public class ConcatenationOfArray {

    //Question Link : https://leetcode.com/problems/concatenation-of-array/


    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < ans.length; i++) {

            ans[i] = nums[i % nums.length];  // this will start repeating if i will be greater than or equal to nums.length

        }

        return ans;
    }
}
