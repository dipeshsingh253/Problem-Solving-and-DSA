package recursion;


/**
 * Given two number p and q, find p^q with recursive function.
 */
public class FindPower {

    public static void main(String[] args) {

        int p = 2;
        int q = 4;

        int pow = findPower(p,q);

        System.out.println(pow);

    }

    static int findPower(int p,int q){

        if (p == 0) return 0; // power of zero

        if (q == 0) return 1; // n^0 is always 1.

        return p * findPower(p,q-1);

    }

}
