package Loops;

import java.util.Scanner;

public class Practice04 {

    public static void main(String[] args) {

        /*
        Using the scanner ask the user to provide String value. Then replace all the char of the String
        with 'a' using loop and print in every step.
        For example: Input: Success
        Output: "auccess"
        "aaccess"
        “aaacess”
        ...
        “aaaaaaa”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String value"); // Success
        String value = input.nextLine();
        String str = "";

        for (int i=0, k=1; i<value.length(); i++, k++){
            str+="a";
            System.out.println(str+value.substring(k));
        }

    }
}
