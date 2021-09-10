package IfStatements;

import java.util.Scanner;

public class IfPractice3 {

    public static void main(String[] args) {


        /*
        -Ask user to enter first letter of the day
        Ask user to enter first letter of the day
        if the letter is: M print "your day is Monday"
        if the letter is: T print "your day is Tuesday or Thursday"
        if the letter is: W print "your day is Wednesday"
        if the letter is: F print "your day is Friday"
        if the letter is: S print "your day is Saturday or Sunday"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first letter of the day:");
        String firstLetter = input.nextLine();

        if (firstLetter.toLowerCase().contains("m")){ // when you use contains method if user give you more than one letters, it's ok, your code is going to work.
            System.out.println("Your day is Monday");
        }
        if (firstLetter.toLowerCase().contains("t")){
            System.out.println("Your day is Tuesday or Thursday");
        }
        if (firstLetter.toLowerCase().startsWith("w")){ // when you use startsWith method if user give you more than one letter, it's ok, your code will work.
            System.out.println("Your day is Wednesday");
        }
        if (firstLetter.toLowerCase().charAt(0)=='f'){ // when you use charAt method if user give you more than one letter, it's ok, your code will work.
            System.out.println("Your day is Friday");
        }
        if (firstLetter.toLowerCase().equals("s")){
            System.out.println("Your day is Saturday or Sunday"); // but when you use equals method if user give you more than one letter, it's not ok, your code won't work. Because equals means given value must be exactly same with the expected.
        }

    }

}
