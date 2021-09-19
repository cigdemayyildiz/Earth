package Loops;

public class Practice11 {

    public static void main(String[] args) {

        /*
        Write a program in Java to find the prime numbers within a range of numbers.
        Test Data : Input starting number of range: 1 Input ending number of range : 50
        Expected Output :
        The prime number between 1 and 50 are :
        2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
        NOTE: you need to use the nested loop.
         */

        for (int i=1; i<=100; i++){
            int counter = 0;
            for (int j=i; j>=1; j--){
                if (i%j==0){
                    counter=counter+1;
                }
            }if (counter==2){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println();


    }
}
