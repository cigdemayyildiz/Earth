package PrimitiveDataTypes;

public class Practice09 {

    public static void main(String[] args) {

        /*
        Write a Java program to break an integer into a sequence of individual digits.
        Test Data
        Input five non-negative digits: 12345 Expected Output :1 2 3 4 5
         */

        int number = 12345;

        int lastDigit = number%10;
        number /= 10;

        int forthDigit = number%10;
        number /= 10;

        int thirdDigit = number%10;
        number /= 10;

        int secondDigit = number%10;
        number /= 10;

        int firstDigit = number%10;

        System.out.println(firstDigit + " " + secondDigit + " " + thirdDigit + " " + forthDigit + " " + lastDigit);
        // 1 2 3 4 5

    }
}
