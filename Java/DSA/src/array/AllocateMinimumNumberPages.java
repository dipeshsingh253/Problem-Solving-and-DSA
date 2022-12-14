package array;

import java.util.Arrays;
import java.util.Scanner;

public class AllocateMinimumNumberPages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(arr) + " " + n + " " + m);
        System.out.println(findMinimum(arr, n, m));
    }


    public static int findMinimum(int[] arr, int n, int m) {

        int low = returnMax(arr, n);

        int high = sumOfArray(arr);

        System.out.println(low + " " + high);

        while (low < high) {

            int mid = low + (high - low) / 2;

            int pages = 0;
            int students = 1;

            for (int i = 0; i < n; i++) {
                pages += arr[i];
                if (pages > mid) {
                    pages = arr[i];
                    students++;
                }

                if (students > m) {
                    break;
                }
            }
//            System.out.println(students + " " + mid);
            if (students <= m) {
                high = mid;
            } else {
                low = mid + 1;
            }


        }


        return low;

    }

    static int sumOfArray(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;

    }

    public static int returnMax(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }


        return Math.max(arr[n - 1], returnMax(arr, n - 1));

    }


}
