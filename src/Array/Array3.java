package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {

        /*
        TASK: Ask user to enter how many names of people to store
        -store them in an String Array
        if the name is longer than 5 chars store it in --> longNames array
        otherwise store it in
        --> shortNames array
        -print out by using toString method
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many names of people to store?");
        int size = input.nextInt();

        String[] longNames = new String[size];
        String[] shortNames = new String[size];

        for (int i=0; i<size; i++){
            System.out.println("Please enter " + (i+1) + ".name");
            String name = input.next();
            if (name.length()<5){
                shortNames[i]=name;
            }
            else {
                longNames[i]=name;

            }
        }
        System.out.println("Short names: " + Arrays.toString(shortNames));
        System.out.println("Long names: " + Arrays.toString(longNames));

    }
}
