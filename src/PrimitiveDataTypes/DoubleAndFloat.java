package PrimitiveDataTypes;

public class DoubleAndFloat {

    public static void main(String[] args) {

        // float;
        // double;

        float fl1 = 6.4f; // you need to put 'f/F' to let java know that you're storing long value

        double db1 = 5.2;
        // fl1 = db1; it doesn't work bcs double data type cannot be put into float data type

        System.out.println(db1); // 5.2

        db1 = fl1;

        System.out.println(db1); // 6.40

    }
}
