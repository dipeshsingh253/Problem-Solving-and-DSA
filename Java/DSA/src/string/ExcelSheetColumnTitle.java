package string;

public class ExcelSheetColumnTitle {

    // Question Link : https://leetcode.com/problems/excel-sheet-column-title/description/


    public String convertToTitle(int n) {

        StringBuilder title = new StringBuilder();


        while (0 < n) {


            // here n%26 will provide a value always less than or equal to 26
            if (n % 26 == 0) {
                title.append("Z");
            } else {
                title.append((char) ('A' + n % 26 - 1));
            }

            // here after every column char the columnNunber will be decreased by multiple of 26

            n = (n - 1) / 26;

        }


        return title.reverse().toString();


    }


}
