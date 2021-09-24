package Switch;

import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {

        /*
        Ask user
        - to enter two numbers;
        - choose a name of a math operation
                            add, subtract, multiply, divide, modulus
        - based on users math operation option
        - print the outcome

        Ex: number --> 4
            number2 --> 12
            operation is multiply
            outcome should be --> 4 * 12 = 48;
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first numbers");
        int number1 = input.nextInt();
        System.out.println("Please enter second number");
        int number2 = input.nextInt();
        System.out.println("Which math operation do you want to choose? \nadd, \nsubtract, \nmultiply, \ndivide, \nmodulus");
        String mathOperation = input.next().toLowerCase();

        switch (mathOperation){
            case ("+"):
                System.out.println(number1 + " " + mathOperation + " " + number2 + " = " + (number1 + number2));
                break;
            case "-":
                if (number1>=number2) {
                    System.out.println(number1 + " " + mathOperation + " " + number2 + " = " + (number1 - number2));
                } else {
                    System.out.println(number2 + " " + mathOperation + " " + number1 + " = " + (number2 - number1));
                }
                break;
            case "*":
                System.out.println(number1 + " " + mathOperation + " " + number2 + " = " + (number1 * number2));
                break;
            case "/":
                if (number1>=number2) {
                    System.out.println(number1 + " " + mathOperation + " " + number2 + " = " + (number1 / number2));
                }
                else {
                    System.out.println(number2 + " " + mathOperation + " " + number1 + " = " + (number2 / number1));
                }
                break;
            case "%":
                if (number1>=number2) {
                    System.out.println(number1 + " " + mathOperation + " " + number2 + " = " + (number1 % number2));
                }
                else {
                    System.out.println(number2 + " " + mathOperation + " " + number1 + " = " + (number2 % number1));
                }
                break;
        }
    }
}
