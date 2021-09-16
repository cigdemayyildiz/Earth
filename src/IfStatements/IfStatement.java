package IfStatements;

public class IfStatement {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int c = 10;

        if (a==b){

            System.out.println("You can go to a picnic");

        }

        if (a == c){

            System.out.println("This is second option for the picnic");

        }

        if (a == b || a != c){ // condition is true, it means it will go in the block

            System.out.println("Yaaaaaay!, I am going to the picnic");

        }

        System.out.println("I'll be happy");

    }
}
