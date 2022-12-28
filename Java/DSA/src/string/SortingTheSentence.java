package string;

public class SortingTheSentence {

    //https://leetcode.com/problems/sorting-the-sentence/submissions/866470835/
    public String sortSentence(String s) {

        String []ans = new String[s.split(" ").length];

        for(String st: s.split(" ")){
            ans[st.charAt(st.length()-1) - '1'] = st.substring(0,st.length()-1);
        }

        return String.join(" ", ans);
    }


}
