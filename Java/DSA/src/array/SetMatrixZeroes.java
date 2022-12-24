package array;

public class SetMatrixZeroes {

    // Question Link : https://leetcode.com/problems/set-matrix-zeroes/description/

    public void setZeroes(int[][] matrix) {

        int row[]=new int[200];
        int column[]=new int [200];
        int k=0;
        int l=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[k]=i;
                    column[l]=j;
                    k++;
                    l++;
                }
            }
        }
        for(int m=0;m<k;m++){
            int r=row[m];
            int c=column[m];
            for(int n=0;n<matrix.length;n++){
                matrix[n][c]=0;
            }
            for(int o=0;o<matrix[0].length;o++){
                matrix[r][o]=0;
            }
        }

    }
}
