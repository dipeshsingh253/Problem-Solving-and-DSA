package math;

import java.util.Scanner;

public class NcR {

    public static void main(String[] args) {


        //Solution : https://www.geeksforgeeks.org/program-to-calculate-the-value-of-ncr-efficiently/
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.println("Input :" + n + " " + r);


        System.out.println("Output :" + findNcR(n, r, 1000000007));
    }

    public static int findNcR(int n, int r, int p) {

        int[] res = new int[r + 1];

        res[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--) {
                res[j] = (res[j] + res[j - 1]) % p;
            }
        }
        return res[r];


    }


}
