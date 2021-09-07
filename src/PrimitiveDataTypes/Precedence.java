package PrimitiveDataTypes;

public class Precedence {

    public static void main(String[] args) {

        int count = 10+15;
        int count1 = 10+3*5; // first multiplication after addiction

        System.out.println("count " + count);
        System.out.println("count1 " + count1);

        int count2 = 4-2*4/2-1+5;

        System.out.println("count2 " + count2);

        int count3 = 6/3*5%3;
        System.out.println("count3 " + count3);

        int count4 = 6+4-count+count3;
        System.out.println("count4 " + count4);

        double taxAmount = 20 * .1 + 500 * .2 + 30 * .07; // .1 means %10, .2 means %20, .07 means %7.
        System.out.println("correct tax amount " + taxAmount);

        double taxAmount1 = (20 * (.1 + 500) * .2 + 30) * .07; // if you use parenthesis, result will change
        System.out.println("wrong tax amount " + taxAmount1);

        double taxAmount3 = (20 * .1) + (500 * .2) + (30 * .07); // if you want to use parenthesis, this is correct using
        System.out.println("correct using parenthesis " + taxAmount3);

    }
}
