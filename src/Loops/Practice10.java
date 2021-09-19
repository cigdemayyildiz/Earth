package Loops;

public class Practice10 {

    public static void main(String[] args) {

        /*
        Write a Java program to check whether a given number is an armstrong number or not.
        Test Data : Input a number: 153
        Expected Output : 153 is an Armstrong number.
        NOTE:
        An Armstrong number, also known as narcissistic number, is
        a number that is equal to the sum of the cubes of its own digits. For example,
        370 is an Armstrong number since 370 = 3*3*3 + 7*7*7 + 0*0*0
         */

        int givenNumber = 153;
        int number1 = 0;
        int digit = 0;
        int ttl = 0;

        number1=givenNumber;
        while (number1>0){
            digit=number1%10;
            ttl+=digit*digit*digit;
            number1/=10;
        }
        if (ttl==givenNumber){
            System.out.println(givenNumber + " is an Armstrong number");

        }else {
            System.out.println(givenNumber + " is Not an Armstrong number");
        }
        System.out.println();

    }
}
