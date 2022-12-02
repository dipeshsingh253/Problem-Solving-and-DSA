package math;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {


    static int findMissing(int[] arr, int n) {

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] != i) {
                return i;
            }
        }

        return -1;

    }


    static int findMissingUsingSumOfNaturalNumbers(int[] arr, int n) {


        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n - 1; i++) {
            sum -= arr[i];
        }

        return sum;

    }

    public static void main(String[] args) {
        // Question Link => https://www.geeksforgeeks.org/find-the-missing-number/

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr) + "=>" + n);

        System.out.println("Output :");
        System.out.println(findMissingUsingSumOfNaturalNumbers(arr, n));


    }


}
