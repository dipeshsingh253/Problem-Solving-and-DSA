package array;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {


    // Question Link : https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

    static boolean isMinimumInRow(int[][] mat, int target, int row) {

        int col = 0;

        while (col < mat[0].length) {

            if (mat[row][col] < target) {
                return false;
            }
            col++;
        }

        return true;

    }

    static boolean isMaximumInColumn(int[][] mat, int target, int col) {

        int row = 0;

        while (row < mat.length) {
            if (mat[row][col] > target) {
                return false;
            }
            row++;
        }

        return true;

    }

    public List<Integer> luckyNumbers(int[][] matrix) {

        int[] mini = new int[matrix.length];
        int[] index = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            mini[i] = matrix[i][0];
            index[i] = 0;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] < mini[i]) {
                    mini[i] = matrix[i][j];
                    index[i] = j;
                }
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            int flag = 0;
            for (int j = 0; j < matrix.length; j++) {
                int x = index[i];
                if (mini[i] < matrix[j][x]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                list.add(mini[i]);
            }
        }
        return list;
    }

    public List<Integer> luckyNumbersBrute(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[0].length; col++) {

                if (isMaximumInColumn(matrix, matrix[row][col], col) && isMinimumInRow(matrix, matrix[row][col], row)) {
                    ans.add(matrix[row][col]);
                }

            }

        }


        return ans;


    }

}
