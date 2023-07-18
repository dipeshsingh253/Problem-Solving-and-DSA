package recursion;

public class PrintKMultiplesOfN {

    public static void main(String[] args) {

        int num = 3;
        int k = 8;

        printKMultiplesOfN(num,k,1);
        printKMultiplesOfN(num,k);


    }

    static void printKMultiplesOfN(int num,int k,int curr){

        if( k == 0 ){
            return;
        }

        System.out.println(num*curr);

        printKMultiplesOfN(num,--k,++curr);

    }

    static void printKMultiplesOfN(int num,int k){


        if( k == 0) return; // k is always greater than 0.

        printKMultiplesOfN(num,k-1);
        System.out.println(num*k);
    }


}
