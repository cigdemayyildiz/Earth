package Loops;

public class Practice08 {

    public static void main(String[] args) {

        /*
        Write a program in Java to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.
        Test Data :
        Input the number of terms : 5
        Expected Output :
        1 + 11 + 111 + 1111 + 11111
        The Sum is : 12345
         */

        int terms = 5;
        int sum = 0;

        for (int i=1, j=1; i<=terms; i++){
            sum+=j;
            // I need to do something different in the last iteration
            if (i==terms){
                System.out.println(j);
            }else {
                System.out.print(j+" + "); // 1 + 11 + 111 + 1111 + 11111
            }
            j=(j*10)+1;
        }
        System.out.println("The sum is: " + sum); // The sum is: 12345
        System.out.println();

    }
}
