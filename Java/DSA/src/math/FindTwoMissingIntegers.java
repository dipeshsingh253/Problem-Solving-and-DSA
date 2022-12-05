package math;

import java.util.Arrays;
import java.util.Scanner;

public class FindTwoMissingIntegers {

    public static void main(String[] args) {

        //Question Link : https://www.geeksforgeeks.org/find-two-missing-numbers-set-1-an-interesting-linear-time-solution/#:~:text=We%20can%20find%20the%20first%20missing%20number%20as,integers%20%3D%20n%2A%20%28n%2B1%29%2F2%20-%20%281%2B3%2B5%2B6%29%20%3D%206


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        String[] tokens = s.split(" ");

        int[] arr = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("Input :");
        System.out.println(Arrays.toString(arr) + "=>" + n);

        System.out.println("Output :");
        findTwoMissingUsingSumOfNumbers(arr, n);

    }


    private static void findTwoMissingUsingSumOfNumbers(int[] arr, int n) {

        int sum = n * (n + 1) / 2;
        int sumSquare = (n * (n + 1) * (2 * n + 1)) / 6;

        int arrSum = 0;
        int arrSquareSum = 0;

        for (int i : arr) {
            arrSum += i;
            arrSquareSum += i * i;
        }

        int missingSum = sum - arrSum;
        int missingSquareSum = sumSquare - arrSquareSum;

        int productOfMissing = ((missingSum * missingSum) - missingSquareSum) / 2;

        int missingSubstract = (int) Math.sqrt(productOfMissing);

        int firstMissing = (missingSum - missingSubstract) / 2;
        int secondMissing = (missingSum + missingSubstract) / 2;

        System.out.println(firstMissing + " " + secondMissing);


    }

    private static void findMissingUsingSumOfNaturalNumbers(int[] arr, int n) {

        int sum = n * (n + 1) / 2;

        int arraySum = provideSum(arr);

        int sumOfMissing = sum - arraySum;

        int averageOfMissing = sumOfMissing / 2;

        int arraySumBelowAvg = provideSum(arr, averageOfMissing);

        int sumAvg = averageOfMissing * (averageOfMissing + 1) / 2;

        int firstMissing = sumAvg - arraySumBelowAvg;

        int secondMissing = sumOfMissing - firstMissing;

        System.out.println(firstMissing + " " + secondMissing);


    }

    private static int provideSum(int[] arr, int averageOfMissing) {
        int sum = 0;

        for (int i : arr) {

            if (sum <= averageOfMissing) {
                sum += i;
            }

        }

        return sum;


    }

    private static int provideSum(int[] arr) {

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }


}
