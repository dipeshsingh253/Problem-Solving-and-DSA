package masai;

import java.util.Scanner;

public class PrintAllSubStrings {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

        String s = scanner.nextLine();

        printSub2(n, s);

    }


    public static void printSub(int n, String str) {


        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {

                String ans = str.substring(i, j);
                System.out.println(ans);
            }

        }


    }


    public static void printSub2(int n, String str) {

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {
                String ans = "";
                for (int k = i; k < j; k++) {
                    ans += str.charAt(k);
                }
                System.out.println(ans);
            }

        }


    }


}
