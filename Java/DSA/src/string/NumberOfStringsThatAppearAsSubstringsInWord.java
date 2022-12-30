package string;

public class NumberOfStringsThatAppearAsSubstringsInWord {

    // Question Link : https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/


    public int numOfStrings(String[] patterns, String word) {

        int count = 0;

        for (String s : patterns) {

            if (word.contains(s)) {
                count++;
            }

        }

        return count;


    }

}
