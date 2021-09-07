package PrimitiveDataTypes;

public class Remainder {

    public static void main(String[] args) {

        public static void main(String[] args) {

        /*
        find the sum of the digits from a given number
        Ex: 123 --> 1+2+3 = 6 so, print this sum
         */

            int number = 123;

            // 123 / 10 = 3 --> remainder (result is 12, remainder is 3)
            int digit1 = number%10; // 3
            System.out.println(digit1);

            number = number/10; // after int digit1
            System.out.println(number);

            // 12 / 10 = 2 --> remainder (result is 1, remainder is 2)
            int digit2 = number%10; // 2
            System.out.println(digit2);

            number = number/10; // after int digit2
            System.out.println(number);

            // 1 / 10 = 1 --> remainder (result is 0, remainder is 1)
            int digit3 = number%10; // 1
            System.out.println(digit3);

            int sum = digit1 + digit2 + digit3;
            System.out.println("Total of digits is " + sum + ".");

    }
}
