package Loops;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        /*
        Using a scanner ask the user to provide starting and ending numbers.
        Print the numbers divisible by 3 and 5 between given number AND print count of
        those numbers which is divisible by 3 and 5.
        EXAMPLE:
        First number: 5
        Second number: 65
        Output:
        15
        30
        45
        60
        Total number that divisible by 3 and 5 is 4.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the starting number");
        int startingNumber = input.nextInt();
        System.out.println("Please enter the ending number");
        int endingNumber = input.nextInt();

        int sum = 0;

        for (;startingNumber<endingNumber;startingNumber++){
            if (startingNumber%3==0 && startingNumber%5==0)
                System.out.println(startingNumber);
            for (;startingNumber>endingNumber;endingNumber++){
                if (endingNumber%3==0 && endingNumber%5==0){
                    System.out.println(endingNumber);
                }
            }
        }

    }
}
