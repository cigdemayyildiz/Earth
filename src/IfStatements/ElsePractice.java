package IfStatements;

import java.util.Scanner;

public class ElsePractice {

    public static void main(String[] args) {

        /* Ask user if they have driver license
        if they have print "You are great"
        if they do not hove print "You should have license before getting on the road."
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have driver license? Yes/No");
        String driverLicence = input.nextLine();

        if (driverLicence.equalsIgnoreCase("yes")){
            System.out.println("You are great!"); // if they say "Yes" or "YES" or "YEs" or "yes" result going to be "You are great!"
        }
        else { // if they say nothing or except yes result going to be "You should have license before getting on the road."
            System.out.println("You should have license before getting on the road.");
        }
    }
}
