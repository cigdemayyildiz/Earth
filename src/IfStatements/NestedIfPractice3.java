package IfStatements;

import java.util.Scanner;

public class NestedIfPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you know Java?");
        String java = input.next();

        if (java.equalsIgnoreCase("yes")){
            System.out.println("Do you know Selenium?");
            String selenium = input.next();
            if (selenium.equalsIgnoreCase("yes")){
                System.out.println("Do you know API?");
                String api = input.next();
                if (api.equalsIgnoreCase("yes")){
                    System.out.println("Do you know SQL?");
                    String sql = input.next();
                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("Great! You are HIRED!");
                    } else {
                        System.out.println("We are looking for someone who knows SQL.");
                    }
                } else {
                    System.out.println("We are looking for someone who API.");
                }
            } else {
                System.out.println("We are looking for someone who knows Selenium.");
            }
        }
        else {
            System.out.println("We are looking for someone who knows Java.");
        }
    }
}
