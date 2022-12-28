package string;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        // int n = indices.length;

        // char[] res = new char[n];

        // for(int i=0;i<n;i++){
        //     res[indices[i]] = s.charAt(i);
        // }

        // return new String(res);


        StringBuilder ans = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (indices[j] == i) {
                    ans.append(s.charAt(j));
                    break;
                }
            }
        }
        //    System.out.println(ans);
        return ans.toString();


    }


}
