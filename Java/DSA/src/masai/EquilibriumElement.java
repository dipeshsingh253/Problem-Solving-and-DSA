package masai;

import java.util.Scanner;

public class EquilibriumElement {


    public static void main(String[] args) {
        // System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){

            nums[i] = sc.nextInt();

        }

        ans(n,nums);


    }
    public static void ans(int n,int[] nums) {

        int left = 0;
        int right = n-1;

        // int lsum = 0;
        // int rsum = 0;

        int sum = 0;

        while(left<right){

            // lsum+=nums[left++];
            // rsum+=nums[right--];

            // if(lsum == rsum){
            //   System.out.println(right+1);
            //   return;
            // }

            sum+=nums[left++]-nums[right--];

            if(sum==0){
                System.out.println(right+1);
                return;
            }

        }

        System.out.println(-1);


    }
}
