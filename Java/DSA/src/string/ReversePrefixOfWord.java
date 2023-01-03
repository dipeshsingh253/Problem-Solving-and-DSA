package string;

public class ReversePrefixOfWord {

    // Link : https://leetcode.com/problems/reverse-prefix-of-word/description/

    public String reversePrefix(String word, char ch) {

        if(!word.contains(ch+"")) return word;

        int i=0;

        StringBuilder ans = new StringBuilder();

        for( i=0;i<word.length();i++){
            if(word.charAt(i)==ch)
                break;
        }

        StringBuilder temp = new StringBuilder();

        temp.append(word.substring(0,i+1));
        //  System.out.println(temp);
        temp.reverse();
        ans.append(temp);
        ans.append(word.substring(i+1,word.length()));
        return ans.toString();

    }


}
