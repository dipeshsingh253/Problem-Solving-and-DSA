package array;

import java.util.Arrays;
import java.util.Scanner;

public class LeftAndRightRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }
        int k = scanner.nextInt();
        System.out.println("Input :" + Arrays.toString(arr) + " " + n + " " + k);
//        bruteForceRightRotate(n, arr, k);
        effcientRightRotate(n, arr, k);

        System.out.println(Arrays.toString(arr));

    }


    static void effcientRightRotate(int n, int[] arr, int k) {
        k %= n; // for multiples of same permutations to remove duplicate results and improve complexity , also for length where n < k this gets the indices for reversing
        reversePortion(arr, 0, n - 1);
        reversePortion(arr, 0, k - 1);
        reversePortion(arr, k, n - 1);

    }

    private static void reversePortion(int[] arr, int start, int end) {

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }


    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    static void bruteForceRightRotate(int n, int[] arr, int k) {

        while (k-- > 0) {

            int temp = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;

        }

    }


}
