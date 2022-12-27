package masai;

import java.util.Scanner;

public class GenerateAllSubstrings {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int tc = s.nextInt();

        while(tc-- > 0){
            int n = s.nextInt();
            s.nextLine();
            String str = s.nextLine();
            ans(n,str);

        }


    }
    public static void ans(int n,String str) {

        // System.out.println(n + " " +str);


        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub = str.substring(i,j);

                System.out.println(sub);
            }
        }

    }


}
