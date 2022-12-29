package string;

public class DetermineIfStringHalvesAreAlike {


    //Link : https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

    public boolean halvesAreAlike(String s) {


        int n = s.length();

        int count1 = 0;
        int count2 = 0;

        String vowels = "AEIOUaeiou";

        for(int i=0;i<n/2;i++){

            if(vowels.contains(s.charAt(i)+"")){
                count1++;
            }

            if(vowels.contains(s.charAt(n-i-1)+"")){
                count2++;
            }
        }



        return count1==count2?true:false;




    }

}
