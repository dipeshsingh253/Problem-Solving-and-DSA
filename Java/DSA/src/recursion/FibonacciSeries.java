package recursion;

public class FibonacciSeries {


    public static void main(String[] args) {

        int n = 5;

        System.out.println(fibonacciSeries(n));
        printFibonacciSeries(n);
    }

    static int fibonacciSeries(int n){

/*        if (n < 0){
            System.out.println("Invalid Input value : "+n);
            return -1;
        }*/

        if (n < 2){
            return n;
        }

        return fibonacciSeries(n-1) + fibonacciSeries(n-2);

    }

    static void printFibonacciSeries(int n){

    /*    if (n < 0){
            System.out.println("Invalid Input value : "+n);
            return;
        }*/

        if (n < 2){
            System.out.print(n +" => ");
            return;
        }
        System.out.print(n +" => ");
        printFibonacciSeries(n-1);
        printFibonacciSeries(n - 2);
    }

}


/**
 * 5 => 4 & 3
 *     4 => 3 & 2  : 2 => 1 & 0
 *         3 => 2 & 1 : 1 => 1
 *             2 => 1 & 0 : 1 => 1 && 0 => 0  
 *     3 => 2 & 1 : 1 => 1
 *         2 => 1 & 0 : 1 => 1 && 0 => 0
 *
 *  So expected output for printFS(int n) method is :
 *  Output :
 *  5 => 4 => 3 => 2 => 1 => 0 => 1 => 2 => 1 => 0 => 3 => 2 => 1 => 0 => 1
 *
 */
