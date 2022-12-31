package string;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    // Link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

    public int strStr(String haystack, String needle) {


         if(!haystack.contains(needle))
             return -1;



         for(int i=0;i<=haystack.length()-needle.length();i++){

             if(haystack.substring(i,i+needle.length()).equals(needle)){
                 return i;
             }

         }

         return -1;

    }

    public int strStr2(String haystack, String needle) {


        int n = needle.length();

        int k=0,count=0;

        for(int i=0;i<haystack.length()-n+1;i++){
            k=0;
            for(int j=i;j<i+n;j++){
                if(haystack.charAt(j) == needle.charAt(k))
                    count++;
                k++;
            }
            if(count == needle.length()){
                return i;
            }
            count = 0;
        }

        return -1;

    }


}
