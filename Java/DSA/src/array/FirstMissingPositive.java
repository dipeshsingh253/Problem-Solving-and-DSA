package array;

public class FirstMissingPositive {

    // Question Link : https://leetcode.com/problems/first-missing-positive/description/


    public int firstMissingPositive(int[] nums) {



        int n = nums.length;
        int m = n + 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) nums[i] = 0;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                arr[nums[i] - 1] = nums[i];
        }

        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                return i+1;
            }

        }
        return arr[nums.length-1]+1;

    }


}
