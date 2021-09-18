package Loops;

import java.util.Scanner;

public class Practice05 {

    public static void main(String[] args) {

        /*
        The user using a scanner enters the current speed and target speed .
        In every 1-sec car's speed will increase 10mil. Please find the total number of sec to reach
        your target speed using a while loop.
        Example:
        CurrentSpeed: 6
        Target Speed: 20
        Output: You need 2 sec to reach target speed.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter current speed"); // 6
        int currentSpeed = input.nextInt();
        System.out.println("Please enter target speed"); // 20
        int targetSpeed = input.nextInt();
        int sec = 10;

        while (currentSpeed<=targetSpeed){
            //System.out.println(currentSpeed); // 6 - 16
            currentSpeed=currentSpeed+sec;
        }
        System.out.println("You need " + currentSpeed/sec + " sec to reach target speed.");
        // You need 2 sec to reach target speed.

    }
}
