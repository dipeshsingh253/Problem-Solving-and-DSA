package string;

public class ValidPalindrome {

    // Link : https://leetcode.com/problems/valid-palindrome/description/

    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        // String.
// num 48 - 57 al 97 122 cap 65 - 90
        for(int i=0;i<s.length();i++){

            int c = s.charAt(i);

            if(isNum(c) || isSmall(c) || isCapital(c)){

                sb.append((char)c);

            }


        }

        String rev = sb.toString().toLowerCase();

        String temp = (new StringBuilder(rev)).reverse().toString();

        System.out.println(rev + " " + temp);

        return rev.equals(temp) ? true : false;


    }


    static boolean isNum(int i){
        return i>=48 && i<=57 ? true: false;
    }

    static boolean isSmall(int i){
        return i>=97 && i<=122 ? true : false;
    }

    static boolean isCapital(int i){
        return i>=65 && i<=90 ? true : false;
    }

}
