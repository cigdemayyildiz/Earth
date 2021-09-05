package PrimitiveDataTypes;

public class Short {

    public static void main(String[] args) {

        // short;

        short num1 = 127;
        short num2 = -128;
        short num3 = 12;
        short num4 = 450; // num5 = num6; compile time error since short cannot be put into byte
        short num5 = 3200; // we can change values in this line too
        num5 = num1; // we changed the value of num5, it's going to be value of num1

        System.out.println(num5); // 127

    }
}
