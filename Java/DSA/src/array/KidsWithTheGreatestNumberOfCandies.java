package array;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    //Question Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

    static int provideMax(int[] arr, int index) {

        if (index == 1) {
            return arr[0];
        }

        return Math.max(arr[index - 1], provideMax(arr, index - 1));

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> res = new ArrayList<>();

        int max = provideMax(candies, candies.length);

        for (int candy : candies) {

            int nextCandy = candy + extraCandies;

            if (nextCandy >= max) {
                res.add(true);
            } else {
                res.add(false);
            }

        }

        return res;


    }

}
