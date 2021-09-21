package String;

public class LengthMethod {

    public static void main(String[] args) {

        // length(); method --> it will give count of letters from given String

        java.lang.String name = "Efe";
        java.lang.String test = "Selenium";

        int letterCount = name.length();
        System.out.println(letterCount); // 3

        System.out.println(name.length()); // 3

        System.out.println(test.length()); // 8

    }
}
