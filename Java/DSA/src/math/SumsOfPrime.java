package math;

import java.util.Scanner;

public class SumsOfPrime {

    public static void main(String[] args) {
//Question Link : https://practice.geeksforgeeks.org/problems/primes-sum5827/1
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(isSumOfPrimes(n));



    }

    public static boolean isSumOfPrimes(int n){

        /*
        odd => sum of (even,odd)
        even => sum of (even,even) or sum of (odd, odd)

        now if we want to check whether given is sum of two primes or not
        so if the given number is even then we have to check that is there any two even prime number or odd prime numbers exists who
        sum up to given number or not

        in that case, 2 is only one even prime number it means only 4 can be satisfied with sum of two even primes condition
        if we talk about sum of odd then we will have to check it using a loop we can run the loop for <n times but it is about sums we will start getting duplicate results after
        a point of time so to avoid that duplicates we can run our loop till <n/2

        now talking about if the given number is odd then we have to find an even prime number and an odd prime number and check if they
        sum up to given number
         */

        if(n%2==1){
            if(isPrime(n-2)){
                return true;
            }else {
                return false;
            }
        }else {

            if (n==4){
                return true;
            }

            for (int i=3;i<=n/2;i+=2){

                if (isPrime(i) && isPrime(n-i)){
                    return true;
                }

            }

            return false;

        }





    }


    public static boolean isPrime(int n){

        if(n<2) return false;

        for (int i=2;i*i<=n;i++){

            if (n%i==0)
                return false;


        }
        return  true;

    }

}
