package string;

public class ToLowerCase {


    // Link : https://leetcode.com/problems/to-lower-case/description/

    public String toLowerCase(String s) {


        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){

            if(c>=65 && c<=90){

                char low = (char)(c + 32);

                sb.append(low);
            }else{
                sb.append(c);
            }

        }

        return sb.toString();


    }
}
