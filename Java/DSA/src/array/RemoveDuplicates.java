package array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr));
        removeDuplicates(arr);
        System.out.println("Output :");
        System.out.println(Arrays.toString(arr));
    }


    static int removeDuplicates(int[] arr) {

        int n = arr.length;

        if (n == 1) {
            return n;
        }

        int i = 0;
        int j = 0;

        while (i < n - 1) {

            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
            i++;

        }
        arr[j++] = arr[n - 1];

        return j;

    }

}
