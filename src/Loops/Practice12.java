package Loops;

public class Practice12 {

    public static void main(String[] args) {

        /*
        Write a program in Java to display any number in reverse order.
        Test Data :
        Input a number: 12345 (it can be any number like 5 digits or 6 digits etc)
        Expected Output :
        The number in reverse order is: 54321
         */

        int numbers = 12345;
        int reversed = 0;

        while (numbers!=0){
            int digit1 = numbers%10;
            reversed = reversed*10+digit1;
            numbers/=10;
        }
        System.out.println(reversed);

        // Second way for TASK-5

        int num = 12345;

        for (;num>0;num/=10){
            System.out.print(num%10);
        }
        System.out.println();

    }
}
