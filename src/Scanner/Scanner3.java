package Scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {

               /*
        Money Transaction
        David wants to deposit his money into his bank account
        -he already got $200 in his account
        -he got three different paychecks ($480, $600 and $350)
        -he can only deposit one paycheck at a time
        -after he got his money in the account
        - he bought a phone for $599 and headphone for $299
        - calculate his final money in his account and print the final amount in his account
        open a new class under scanner package and name it as "MoneyTransaction"
         */

        java.util.Scanner transaction = new java.util.Scanner(System.in);

        System.out.println("How much money you have in your account? "); // $200
        int money = transaction.nextInt();
        System.out.println("You got $" + money + " in your account"); // $200

        System.out.println("What is your deposit check amount? "); // $480
        int deposit1 = transaction.nextInt();
        System.out.println("Your deposit check amount is: $" + deposit1); // $480

        System.out.println("What is your second deposit check amount? "); // $600
        int deposit2 = transaction.nextInt();
        System.out.println("Your deposit check amount is: $" + deposit2); // $600

        System.out.println("What is your third deposit check amount? "); // $350
        int deposit3 = transaction.nextInt();
        System.out.println("Your deposit check amount is: $" + deposit3); // $350

        int balance = money+deposit1+deposit2+deposit3;
        System.out.println("Your current balance is $" + balance); // $1630

        System.out.println("What is the phone cost? "); // $599
        int phone = transaction.nextInt();
        System.out.println("Phone cost is: $" + phone); // $599

        System.out.println("What is the headphone cost? "); // $299
        int headphone = transaction.nextInt();
        System.out.println("Headphone cost is: $" + headphone); // $299

        String finalMoney = ("Your final balance is: $" + (money+deposit1+deposit2+deposit3-(phone+headphone)));

        System.out.println(finalMoney); // $732


        // other way to solve

        java.util.Scanner input = new Scanner(System.in);

        double _balance = 200;
        System.out.println("How much do you want to deposit? Please enter the amount: "); // 480
        double firstCheck = input.nextDouble();
        _balance += firstCheck;
        System.out.println("Your current balance is " + _balance);
        System.out.println("How much do you want to deposit? Please enter the amount: "); // 600
        double secondCheck = input.nextDouble();
        _balance += secondCheck;
        System.out.println("Your current balance is " + _balance);
        System.out.println("How much do you want to deposit? Please enter the amount: "); // 350
        double thirdCheck = input.nextDouble();
        _balance += thirdCheck;
        System.out.println("Your current balance is " + _balance);
        System.out.println("How much do you want to spend for phone? Please enter the amount: "); // 599
        double _phone = input.nextDouble();
        _balance -= _phone;
        System.out.println("How much do you want to spend for phone? Please enter the amount: "); // 299;
        double _headphone = input.nextDouble();
        _balance -= _headphone;
        System.out.println("Your current balance is " + _balance);

    }
}
