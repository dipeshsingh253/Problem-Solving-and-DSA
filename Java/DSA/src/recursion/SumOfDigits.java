package recursion;

public class SumOfDigits {

    public static void main(String[] args) {

        int number = 8534;

        int sum = sumOfDigits(number);

        System.out.println(sum);

    }


    static int sumOfDigits(int number){

        if(number < 10)
            return number;

        int digit = number % 10;
        number /= 10;

        return digit + sumOfDigits(number);

    }

}
