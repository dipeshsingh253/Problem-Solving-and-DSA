package array;

public class DetermineWhetherMatrixCanBeObtainedByRotation {

    // Question Link : https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/


    static boolean isEqual(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }

        }

        return true;
    }

    static void makeAcuteRotate(int[][] mat) {
        int n = mat.length;

        transpose(mat);


        for (int i = 0; i < n / 2; i++) {
            int[] temp = mat[i];
            mat[i] = mat[n - 1 - i];
            mat[n - 1 - i] = temp;
        }


    }

    static void transpose(int[][] mat) {

        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

    }

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i <= 3; i++) {

            makeAcuteRotate(mat);


            if (isEqual(mat, target)) {
                return true;
            }

        }

        return false;

    }


}
