package IfStatements;

public class NestedIfPractice {

    public static void main(String[] args) {

        boolean passport = false;
        boolean visa = true;
        boolean ticket = true;

        if (passport) {

            if (visa){

                if (ticket){
                    System.out.println("Good news, you can fly to your destination.");

                } else {

                    System.out.println("You should have ticket!");
                }

            } else {
                System.out.println("You should have visa!");
            }
        } else if (!passport){
            System.out.println("You should get a passport first!");
        }

    }
}
