package array;

public class ProductOfArrayExceptSelf {


    // Question Link : https://leetcode.com/problems/product-of-array-except-self/description/
    public int[] productExceptSelf(int[] nums) {

        int ans = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                ans *= nums[i];
            }

        }
        int[] arr = new int[nums.length];
        int fact = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                fact++;
            }
        }
        if(fact == 0){
            for(int i=0;i<nums.length;i++){
                arr[i] = ans/nums[i];
            }
        }else if(fact>1){
            for(int i=0;i<nums.length;i++){
                arr[i] = 0;
            }
        }else{
            for(int i=0;i<nums.length;i++){
                if(nums[i] == 0){
                    arr[i] = ans;
                }else
                {
                    arr[i] = 0;
                }
            }
        }
        return arr;


    }



}
