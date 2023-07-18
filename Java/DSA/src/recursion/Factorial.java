package recursion;

public class Factorial {


    public static void main(String[] args) {

        int n = 5;

        int fact = factorialOfN(n);
        System.out.println(fact);
    }
    static int factorialOfN(int n){

        if(n < 0){
            System.out.println("Invalid input value : "+n);
            return -1;
        }

        if(n <= 1) return 1;

        return n * factorialOfN(n-1);


    }

}
