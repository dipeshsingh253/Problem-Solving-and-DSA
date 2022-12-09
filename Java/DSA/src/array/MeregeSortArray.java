package array;

import java.util.Arrays;
import java.util.Scanner;

public class MeregeSortArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        int n = scanner.nextInt();
        String[] tokens1 = s1.split(" ");

        int[] nums1 = new int[tokens1.length];

        for (int i = 0; i < tokens1.length; i++) {
            nums1[i] = Integer.parseInt(tokens1[i]);
        }
        scanner.nextLine();
        String s2 = scanner.nextLine();
        int m = scanner.nextInt();
        String[] tokens2 = s2.split(" ");

        int[] nums2 = new int[tokens2.length];

        for (int i = 0; i < tokens2.length; i++) {
            nums2[i] = Integer.parseInt(tokens2[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(nums1) + Arrays.toString(nums2) + n + " " + m);
//        merge(nums1, m, nums2, n);
        mergePointers(nums1, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        System.arraycopy(nums2, 0, nums1, m, n);
//        for (int i = m; i < m + n; i++) {
//            nums1[i] = nums2[i - m];
//        }
        Arrays.sort(nums1);


    }

    static void mergePointers(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i < 0 || nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }

            System.out.println(Arrays.toString(nums1) + " " + i + " " + j + " " + k);
        }

    }
}
