package array;

public class FindNUniqueIntegersSumUpToZero {

    // Question Link : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/


    public int[] sumZero(int n) {

        int[] ans = new int[n];


        int curr = n / 2;

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            ans[i] = curr;
            ans[j] = -1 * curr;
            curr--;
            i++;
            j--;
        }

        return ans;

    }

}
