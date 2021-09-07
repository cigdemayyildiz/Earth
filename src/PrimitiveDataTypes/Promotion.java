package PrimitiveDataTypes;

public class Promotion {

    public static void main(String[] args) {

        int num = 60;
        byte by = 50;

        System.out.println(java.lang.Byte.MAX_VALUE); // 127
        System.out.println(java.lang.Byte.MIN_VALUE); // -128
        System.out.println(java.lang.Integer.MAX_VALUE);
        System.out.println(java.lang.Integer.MIN_VALUE);

        int sum = num+by;
        System.out.println(sum);

        byte num1 = 30;
        short num2 = 150;

        int result = num1+num2;
        System.out.println(result);

        float num3 = 12.6f; // if you do not put f, java assumed that it's double
        int num4 = 3;

        double db = num3/num4; // using float or double is ok
        System.out.println(db);

        double d = 5; // 5.0
        double v = 2; // 2.0
        double rs = d/v; // 2.5
        // double / double = double
        System.out.println(rs);

        double rs2 = 5/2; // data type is int but reference is double, that's why result looks like double but not correct
        // 5/2 --> 2 + 2 + 1 --- int / int --> int
        System.out.println(rs2);

    }
}
