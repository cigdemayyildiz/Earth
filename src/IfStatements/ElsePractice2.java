package IfStatements;

import java.util.Scanner;

public class ElsePractice2 {

    public static void main(String[] args) {

        /*
        ask user to provide their zipcode and check;
        find out whether your zipcode is an even number or not
        - when zipcode is even: print "Your zipcode is an even number"
        - otherwise: print "Your zipcode is odd number"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your zipcode:");
        int zipcode = input.nextInt();

        if ((zipcode%2)==0){
            System.out.println("Your zipcode is an even number");
        }
        else {
            System.out.println("Your zipcode is odd number");
        }
    }
}
