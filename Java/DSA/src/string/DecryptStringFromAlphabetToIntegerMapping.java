package string;

public class DecryptStringFromAlphabetToIntegerMapping {


    // Link : https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/


    public String freqAlphabets(String s) {

        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            if (i < n - 2 && s.charAt(i + 2) == '#') {


                char temp = (char) (96 + Integer.valueOf(s.charAt(i) + "" + s.charAt(i + 1)));

                sb.append(temp);

                i += 2;
            } else {

                sb.append((char) (96 + Integer.valueOf(s.charAt(i) + "")));
            }

        }


        return sb.toString();
    }

    public String freqAlphabets2(String s) {

        StringBuilder ans = new StringBuilder();

        char alphabet[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {

                String temp2 = s.substring(i, i + 2);
                int index2 = Integer.parseInt(temp2);
                // System.out.println(i);
                // System.out.println(index2);
                ans.append(alphabet[index2 - 1]);
                i = i + 2;
            } else {
                char temp = s.charAt(i);
                int index = Character.getNumericValue(temp);
                ans.append(alphabet[index - 1]);
            }
        }
        return ans.toString();
    }
}
