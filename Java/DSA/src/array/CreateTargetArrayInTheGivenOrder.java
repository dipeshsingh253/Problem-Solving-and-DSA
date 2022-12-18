package array;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayInTheGivenOrder {

    //Question Link : https://leetcode.com/problems/create-target-array-in-the-given-order/


    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);

        }

        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;

    }

}
