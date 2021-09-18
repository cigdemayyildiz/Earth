package PrimitiveDataTypes;

public class Practice07 {

    public static void main(String[] args) {

        /*
        Write a Java program to compute body mass index (BMI).
        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721
         */

        // Formula --> [weight (lb) / height (in) / height (in)] x 703

        double weightInPounds = 452;
        double heightInInches = 72;
        double bodyMessIndex = (weightInPounds/heightInInches/heightInInches)*703;
        System.out.println("Body Mess Index is " + bodyMessIndex); // Body Mess Index is 61.295524691358025

    }
}
