package IfStatements;

import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {

        /*
        Using scanner ask user to enter any String value. If this String has the color like red or blue with
        lower case print the red or blue.
        EXAMPLE-1: Input: "xxredyy"
        Output: red
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any String value");
        String anyValue = input.nextLine().toLowerCase(); // xxredyy

        if (anyValue.contains("red")){
            System.out.println("red");
        }

    }
}
