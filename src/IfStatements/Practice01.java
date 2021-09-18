package IfStatements;

import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        /*
        Using scanner ask user to enter to String value and concatenate them together then print the result.
        If both String length is not same then omit chars from the longer string so it is the same length as
        the shorter string. After making both string same length then concatenate it.
        EXAMPLE-1: String 1: "Cell"
        String 2: "Phone"
        Output: "CellPhon"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first String value");
        String firstWord = input.nextLine(); // Cell
        System.out.println("Please enter second Sting value");
        String secondWord = input.nextLine();  // Phone

        String concat = firstWord.concat(secondWord);
        // System.out.println(concat);

        int firstWordLength = firstWord.length(); // 4
        int secondWordLength = secondWord.length(); // 5


        if (firstWordLength > secondWordLength){
            System.out.println(firstWord.substring(0, secondWordLength)+secondWord);
        }
        if (secondWordLength > firstWordLength){
            System.out.println(firstWord+secondWord.substring(0, firstWordLength)); // CellPhon
        }
        if (firstWordLength==secondWordLength) {
            System.out.println(firstWord + secondWord);
        }

    }
}
