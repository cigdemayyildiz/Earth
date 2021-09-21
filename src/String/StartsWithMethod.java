package String;

import java.util.Scanner;

public class StartsWithMethod {

    public static void main(String[] args) {

        // startsWith(); return true or false

        java.lang.String school = "Techtorial Academy";

        System.out.println(school.startsWith("T")); // true
        System.out.println(school.startsWith("Techtorial")); // true
        System.out.println(school.startsWith("tech")); // false because it starts lower case t
        System.out.println(school.startsWith("Techtorial Academy")); // true
        System.out.println(school.startsWith("TechtorialAcademy")); // false
        System.out.println(school.startsWith("e")); // false

        /*
        Task
        By using scanner ask user to provide his/her gender, full name and birth year in the following format
         F - Jenny Brown - 1999
         - Check if the input String is starting with F
         - Check if the input String is starting with M
         - Check if the input String is containing your name
         - Check if the input String is ending with birth year
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your gender");
        java.lang.String gender = input.nextLine(); // F
        System.out.println("Please enter your full name");
        java.lang.String fullName = input.nextLine(); // Cigdem Ayyildiz
        System.out.println("Please enter birth year");
        java.lang.String birthYear = input.next(); // 1988
        java.lang.String format = (gender + " - " + fullName + " - " + birthYear);
        System.out.println(format); // F - Cigdem Ayyildiz - 1988
        System.out.println(format.startsWith("F")); // true
        System.out.println(format.startsWith("M")); // false
        System.out.println(format.contains("Cigdem")); // true
        System.out.println(format.endsWith("1983")); // true


    }
}
