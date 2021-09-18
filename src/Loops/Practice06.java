package Loops;

import java.util.Scanner;

public class Practice06 {

    public static void main(String[] args) {

        /*
        Using a scanner enter the number of eggs in the box. Then ask the user, how many eggs are eaten at
        the end of the day and keep asking the same question until your number of eggs is equaled to 0 in the box.
        Example:
        Input: 13
        How many eggs did you eat today? 2
        There are 11 eggs left
        How many eggs did you eat today? 5
        There are 6 eggs left
        How many eggs did you eat today? 6
        You have finished all the eggs
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs do you have?"); // 13
        int numberOfEggs = input.nextInt();

        for (;numberOfEggs>0;){
            System.out.println("How many eggs did you eat?");
            int eatenEggs = input.nextInt();
            numberOfEggs-=eatenEggs;
            System.out.println("There are " + (numberOfEggs) + " eggs left.");

        }System.out.println("You have eaten all the eggs.");



    }
}
