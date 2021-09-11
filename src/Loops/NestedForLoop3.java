package Loops;

public class NestedForLoop3 {

    public static void main(String[] args) {

        // multiplication table with nested for loop

        for (int a=1; a<=10; a++){

            for (int b=1; b<=10; b++){
                System.out.println(a + " X "+b+" = "+a*b);
            }
            System.out.println();
        }

    }
}
