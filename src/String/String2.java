package String;

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {

        /*
         TASK: get a string from User via scanner and:
        - print:
        - first char
        - last char
        - index of second matching letter 'c'
        - length of string
        - index of x
        - middle char
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: "); // Please enter your name: Cigdem
        java.lang.String name = scanner.nextLine();
        System.out.println("Your name is: " + name); // Your name is: Cigdem

        char first = name.charAt(0);
        System.out.println(first); // C

        char last = name.charAt(name.length()-1);
        System.out.println(last); // m

        int indexOfSecondC = name.indexOf('c', name.indexOf('c')+1);
        System.out.println(indexOfSecondC); // -1

        int length = name.length();
        System.out.println(length); // 6

        System.out.println(name.indexOf('x')); // -1

        System.out.println(name.charAt(name.length()/2)); // d

        // second way

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: "); // Please enter your name: Cigdem
        java.lang.String _name = input.nextLine();
        System.out.println("Your name is: " + _name); // Your name is: Cigdem

        char _first = _name.charAt(0);
        char _last = _name.charAt(_name.length()-1);
        int _indexOfSecondC = _name.indexOf('c',_name.indexOf('c')+1);
        int _length = _name.length();
        int _indexOfX = _name.indexOf("x");
        char _middleLetter = _name.charAt(_name.length()/2);
        System.out.println(_first); // C
        System.out.println(_last); // m
        System.out.println(_indexOfSecondC); // -1
        System.out.println(_length); // 6
        System.out.println(_indexOfX); // -1
        System.out.println(_middleLetter); // d

    }
}
