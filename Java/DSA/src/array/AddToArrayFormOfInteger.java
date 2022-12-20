package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger {

    // Question Link : https://leetcode.com/problems/add-to-array-form-of-integer/description/


    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            int sum = num[i] + (k % 10);
            if (sum >= 10) {
                ans.add(sum % 10);
                k = (k / 10) + 1;
            } else {
                ans.add(sum);
                k = k / 10;
            }


        }

        while (k != 0) {
            ans.add(k % 10);
            k = k / 10;
        }

        Collections.reverse(ans);
        return ans;

    }


}
