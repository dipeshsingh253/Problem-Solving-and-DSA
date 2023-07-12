package sorting;

public class MergeSort {

    public static  void  main(String[] args){

        int[] nums = {1,8,5,6,9,8,4};

        sort(nums,0,nums.length - 1);
        printArray(nums);

    }

    public static void sort(int[] nums,int l, int r){

        if(l < r){
            int mid = l + (r-l)/2;

            sort(nums,l,mid);
            sort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }

    }

    public static void merge(int[]nums,int l,int m,int r){

        int ln = m - l + 1;
        int rn = r - m;

        int[] lnums = new int[ln];
        int[] rnums = new int[rn];

        for(int i=0;i<ln;i++){
            lnums[i] = nums[l + i];
        }

        for(int i=0;i<rn;i++){
            rnums[i] = nums[m + i + 1];
        }


        int i = 0;
        int j = 0;
        int k = l;

        while(i < ln && j < rn){
            if(lnums[i] < rnums[j]){
                nums[k++] = lnums[i++];
            }else{
                nums[k++] = rnums[j++];
            }
        }

    }

    public static void printArray(int[] array){
        
        for(int i : array)
            System.out.println(i);

    }


}
