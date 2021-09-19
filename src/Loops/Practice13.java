package Loops;

public class Practice13 {

    public static void main(String[] args) {

        /*
        Write a program in Java to check whether a String is a palindrome or not.
        Test Data :
        Input a number: Civic
        Expected Output :
        Civic is palindrome
        NOTE:
        A string is said to be a palindrome if the string read from left to right is equal to the string
        read from right to left. For example, ignoring the difference between uppercase and lowercase letters,
        the string "iTopiNonAvevanoNipoti" is a palindrome,
         */

        String word = "Civic";
        String newWord = "";

        for (int i=word.length()-1; i>=0; i-- ){
            newWord+=word.charAt(i);
        }if (word.equalsIgnoreCase(newWord)){
            System.out.println(newWord+" is a palindrome");
        }else {
            System.out.println(newWord+" is not a palindrome");
        }
        System.out.println();

    }
}
