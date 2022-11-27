package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class SumTriangleFromArray {


    public static void main(String[] args) {

//Question Link : https://www.geeksforgeeks.org/sum-triangle-from-array/


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for(int i=0;i<tokens.length;i++){
            arr[i] = Integer.parseInt(tokens[i]);
        }
        System.out.println("Input :");
        System.out.println(Arrays.toString(arr));

        System.out.println("Output");
        printTriangle(arr);

    }

    static void printTriangle(int[] arr){
    //Base condititon
        if (arr.length < 1){
            return;
        }

        int[] sums = new int[arr.length-1];
//summing all the consecutive elements and storing into sums array
        for (int i=0;i< arr.length-1;i++){
            sums[i] = arr[i]+arr[i+1];
        }
//passing the new creates sums array so it can sum all the consecutive elements again (basically repeating the same process)
        printTriangle(sums);
//printing the statement at the removal of functions from call stack
        System.out.println(Arrays.toString(arr));

    }


}
