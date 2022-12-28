package oops;

import java.util.Arrays;
import java.util.Comparator;

public class ClassForSorting {

    class sorter_class {
        // complete the class as mentioned in the problem statemenent above

        void sort(String[] arr) {

            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            });

        }

        void sort(int[] arr) {


            Arrays.sort(arr);

        }

        void sort(char[] arr) {

            Arrays.sort(arr);

        }

        void sort(boolean[] arr) {
            int count = 0;

            for (boolean b : arr) {
                if (b) count++;
            }


            for (int i = 0; i < arr.length; i++) {
                if (count > 0) {
                    arr[i] = true;
                    count--;
                } else {
                    arr[i] = false;
                }
            }

        }


    }


}
