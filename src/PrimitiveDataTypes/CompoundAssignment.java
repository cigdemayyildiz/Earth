package PrimitiveDataTypes;

public class CompoundAssignment {

    public static void main(String[] args) {

        int carNumber = 7;
        carNumber = carNumber + 5;
        System.out.println(carNumber); // 12

        carNumber += 12;
        System.out.println(carNumber); // 24

        carNumber /= 2;
        System.out.println(carNumber); // 12

        int payment = 50;
        System.out.println(payment);

        payment *= carNumber; // payment = payment * carNumber
        System.out.println(payment); // 600

        double myMoney = 900;
        myMoney -= payment;

        System.out.println(myMoney); // 300.0

        int num = 56;
        int num1 = 6;
        //short remainder = num%num1; --> compile time error

        float remainder = num%num1; // we didn't use 'f' after remainder because we already used a reference
        System.out.println(remainder); // 2.0

        remainder %= 2;

        System.out.println(remainder); // 0.0

    }
}
