package PrimitiveDataTypes;

public class Practice12 {

    public static void main(String[] args) {

        /*
        Bob’s company following the formula to calculate the annual bonus amount.
        Bob is earning 200K a year. The company is applying a 5 percent bonus for 50 percent of the salary,
        8 percent bonus for 30 percent of the salary, and finally 10 percent of bonus 20 percent of the salary.
        Write the code to calculate the bonus amount for Bob. If I want to calculate the bonus amount for another
        person, I should be able to change the salary and it should display the bonus amount.
         */

        double salaryOfBob = 200000;

        double totalBonus = (((salaryOfBob/2)*.05)+((salaryOfBob*.30)*.08)+((salaryOfBob*.20)*.10));

        System.out.println("Bob's total annual bonus is $" + totalBonus);
        // Bob's total annual bonus is $13800.0

    }
}
