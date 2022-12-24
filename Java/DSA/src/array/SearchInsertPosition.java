package array;

public class SearchInsertPosition {

    // Question Link : https://leetcode.com/problems/search-insert-position/description/

    public int searchInsert(int[] nums, int target) {

        int result ;

        if(target > nums[nums.length - 1]) {

            result = nums.length;

        }else if( target < nums[0]) {

            result = 0;

        }else{

            result = binarySearch(nums,target);

            while( result == -1){
                result = binarySearch(nums , --target);
                if(result != -1)
                {
                    result += 1;
                    break;
                }
            }


        }

        return result;




    }

    public int binarySearch(int [] nums , int target){

        int high = nums.length - 1;
        int low = 0;
        int index = -1;
        while(low <= high){

            int mid = (high + low) / 2;

            if(nums[mid] == target)
            {
                index = mid;
                break;
            }
            else if(target > nums[mid]){
                low = mid + 1;
            }

            else high = mid - 1;

        }

        return index;

    }

}
