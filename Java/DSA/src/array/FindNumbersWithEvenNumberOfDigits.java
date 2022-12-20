package array;

public class FindNumbersWithEvenNumberOfDigits {

    // Question Link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    static int provideCount(int n) {

        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;

    }

    public int findNumbers(int[] nums) {

        int ans = 0;

        for (int i : nums) {
            if ((provideCount(i)) % 2 == 0) {
                ans++;
            }
        }

        return ans;

    }

}
