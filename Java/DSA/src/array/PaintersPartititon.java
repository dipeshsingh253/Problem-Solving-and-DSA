package array;

import java.util.Arrays;
import java.util.Scanner;

public class PaintersPartititon {

    public static void main(String[] args) {


        //Question Link : https://practice.geeksforgeeks.org/problems/the-painters-partition-problem1535/1

        //This was a very nice question

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }


        System.out.println(Arrays.toString(arr) + " " + k);

        minTime(arr, n, k);
    }


    static long minTime(int[] arr, int n, int k) {
//        Arrays.sort(arr);

        long low = findMax(arr, n);

        long high = 0;

        for (int i : arr) {
            high += i;
        }


        while (low < high) {

            long mid = low + (high - low) / 2;
            long painters = 1;
            long time = 0;
            for (int i = 0; i < n; i++) {

                time += arr[i];

                if (time > mid) {
                    time = arr[i];
                    painters++;
                }

            }

            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }

        return low;
    }


    static int findMax(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }


        return Math.max(arr[n - 1], findMax(arr, n - 1));

    }

}
