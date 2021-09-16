package IfStatements;

import java.util.Scanner;

public class NestedIfStatement2 {

    public static void main(String[] args) {

        /*
         ask user for their city name
        - if city is "chicago"
        -ask user what is the name of the school/course
        -if the school name is "techtorial"
        -tell user that "you are lucky to be in the Batch9"
        -if city is not chicago
        -tell user that "come to chcicago and visit Techtorial"
        -if the school name is not 'Techtorial"'
        -tell user that "you should visit Techtorial"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your city:");
        String city = input.nextLine();

        if (city.equalsIgnoreCase("Chicago")){

            System.out.println("What is the name of the school/course?");
            String school = input.nextLine();

            if (school.equalsIgnoreCase("Techtorial")){
                System.out.println("You're lucky to be in the Batch9");
            } else {
                System.out.println("You should visit Techtorial");
            }
        } else {
            System.out.println("Come to Chicago and visit Techtorial");
        }

    }
}
