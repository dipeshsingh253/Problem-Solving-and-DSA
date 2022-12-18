package array;

public class ShuffleTheArray {


    //Question Link : https://leetcode.com/problems/shuffle-the-array/
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        int k = 0;

        for(int i = 0;i<n;i++){
            ans[k] = nums[i];
            ans[k+1] = nums[n+i];
            k=k+2;

        }

        return nums;
    }
}
