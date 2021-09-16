package IfStatements;

import java.util.Scanner;

public class ElseIfStatement3 {

    public static void main(String[] args) {

        /*
        Ask user to enter his/her score from an exam
        - if score is between 90 - 100 --> print A
        - if score is between 80 - 89 --> print B
        - if score is between 70 - 79 --> print C
        - if score is between 60 - 69 --> print D
        - if score is between 0 - 59 --> print Failing grade
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score from an exam:");
        double score = input.nextDouble();

        if (score>=90 && score<=100) {
            System.out.println("Your letter grade for " + score + " is A.");

        } else if (score>=80 && score<=89) {
            System.out.println("Your letter grade for " + score + " is B.");

        } else if (score>=70 && score<=79) {
            System.out.println("Your letter grade for " + score + " is C.");

        } else if (score>=60 && score<=69) {
            System.out.println("Your letter grade for " + score + " is D.");

        } else if (score>=0 && score<60){
            System.out.println("Failing grade");
        }
        else {
            System.out.println("Your entry is not correct.");
        }

    }
}
