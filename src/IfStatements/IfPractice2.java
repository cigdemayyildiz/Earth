package IfStatements;

import java.util.Scanner;

public class IfPractice2 {

    public static void main(String[] args) {

         /*
        8 pm --> "Good evening"
        2 am --> "Good morning"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the time in this format am/pm: ");
        String time = input.nextLine();

        if (time.toLowerCase().contains("pm")){

            System.out.println("Good evening");
        }

        if (time.toLowerCase().contains("am")){

            System.out.println("Good morning");
        }

        if (!time.contains("am") && !time.contains("pm")){  // eger en basa unlem koyarsan icermiyor anlamina gelir

            System.out.println("Please check your entry format, it does not match with requirements");
        }

    }


}
