package IfStatements;

import java.util.Scanner;

public class ElseIfPractice2 {

    public static void main(String[] args) {

                /*
        Biggest Number
        ask user to enter three numbers
        find the biggest number among those three entries
        print out the biggest number --> "Biggest number is: " + biggestNumber
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = input.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The biggest number is " + firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The biggest number is " + secondNumber);
        }
        else {
            System.out.println("The biggest number is " + thirdNumber);
        }

    }
}
