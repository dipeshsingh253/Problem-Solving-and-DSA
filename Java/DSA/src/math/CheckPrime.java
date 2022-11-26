package math;




import java.util.Scanner;

public class CheckPrime {

    public static void main(String[] args) {
//Question Link : https://practice.geeksforgeeks.org/problems/prime-number2314/1
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(checkPrime(n));

    }


    public static boolean checkPrime(int n){
//        in this approach we will deal with a few numbers such as 1, 2, 3, and the numbers which are divisible by
//        2 and 3 in separate cases and for remaining numbers, we will iterate our loop from 5 to sqrt(n) and check for each
//        iteration whether that  (iteration) or (that iteration + 2) divides n or not. If we find any number that divides, we return
//        false.

        if(n<2){
            return false;
        }

//        for(int i=2;i*i<=n;i++){
//            if (n%i==0){
//                return false;
//            }
//        }


        for(int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }

        return true;

    }


}
