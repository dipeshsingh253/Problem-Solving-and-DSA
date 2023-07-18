package recursion;

/**
 * In this question we will pass an integer n. it will print values from 1...to n in increasing order.
 * For assignment or practice purpose you can tru to print it in decreasing order.
 */
public class PrintIncreasing {

    public static void main(String[] args) {

        printIncreasing(5);
        printDecreasing(5);
    }


    static void printIncreasing(int n){
        if(n == 0)return;

        printIncreasing(n-1);
        System.out.print(n+" ");
    }


    static void printDecreasing(int n){
        if(n == 0)return;

        System.out.print(n+" ");
        printDecreasing(n-1);
    }

}
