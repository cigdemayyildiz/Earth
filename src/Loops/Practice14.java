package Loops;

public class Practice14 {

    public static void main(String[] args) {

        /*
        Write a program in Java to make such a pattern like a pyramid with numbers increased by 1.
        For this task ask the user to enter a number of the line.
        Example:
        Please enter line number: 4
        Expected output:
        1
        23
        456
        7 8 9 10
        NOTE: You need to use the nested loop
         */

        int lines = 4;
        int number = 1;

        for (int a = 1; a <= lines ; a++){

            for (int b = 1; b <= a; b++){
                System.out.print(number+" ");
                ++number;
            }
            System.out.println();
        }

    }
}
