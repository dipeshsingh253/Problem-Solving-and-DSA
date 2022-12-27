package masai;

import java.util.Scanner;

public class IsItTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while(tc-- > 0){
            // a,b,c are three sides of triangle

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            ans(a,b,c);

        }

    }

    public static void ans(int a,int b,int c) {

        if(a+b>c && b+c>a && a+c>b)
            System.out.println("Yes");
        else
            System.out.println("No");

    }


}
