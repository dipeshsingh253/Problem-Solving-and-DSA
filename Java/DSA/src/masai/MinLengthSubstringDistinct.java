package masai;

import java.util.Scanner;

public class MinLengthSubstringDistinct {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        ans(s);


    }
    public static void ans(String s) {

        int n = s.length();

        int maxDiff = countDistinct(s);

        int ans = n;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<=n;j++){

                String sub = s.substring(i,j);
                int currDist = countDistinct(sub);

                if(maxDiff<=currDist && ans>sub.length()){
                    ans = sub.length();
                }

            }

        }

        System.out.println(ans);



    }

    static int countDistinct(String s){

        int[] freq = new int[26];

        int count = 0;

        for(int i=0;i<s.length();i++){

            freq[s.charAt(i)-'a']++;

            if(freq[s.charAt(i)-'a']==1){
                count++;
            }

        }

        // System.out.println(Arrays.toString(freq));

        return count;

    }
}
