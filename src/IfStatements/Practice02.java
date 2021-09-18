package IfStatements;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        /*
        Using scanner ask user to enter to String value and concatenate them together then print the result.
        If both String length is not same then omit chars from the longer string so it is the same length as
        the shorter string. After making both string same length then concatenate it.
        EXAMPLE-2: String 1: "Cable"
        String 2: "Mic"
        Output: "CabMic"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first String value");
        String firstWord = input.nextLine(); // Cable
        System.out.println("Please enter second Sting value");
        String secondWord = input.nextLine();  // Mic

        String concat = firstWord.concat(secondWord);
        // System.out.println(concat);

        int firstWordLength = firstWord.length(); // 5
        int secondWordLength = secondWord.length(); // 3

        if (firstWord.length()>secondWord.length()){
            System.out.println(firstWord.substring(0, secondWord.length())+secondWord); // CabMic
        } else if (secondWord.length()>firstWord.length()){
            System.out.println(firstWord+secondWord.substring(0, firstWord.length())); // null
        }

    }
}
