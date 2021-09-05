package PrimitiveDataTypes;

public class Long {

    public static void main(String[] args) {

        // long;

        long num1 = 127;
        long num2 = -128;
        long num3 = 12;
        long num4 = 450;
        long num5 = num5 = num1;
        long num7 = num1+num5;
        long num8 = 5678912345l; // if value is bigger than integer you need to add (l/L) at the end of the value
        long num9 = 2_147_483_647; //this value is between the excepted value of long
        long num10 = 2_127_483_648l; // this value isn't between the excepted value of long, use (l) at the end of value

        System.out.println(num9);
        System.out.println(num10);

    }
}
