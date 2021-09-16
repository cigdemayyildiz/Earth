package PrimitiveDataTypes;

public class Practice5 {

    public static void main(String[] args) {

        /*
        Write a Java program to convert temperature from Fahrenheit to Celsius degree.
        Test Data
        Input a degree in Fahrenheit: 212
        Expected Output: 212.0 degree Fahrenheit is equal to 100.0 in Celsius
        */

        // formula --> (32°F − 32) × 5/9 = 0°C

        double fahrenheit = 212;
        double celsius = (fahrenheit-32)*5/9;

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius.");
        // 212.0 degree Fahrenheit is equal to 100.0 in Celsius.



    }
}
