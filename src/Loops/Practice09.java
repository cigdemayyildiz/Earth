package Loops;

public class Practice09 {

    public static void main(String[] args) {

        /*
        Write a Java program to find the perfect numbers within a given number of range.
        Test Data :
        Input the starting range or number : 1 Input the ending range of number : 50
        Expected Output :
        The Perfect numbers within the given range : 6 28
        NOTE: you need to use the nested loop.
         */

        // Perfect number is the number sum of all divisors equal to number.
        // We need to find all divisor of the given number.
        // Then we will find the sum of them
        // Lastly we will check if it equals to given number.
        // We need to use modulus
        // We need to check numbers that are smaller than given number

        int summ =0;
        for (int a=1;a<=50;a++){
            //a is the current number we should check if it is a perfect number
            summ=0;
            // this second for loop will find all the divisors
            for (int b=1;b<=a;b++){ // b --> divisors
                if (a%b==0){
                    summ=summ+b; // we found all divisors with this code
                }if (a*2==summ){
                    System.out.println("The perfect number is "+ a);
                }
            }
        }
        System.out.println();

    }
}
