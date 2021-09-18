package IfStatements;

public class Practice04 {

    public static void main(String[] args) {

        /*
        Given a string, if one or both of the first 2 chars is 'x', print the string without those 'x' chars,
        and otherwise print the string unchanged.
        "xHi" "Hi"
        "Hxi" "Hi"
         */

        String str1 = "xHi";
        String str2 = "Hxi";

        if (str1.charAt(0)=='x'){
            System.out.println(str1.substring(1)); // Hi
        }
        if (str2.charAt(1)=='x'){
            System.out.println(str2.substring(0,1).concat(str2.substring(2))); // Hi
        }

    }
}
