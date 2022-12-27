package masai;

public class MasaiPalindromicSubstring {
    public static void masaiPalindromicSubstring(String str) {

        // System.out.println(isPalindrome("madamm"));

        if (isPalindrome(str)) {
            System.out.println(str.length());
            return;
        }


        int n = str.length();
        int max = 0;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j <= n; j++) {

                String sub = str.substring(i, j);

                if (isPalindrome(sub) && sub.length() > max) {
                    max = sub.length();
                }

            }

        }

        System.out.println(max);

    }


    static boolean isPalindrome(String str) {

        String left = "";
        String right = "";

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            left += str.charAt(i++);
            right += str.charAt(j--);
        }


        return left.equals(right);
    }


}
