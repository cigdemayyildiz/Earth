package Scanner;

import java.util.Scanner;

public class Scanner2 {

    public static void main(String[] args) {

        // taking char by using Scanner

        java.util.Scanner input = new Scanner(System.in);

        System.out.println("Please enter your city name: "); // TEXAS
        char firstLetter = input.next().charAt(0); // indexing in java starts from zero
        System.out.println("The first letter of your city is: " + firstLetter); // T
        System.out.println("Please enter your city name: ");
        char secondLetter = input.next().charAt(1);
        System.out.println("The second letter of your city is: " + secondLetter); // E

    }
}
