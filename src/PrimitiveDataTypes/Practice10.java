package PrimitiveDataTypes;

public class Practice10 {

    public static void main(String[] args) {

        /*
        Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125 Input second number: 24 Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */

        int firstNumber = 125;
        int secondNumber = 24;

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        // 125 + 24 = 149
        System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
        // 125 - 24 = 101
        System.out.println(firstNumber + " x " + secondNumber + " = " + (firstNumber*secondNumber));
        // 125 x 24 = 3000
        System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));
        // 125 / 24 = 5
        System.out.println(firstNumber + " mod " + secondNumber + " = " + (firstNumber%secondNumber));
        // 125 mod 24 = 5

    }
}
