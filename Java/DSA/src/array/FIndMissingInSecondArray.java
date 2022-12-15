package array;

import java.util.ArrayList;
import java.util.HashSet;

public class FIndMissingInSecondArray {


    public static void main(String[] args) {


    }

    static ArrayList<Long> findMissing(long[] arr1, long[] arr2, int N, int M) {

        ArrayList<Long> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            int j;
            for (j = 0; j < M; j++) {

                if (arr1[i] == arr2[j]) {
                    break;
                }


            }

            if (j == M) {
                list.add(arr1[i]);
            }

        }

        return list;


    }


    static ArrayList<Long> findMissing2(long[] arr1, long[] arr2, int N, int M) {

        ArrayList<Long> list = new ArrayList<>();

        HashSet<Long> set = new HashSet<>();

        for (long i : arr2){
            set.add(i);
        }


        for (int i = 0;i<N;i++){

            if(!set.contains(arr1[i])){
                list.add(arr1[i]);
            }

        }

        return list;


    }


}
