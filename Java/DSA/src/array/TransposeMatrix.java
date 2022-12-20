package array;

public class TransposeMatrix {

    // Question Link : https://leetcode.com/problems/transpose-matrix/submissions/862235689/

    public int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] newMat = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                newMat[j][i] = matrix[i][j];
            }
        }

        return newMat;


    }

}
