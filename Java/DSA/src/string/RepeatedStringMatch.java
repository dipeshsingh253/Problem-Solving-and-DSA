package string;

public class RepeatedStringMatch {


    //Link : https://leetcode.com/problems/repeated-string-match/description/
    public int repeatedStringMatch(String a, String b) {

        StringBuilder str = new StringBuilder();

        int count = 0;

        while (str.length() < b.length()) {
            str.append(a);
            count++;
        }

        if (str.toString().contains(b)) return count;
        str.append(a);
        count++;
        if (str.toString().contains(b)) return count;
        return -1;

    }

}
