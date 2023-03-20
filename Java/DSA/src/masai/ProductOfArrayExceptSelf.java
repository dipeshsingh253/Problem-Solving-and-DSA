package masai;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        productArrayExceptSelf(n, arr);


    }

    static void productArrayExceptSelf(int n, int[] arr) {
//CanPlaceFlower Explanation  => https://www.enjoyalgorithms.com/blog/product-of-array-except-self
        int[] pref = new int[n];
        pref[0] = 1;

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] * arr[i - 1];
        }


        int[] suff = new int[n];
        suff[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * arr[i + 1];
        }

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }

//        System.out.println(Arrays.toString(res));

        printArray(res);
    }




    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

}
