package array;

public class FlippingAnImage {

    //Question Link : https://leetcode.com/problems/flipping-an-image/description/
    // [[1,1,0], => 0 1 1 => 1 0 0
    // [1,0,1], => 1 0 1 => 0 1 0
    // [0,0,0]] => 0 0 0 => 1 1 1
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;
        int m = image[0].length;

        for(int i = 0 ;i<n;i++){
            reverse(image[i],m);
            invert(image[i],m);
        }
        return image;
    }
    static void invert(int[] arr, int n){
        for(int j = 0 ;j<n;j++){
            if(arr[j] == 0){
                arr[j] = 1;
            }else{
                arr[j] = 0;
            }
        }
    }
    static void reverse(int[] arr,int n){

        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

    }

}
