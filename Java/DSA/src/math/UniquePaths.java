package math;

import java.util.Scanner;

import static math.NcR.findNcR;

public class UniquePaths {

    public static void main(String[] args) {
//Question Link : https://leetcode.com/problems/unique-paths/
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("Input :" + m + " " + n);

        System.out.println("Output :" + uniquePaths(m, n));
    }


    public static int uniquePaths(int m, int n) {
//basic mathematics : we know that we can move only m-1 times towards bottom and only n-1 times towards right because our and goal is to rich the bottom-right cell
// so we will find all unique permutations for the given range :
/*
    we know that if
    for m = 3 and n = 7
    if the path is let say(of length (m-1+n-1)) => R R R R R R D D (minimum number of steps will be m+n-2 for any path you choose)
    for above path no of unique permutations can be found using => 8!/6!*2! => 8C2 or 8C(8-2) or 8C6 => (m+n-2)C(m-1) or (m+n-2)C(n-1)
 */
        return findNcR(m + n - 2, m - 1, 2000000009);

    }

}
