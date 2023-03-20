package masai;

import java.util.Arrays;
import java.util.Scanner;

public class MakeWaveArray {

    public static void main(String[] args) {
//CanPlaceFlower Link : https://www.geeksforgeeks.org/sort-array-wave-form-2/
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = scanner.nextInt();

        }

        printWaveArray(n, arr);
    }


    public static void printWaveArray(int n, int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i = i + 2) {

            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }


//        System.out.println(Arrays.toString(arr));

        printArray(arr);
    }

//    public static void printWaveArray2(int n, int[] arr) {
//        int swaps = 0;
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//                swaps++;
//            }
//
//        }
//        System.out.println(swaps);
//        if (swaps == 0) {
//            printArray(arr);
//        } else {
//            printWaveArray2(n, arr);
//        }
//
//
//    }


    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

}
