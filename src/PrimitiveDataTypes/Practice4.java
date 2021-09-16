package PrimitiveDataTypes;

public class Practice4 {

    public static void main(String[] args) {

        /*
        Write the java program that converts given meter values to the foot and centimeter.
        Example: 6 meter
        Output: 19.686 foot 600 centimeter
        NOTE: for an approximate result of Meter to foot, multiply the length value by 3.281
         */

        int meter = 6;
        int centimeter = meter*100;
        double foot = meter*3.281;

        System.out.println(meter + " meter is " + foot + " foot or " + centimeter + " centimeter.");
        // 8 kg is 17.64 pounds or 8000 grams.

    }
}
