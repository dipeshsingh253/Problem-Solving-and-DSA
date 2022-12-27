package masai;

import java.util.Scanner;

public class RotateTheArrayReturnsBack {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] nums = new int[n];

            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }

            ans(n,k,nums);

        }

    }

    public static void ans(int n,int k,int[] nums) {

        // System.out.println(n+" "+k+" "+Arrays.toString(nums));

        k = k%n;

        reversePartial(nums,0,n-1);
        reversePartial(nums,0,k-1);
        reversePartial(nums,k,n-1);
        // System.out.println("Rev :"+Arrays.toString(nums));

        for(int i:nums)
            System.out.print(i+" ");

        System.out.println();

    }

    static void reversePartial(int[] nums,int start,int end){

        while(start<end){
            swap(nums,start++,end--);
        }

    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
