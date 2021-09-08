package Loops;

import java.util.Scanner;

public class DoWhileLoop3 {

    public static void main(String[] args) {

        /*
        Ask user to enter 2 integer numbers
        and find the total(sum) of the number in that range
        Ex: num1 --> 3
            num2 --> 7
            sum --> 3+4+5+6+7 = 25
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int number1 = input.nextInt();
        System.out.println("Please enter second number which is larger than first number:");
        int number2 = input.nextInt();

        int sum = 0;

        do {
            sum = sum+number1;
            number1++;
        }while (number1<=number2);
        System.out.print("Total is " + sum);

    }
}
