package PrimitiveDataTypes;

public class NumericPromotion {

    public static void main(String[] args) {

        byte b1 = 12;
        short sh1 = 30;

        System.out.println(b1+sh1); // if you create your print out like this(without reference), it's OK, it works

        // byte sum = b1+sh1; --> compile time error
        // short sum = b1+sh1; --> compile time error

        int sum = b1+sh1;
        System.out.println(sum);

        float fl = 3.4f;
        double db = 2.5;

        System.out.println(fl+db); // if you create your print out like this(without reference), it's OK, it works

        // float sum1 = fl+db; --> compile time error

        double sum1 = fl + db;
        System.out.println(sum1);

        int num = 45;
        double db2 = 9.2;

        System.out.println(num/db2); // if you create your print out like this(without reference), it's OK, it works

        // int sum2 = num/db2; --> compile time error

        double total = num/db2;
        System.out.println(total);

    }
}
