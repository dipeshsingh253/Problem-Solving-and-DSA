package array;

import java.util.Arrays;
import java.util.Scanner;

public class PivotIndex {

    public static void main(String[] args) {

        //Question Link : https://leetcode.com/problems/find-pivot-index/
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

    static int findPivotIndex(int[] arr){

        int sum = 0;

        for (int i : arr){
            sum+=i;
        }

        int rsum = sum;
        int lsum = 0;
        for (int i=0;i<arr.length;i++){

            rsum-=arr[i];

            if (lsum==rsum){
                return i;
            }

            lsum+=arr[i];

        }

        return -1;
    }

}
