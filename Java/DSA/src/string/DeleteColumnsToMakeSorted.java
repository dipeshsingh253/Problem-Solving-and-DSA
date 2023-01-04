package string;

public class DeleteColumnsToMakeSorted {

    // Link : https://leetcode.com/problems/delete-columns-to-make-sorted/description/


    public int minDeletionSize(String[] strs) {

        int flag = 0;
        int count = 0;

        if (strs.length == 0 || strs.length == 1)
            return 0;
        if (strs[0].length() == 0)
            return 0;
        for (int i = 0; i < strs[0].length(); i++) {
            char min = strs[0].charAt(i);
            flag = 0;
            for (int j = 1; j < strs.length; j++) {
                if (min > strs[j].charAt(i)) {
                    flag = 1;
                } else {
                    min = strs[j].charAt(i);
                }
            }
            if (flag == 1) {
                count++;
            }
        }
        return count;
    }


}
