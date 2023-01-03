package string;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    // Link : https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

    public boolean checkOnesSegment(String s) {

        int i;

        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') continue;
            else break;
        }

        for (int j = i; j < s.length(); j++) {
            if (s.charAt(j) == '0') continue;
            else return false;
        }

        return true;


    }

}
