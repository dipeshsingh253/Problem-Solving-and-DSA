package math;

import java.util.Scanner;

public class NumberofDigitOne {

    public static void main(String[] args) {


        //Question Link => https://leetcode.com/problems/number-of-digit-one/

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println("Input :" + n);

        System.out.println("Output :" + findCountOfDigitOne(n));


    }


    static int findCountOfDigitOne(int n) {
//tle error
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int j = i;

            while (j != 0) {

                if (j % 10 == 1) {
                    count++;
                }

                j /= 10;


            }

        }

        return count;

    }
}
