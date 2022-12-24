package array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    // Question Link : https://leetcode.com/problems/spiral-matrix/description/


    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int N = matrix.length;
        int M = matrix[0].length;

        int top = 0;
        int bottom = N-1;
        int left = 0;
        int right = M-1;
        int count = 0;


        while(count<N*M){
            for( int  i = left;i<=right&&count<N*M;i++){
                ans.add(matrix[top][i]);
                count++;
            }

            top++;

            for(int i =top;i<=bottom&&count<N*M;i++){
                ans.add(matrix[i][right]);
                count++;
            }

            right--;

            for( int i= right;i>=left&&count<N*M;i--){
                ans.add(matrix[bottom][i]);
                count++;
            }

            bottom--;

            for(int i = bottom;i>=top&&count<N*M;i--){
                ans.add(matrix[i][left]);
                count++;
            }

            left++;

        }

        return ans;
    }

}
