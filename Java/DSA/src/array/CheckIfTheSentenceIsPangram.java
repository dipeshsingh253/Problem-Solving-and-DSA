package array;

public class CheckIfTheSentenceIsPangram {

    //Question Link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
    public boolean checkIfPangram(String sentence) {
        int res = 0;
        char temp = 'a';
        for (int i = 0; i < 26; i++) {
            if (sentence.contains(String.valueOf(temp))) {
                res++;
            }
            temp++;
        }
        return res == 26;

    }

    public boolean checkIfPangram2(String sentence) {

        int[] res = new int[26];

        for (char c : sentence.toCharArray()) {

            res[(int) c - 97] = 1;

            // System.out.println((int)c);

        }

        for (int i : res) {
            if (i == 0) {
                return false;
            }
        }

        return true;

    }


}
