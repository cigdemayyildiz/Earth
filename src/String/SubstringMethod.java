package String;

public class SubstringMethod {

    public static void main(String[] args) {

        // subString(); return (giving back) String (partial String)

        java.lang.String string = "computer";

        java.lang.String substring1 = string.substring(5); // it will return 'ter'

        System.out.println(substring1);

        java.lang.String part = string.substring(0, 2);
        System.out.println(part); // co

        java.lang.String email = "    Techtorial@gmail.com    "; // zak@gmail.com     abcd@gmail.com

        java.lang.String part1 = email.substring(email.indexOf("@"));
        System.out.println(part1);



    }
}
