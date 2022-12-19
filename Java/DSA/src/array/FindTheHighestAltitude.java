package array;

public class FindTheHighestAltitude {


    //Question Link : https://leetcode.com/problems/find-the-highest-altitude/description/
    public int largestAltitude(int[] gain) {

        int[] res = new int[gain.length];
        res[0] = gain[0];
        int ans = gain[0];

        for (int i = 1; i < gain.length; i++) {
            res[i] = gain[i] + res[i - 1];
            if (res[i] > ans) {
                ans = res[i];
            }
        }


        return ans <= 0 ? 0 : ans;


    }

}
