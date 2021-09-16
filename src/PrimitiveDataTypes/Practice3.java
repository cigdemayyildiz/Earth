package PrimitiveDataTypes;

public class Practice3 {

    public static void main(String[] args) {

        /*
        Write the java program that converts given kilogram values to pounds and grams.
        Example: 8 kg
        Output: 17.64 pounds 8000 grams
        NOTE: for an approximate result of kg to pount, multiply the mass value by 2.205
        */

        int kilograms = 8;
        int grams = kilograms*1000;
        float pounds = kilograms*2.205f;


        System.out.println(kilograms + " kg is " + pounds + " pounds or " + grams + " grams.");
        // 8 kg is 17.64 pounds or 8000 grams.

    }
}
