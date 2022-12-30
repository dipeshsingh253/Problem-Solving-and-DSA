package string;

public class ReverseWordsinaStringIII {


    // Question Link : https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

    public String reverseWords2(String s) {

        StringBuilder ans = new StringBuilder();
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            StringBuilder temp = new StringBuilder(words[i]);
            temp.reverse();
            if (i == words.length - 1) ans.append(temp);
            else ans.append(temp + " ");
        }
        return ans.toString();


    }

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            String reversedWord = reverseIt(word);

            // System.out.pri

            if (i == words.length - 1) {
                reversedString.append(reversedWord);
            } else {
                reversedString.append(reversedWord + " ");
            }

        }

        return reversedString.toString();


    }


    static String reverseIt(String s) {

        StringBuilder rev = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {

            rev.append(s.charAt(i));

        }

        return rev.toString();

    }


}
