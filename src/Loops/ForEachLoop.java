package Loops;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        String [] colors = {"red", "blue", "green", "yellow", "brown", "orange", "white", "purple", "gray", "pink", "violet", "black"};

        // for each loop --> it will start from beginning of the array and go to the end of it

        Arrays.sort(colors);
        for (String color: colors){
            System.out.println(color);
        }

    }
}
