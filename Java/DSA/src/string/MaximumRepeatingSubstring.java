package string;

public class MaximumRepeatingSubstring {

    // Link : https://leetcode.com/problems/maximum-repeating-substring/description/

    public int maxRepeating(String sequence, String word) {

        int count=0;

        String temp = word;

        while(sequence.contains(temp)){
            count++;
            temp+=word;
        }

        return count;

    }

// aaaba aaaba aab aaaaba aaaba aaabaa aaba
// aaaba
// ababc ba => baba

}
