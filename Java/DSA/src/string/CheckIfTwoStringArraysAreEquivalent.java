package string;

public class CheckIfTwoStringArraysAreEquivalent {

    // Link : https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {


        StringBuilder s1 = new StringBuilder();

        StringBuilder s2 = new StringBuilder();



        for(String st: word1){
            s1.append(st);
        }

        for(String st: word2){
            s2.append(st);
        }


        return s1.toString().equals(s2.toString());

    }


}
