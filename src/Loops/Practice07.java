package Loops;

import java.util.Scanner;

public class Practice07 {

    public static void main(String[] args) throws InterruptedException {

        /*
        Using a scanner ask the user to input username and password. Create the two variables for the
        expected username and password. if user input is not matching with the expected username and
        password ask the user again until they are correct. (Optional: if you want to make it a little
        complicated. You can allow the user only three times to enter the wrong username or password.
        If it is more than 3 times you can print “your account is on hold now. Try after 5 min”)
         */

        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Please enter the user name");
        String userName = input.nextLine();
        System.out.println("Please enter the password");
        String password = input.nextLine();
        boolean isLoginInfoMatch = false;
        int loginCount = 0;

        do {
            System.out.println("Enter your user name");
            String actualUserName = input.nextLine();
            System.out.println("Enter your password");
            String actualPassword = input.nextLine();
            isLoginInfoMatch = !(actualUserName.equalsIgnoreCase(userName) && actualPassword.equalsIgnoreCase(password));
            loginCount++;
            if (loginCount > 3) {
                System.out.println("Your account is on hold for 5 min! Try after 5 min.");
                Thread.sleep(5000);
                loginCount = 0;
            }
        }while (isLoginInfoMatch) ;
        System.out.println("Congrats you successfully login.");

    }
}
