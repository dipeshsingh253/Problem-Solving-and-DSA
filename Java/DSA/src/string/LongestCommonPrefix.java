package string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {


        // Link :https://leetcode.com/problems/longest-common-prefix/description/
        int min = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<min;i++){
            char c = strs[0].charAt(i);
            int count=1;
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)==c){
                    count++;
                }
            }
            if(count == strs.length){
                ans.append(strs[0].charAt(i));
            }else{
                break;
            }
        }

        return ans.toString();

    }

}
