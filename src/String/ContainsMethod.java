package String;

import java.util.Scanner;

public class ContainsMethod {

    public static void main(String[] args) {


        // contains(); return true or false

        java.lang.String school = "Techtorial Academy";

        System.out.println(school.contains("e")); // true
        System.out.println(school.contains("u")); // false
        System.out.println(school.contains("C")); // false
        System.out.println(school.contains("c")); // true
        System.out.println(school.contains(" ")); // true
        System.out.println(school.contains("")); // true
        System.out.println(school.contains("ial")); // true
        System.out.println(school.contains("l A")); // true
        System.out.println(school.contains("Techtorial Academy ")); // false

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
