package PrimitiveDataTypes;

public class Char {

    public static void main(String[] args) {

        char letter = 'A'; // use single quote
        System.out.println(letter);

        char numberChar = '9';
        System.out.println(numberChar);

        int x = letter;
        System.out.println(x);

        double y = letter;
        System.out.println(y);

        char ch1 = 9;
        System.out.println(ch1); // it will show nothing because 9 means "tab" in the ascii table

        char ch2 = 95;
        System.out.println(ch2); // it will show underscore because 95 means "underscore" in the ascii table

        int c = 'E';
        System.out.println(c); // it means call the value of the c from the ascii table 69
        System.out.println('E'); // this is going to show E

    }
}
