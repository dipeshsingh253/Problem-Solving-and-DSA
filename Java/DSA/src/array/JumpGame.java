package array;

public class JumpGame {

    //Question Link : https://leetcode.com/problems/jump-game/description/

    public boolean canJump(int[] nums) {



        if(nums.length<2) return true;

        // if(!containZero(nums)) return true; // if there are no zeroes in array then it is always possible to jump till the last index

        for(int i=nums.length-2;i>=0;i--){

            if(nums[i]==0){

                int jumps = 1;

                while(jumps > nums[i]){

                    jumps++;
                    i--;

                    if(i < 0) return false;

                }


            }

        }

        return true;


        // tried to implement another solution

        //     for(int i = nums.length - 2;i>=0;i--){

        //         if(nums[i] == 0){



        //             // for(int j = 0 ;j<i;j++){

        //             //     int minJumps = j - i -1;

        //             //     if(isPoss(minJumps,nums[j])){
        //             //         break;
        //             //     }
        //             //         i--;


        //             //     if(i<0) return false;

        //             // }
        //             int j = 0;
        //             int minJumps = j - i -1;
        //             int cur  = i;

        //             while(!isPoss(minJumps,nums[j])){

        //                    minJumps = j - i -1;
        //                    j++;
        //                    i--;

        //                    if(j > nums.length-1 ){
        //                        return false;
        //                    }else if(j == cur){
        //                        break;
        //                    }

        //             }


        //         }


        //     }

        //     return true;


    }


//    static boolean isPoss(int minJump, int jump){
//        return minJump<=jump?false:true;
//    }

    static boolean containZero(int[] arr){


        for(int i: arr)
            if(i==0) return true;


        return false;
    }

}
