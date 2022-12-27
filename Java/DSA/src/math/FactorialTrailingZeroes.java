package math;

import java.util.Scanner;

public class FactorialTrailingZeroes {

    public static void main(String[] args) {

        //Question Link => https://leetcode.com/problems/factorial-trailing-zeroes/

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Input :" + n);

        System.out.println("Output :" + noOfTrailingZeroes(n));

    }

    static int noOfTrailingZeroes(int n) {

        int count = 0;

        while (n >= 5) {

            int fact = n % 5;
            count += fact;
            n = n / 5;

        }

        return count;

    }

}
