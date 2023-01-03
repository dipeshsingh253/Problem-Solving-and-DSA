package string;

public class MergeStringsAlternately {

    //Link : https://leetcode.com/problems/merge-strings-alternately/description/

    public String mergeAlternatelyBrute(String word1, String word2) {
    //bruteforce
        StringBuilder ans = new StringBuilder();

        if(word1.length()==0 && word2.length()!=0){
            ans.append(word2);
            return ans.toString();
        }
        if(word2.length()==0 && word1.length()!=0){
            ans.append(word1);
            return ans.toString();
        }

        int minLen,maxLen;
        if(word1.length()<word2.length()){
            minLen = word1.length();
            maxLen = word2.length();
        }else{
            minLen = word2.length();
            maxLen = word1.length();
        }

        int i=0;
        for(i=0;i<minLen;i++){
            ans.append(word1.charAt(i));
            ans.append(word2.charAt(i));
        }

        for(int j=i;j<maxLen;j++){
            if(word1.length()==maxLen)
                ans.append(word1.charAt(j));
            else
                ans.append(word2.charAt(j));
        }
        return ans.toString();

    }


    public String mergeAlternately(String word1, String word2) {

        // two pointers

        int n = word1.length();
        int m = word2.length();


        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i<n || j<m){

            if(i<n) {
                ans.append(word1.charAt(i)+"");
                i++;
            }

            if(j<m){
                ans.append(word2.charAt(j)+"");
                j++;
            }

        }

        return ans.toString();
    }

}
