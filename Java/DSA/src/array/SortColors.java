package array;

import java.util.Arrays;
import java.util.Scanner;

public class SortColors {

    public static void main(String[] args) {

        //Question Link : https://leetcode.com/problems/sort-colors/
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public void sortColorsBrute(int[] arr) {
        // Reference Link : https://www.geeksforgeeks.org/stable-and-unstable-sorting-algorithms/
        //Bubble Sort : Stable sorting algorithm
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }

    public void sortColors(int[] arr) {

        int n = arr.length;


        int high = n - 1;
        int low = 0;
        int i = 0;

        while (i <= high) {

            if (arr[i] == 0) {
                swap(arr, i, low);
                i++;
                low++;
            } else if (arr[i] == 2) {
                swap(arr, i, high);
                high--;
            } else {
                i++;
            }

        }


    }

}
