package Loops;

import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {

        /*
        Using scanner ask user to provide the string value. Print "dad" if the given string contains the "dad", but where the middle 'a' char can be any char.
        Example:
        Input the year: testdadtest Output :dad
        Input the year: testd7dtest Output :dad
        Input the year: testdodtest Output :dad
        Input the year: testDudtest Output :dad
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a random String value ");
        String random = input.nextLine();

        if (random.charAt((random.length()/2)+1) == 'd' && random.charAt((random.length()/2)-1) == 'd') {
            System.out.println("dad");

        }

    }
}
