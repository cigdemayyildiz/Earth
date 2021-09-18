package IfStatements;

public class Practice05 {

    public static void main(String[] args) {

        /*
        Given a string, if a length 2 substring appears at both its beginning and end, print a string without
        the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself,
        so "Hi" yields "". Otherwise, print the original string unchanged.
        Example: "TestTe" --> print stTe
         */

        String str3 = "TestTe";
        String str4 = "Hi";

        if (str3.length()>=2){
            System.out.println(str3.substring(2)); // stTe
        }
        if (str4.length()>=2){
            System.out.println(str4.substring(2)); // null
        }
        System.out.println("***");

    }
}
