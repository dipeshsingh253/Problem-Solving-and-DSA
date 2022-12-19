package array;

public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int j = 0;

        for(int i=0;i<mat.length;i++){
            if(i==j && i != mat.length-1-i){
                sum += mat[i][j];
                sum += mat[i][mat.length-1-j];
            }if(i==j && i == mat.length-1-i){
                sum += mat[i][j];
            }
            j++;
        }

        return sum;


    }

}
