package String;

public class ConcatMethod {

    public static void main(String[] args) {

        // concat();

        java.lang.String name = "Efe";
        java.lang.String test = "Selenium";

        test = name.concat(" is the instructor."); //
        System.out.println(test); // Efe is the instructor.
        System.out.println(name); // Efe
        System.out.println(name.concat(" is practicing java.")); // Efe is practicing java
        System.out.println(test); // Efe is practicing java.


        java.lang.String text = "David" + "Brown"; // Concatenation is when you add more String to the initial String
        System.out.println(text); // DavidBrown

        java.lang.String name1 = "David";
        java.lang.String lastName = name1;

        System.out.println(lastName); // David

        System.out.println(text + name1); // DavidBrownDavid

        System.out.println(name1 + "White"); // DavidWhite
        name1 += "White";
        System.out.println(name1); // DavidWhite

        text = name1 + "33"; // DavidWhite33
        java.lang.String result = name1 + text;

        System.out.println(result); // DavidWhiteDavidWhite33
        System.out.println(text); // DavidWhite33

        name1 = "Jessi";
        System.out.println(name1+text); // JessiDavidWhite33
        System.out.println(lastName); // David (you cannot change String, you can change only references, lastName is String)

        lastName = name1;
        System.out.println(lastName); // Jessi
        lastName = ""; // it means nothing
        System.out.println(lastName); // nothing

        java.lang.String car = null;
        System.out.println(car);


        // String is immutable, that means 'not changeable' unless you re-assigned it.

    }
}
