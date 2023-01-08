package string;

public class SwapAdjacentInLRString {


    // Link : https://leetcode.com/problems/swap-adjacent-in-lr-string/description/
    public boolean canTransform(String start, String end) {

        int f = 0;
        int s = 0;
        while(f < start.length() || s < end.length()) {

            while(f < start.length() && start.charAt(f) == 'X')
            {
                f++;
            }
            while(s < end.length() && end.charAt(s) == 'X'){

                s++;
            }

            if (f == start.length() || s == end.length()) return s == end.length() && f == start.length();

            char stChar = start.charAt(f);
            char enChar = end.charAt(s);

            if (stChar != enChar) return false;

            if (stChar == 'R' && f > s) return false;

            if (stChar == 'L' && f < s) return false;

            f++;
            s++;
        }
        return true;

        // int n = start.length();
        // int m = end.length();


        // int i = 0;
        // int j = 0;

        // while(i<n || j<m){


        //     while(i<n && start.charAt(i) == 'X'){
        //         i++;
        //     }

        //     while(j<m && end.charAt(j) == 'X'){
        //         j++;
        //     }

        //     System.out.println(i+" "+j);

        //     if(i == n && j == m){
        //         return true;
        //     }

        //     if(i == n || j == m){
        //         return false;
        //     }

        //     char st = start.charAt(i);
        //     char en = end.charAt(j);

        //     if(st != en) return false;

        //     if(st == 'R' && i > j) return false;

        //     if(st == 'L' && j < i) return false;


        //     i++;
        //     j++;

        // }

        // return true;


    }

}
