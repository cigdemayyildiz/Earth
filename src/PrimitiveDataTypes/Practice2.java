package PrimitiveDataTypes;

public class Practice2 {

    public static void main(String[] args) {

        /*
        Using java calculate the person's body mass index and print the result with different examples.
        NOTE: Body Mass Index is a simple calculation using a person's height and weight. The formula is
        BMI = kg/m2 where kg is a person's weight in kilograms and m2 is their height in metres squared.
         */

        int myWeight = 52;
        float myHeight = 1.65f;

        float myBMI = myWeight/(myHeight*myHeight);

        System.out.println("My BMI = " + myBMI); // My BMI = 19.100094

    }
}
