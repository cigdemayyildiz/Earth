package String;

public class ReplaceMethod {

    public static void main(String[] args) {

        // replace();

        java.lang.String str = "Java";
        str = str.replace('a', '$');
        System.out.println(str); // J$v$

        System.out.println(str.replace("$", "I like JAVA"));

        System.out.println(str.replace("J$v$", "I like JAVA"));

        str = str.replace('$', 'a');
        System.out.println(str);

        str = str.concat("!     ");
        System.out.println(str); // Java!
        System.out.println(str.concat("***")); // Java!     ***


    }
}
