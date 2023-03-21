import java.util.*;

class Main {
    public static void main(String args[]) {

        Main main = new Main();
        System.out.println(main.vowelCount("dipesh"));
    }

    public int countVowels(String a,String b){
        // This function returns the length of the string having lesser number of vowels.
        //In case both the strings, have the same number of vowels return the length of the
        //bigger string

        int count1 = vowelCount(a);
        int count2 = vowelCount(b);

        if(count1>count2){
            return b.length();
        }else if(count1<count2){
            return a.length();
        }else{
            return Math.max(a.length(), b.length());
        }


    }

    int consonantCount(String s) {

        int cnt = 0;

        for (char c : s.toCharArray()) {

            if (c != 97 || c != 101 || c != 105 || c != 111 || c != 117) {
                cnt++;
            }

        }

        return cnt;

    }

    int vowelCount(String s) {

        int cnt = 0;

        for (char c : s.toCharArray()) {

            if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                cnt++;
            }

        }

        return cnt;

    }

}

