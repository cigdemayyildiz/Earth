package Loops;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        /*
        Using Scanner ask user to provide any int number and print multiplication table of given number
        Input number: 5 Output : 5*1=5
        5 * 2 = 10
        5 * 3 = 15 ...
        ...
        5*10 = 50
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = input.nextInt();

        int multiplier = 1;

        while (multiplier<=10){
            System.out.println(number + " X " + multiplier + " = " + number*multiplier);
            multiplier++;
        }

    }
}
